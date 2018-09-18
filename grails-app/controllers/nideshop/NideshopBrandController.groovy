package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopBrandController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopBrand.list(params), model:[nideshopBrandInstanceCount: NideshopBrand.count()]
    }

    def show(NideshopBrand nideshopBrandInstance) {
        respond nideshopBrandInstance
    }

    def create() {
        respond new NideshopBrand(params)
    }

    @Transactional
    def save(NideshopBrand nideshopBrandInstance) {
        if (nideshopBrandInstance == null) {
            notFound()
            return
        }

        if (nideshopBrandInstance.hasErrors()) {
            respond nideshopBrandInstance.errors, view:'create'
            return
        }

        nideshopBrandInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopBrand.label', default: 'NideshopBrand'), nideshopBrandInstance.id])
                redirect nideshopBrandInstance
            }
            '*' { respond nideshopBrandInstance, [status: CREATED] }
        }
    }

    def edit(NideshopBrand nideshopBrandInstance) {
        respond nideshopBrandInstance
    }

    @Transactional
    def update(NideshopBrand nideshopBrandInstance) {
        if (nideshopBrandInstance == null) {
            notFound()
            return
        }

        if (nideshopBrandInstance.hasErrors()) {
            respond nideshopBrandInstance.errors, view:'edit'
            return
        }

        nideshopBrandInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopBrand.label', default: 'NideshopBrand'), nideshopBrandInstance.id])
                redirect nideshopBrandInstance
            }
            '*'{ respond nideshopBrandInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopBrand nideshopBrandInstance) {

        if (nideshopBrandInstance == null) {
            notFound()
            return
        }

        nideshopBrandInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopBrand.label', default: 'NideshopBrand'), nideshopBrandInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopBrand.label', default: 'NideshopBrand'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
