package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopProductController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopProduct.list(params), model:[nideshopProductInstanceCount: NideshopProduct.count()]
    }

    def show(NideshopProduct nideshopProductInstance) {
        respond nideshopProductInstance
    }

    def create() {
        respond new NideshopProduct(params)
    }

    @Transactional
    def save(NideshopProduct nideshopProductInstance) {
        if (nideshopProductInstance == null) {
            notFound()
            return
        }

        if (nideshopProductInstance.hasErrors()) {
            respond nideshopProductInstance.errors, view:'create'
            return
        }

        nideshopProductInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopProduct.label', default: 'NideshopProduct'), nideshopProductInstance.id])
                redirect nideshopProductInstance
            }
            '*' { respond nideshopProductInstance, [status: CREATED] }
        }
    }

    def edit(NideshopProduct nideshopProductInstance) {
        respond nideshopProductInstance
    }

    @Transactional
    def update(NideshopProduct nideshopProductInstance) {
        if (nideshopProductInstance == null) {
            notFound()
            return
        }

        if (nideshopProductInstance.hasErrors()) {
            respond nideshopProductInstance.errors, view:'edit'
            return
        }

        nideshopProductInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopProduct.label', default: 'NideshopProduct'), nideshopProductInstance.id])
                redirect nideshopProductInstance
            }
            '*'{ respond nideshopProductInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopProduct nideshopProductInstance) {

        if (nideshopProductInstance == null) {
            notFound()
            return
        }

        nideshopProductInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopProduct.label', default: 'NideshopProduct'), nideshopProductInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopProduct.label', default: 'NideshopProduct'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
