package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopFootprintController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopFootprint.list(params), model:[nideshopFootprintInstanceCount: NideshopFootprint.count()]
    }

    def show(NideshopFootprint nideshopFootprintInstance) {
        respond nideshopFootprintInstance
    }

    def create() {
        respond new NideshopFootprint(params)
    }

    @Transactional
    def save(NideshopFootprint nideshopFootprintInstance) {
        if (nideshopFootprintInstance == null) {
            notFound()
            return
        }

        if (nideshopFootprintInstance.hasErrors()) {
            respond nideshopFootprintInstance.errors, view:'create'
            return
        }

        nideshopFootprintInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopFootprint.label', default: 'NideshopFootprint'), nideshopFootprintInstance.id])
                redirect nideshopFootprintInstance
            }
            '*' { respond nideshopFootprintInstance, [status: CREATED] }
        }
    }

    def edit(NideshopFootprint nideshopFootprintInstance) {
        respond nideshopFootprintInstance
    }

    @Transactional
    def update(NideshopFootprint nideshopFootprintInstance) {
        if (nideshopFootprintInstance == null) {
            notFound()
            return
        }

        if (nideshopFootprintInstance.hasErrors()) {
            respond nideshopFootprintInstance.errors, view:'edit'
            return
        }

        nideshopFootprintInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopFootprint.label', default: 'NideshopFootprint'), nideshopFootprintInstance.id])
                redirect nideshopFootprintInstance
            }
            '*'{ respond nideshopFootprintInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopFootprint nideshopFootprintInstance) {

        if (nideshopFootprintInstance == null) {
            notFound()
            return
        }

        nideshopFootprintInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopFootprint.label', default: 'NideshopFootprint'), nideshopFootprintInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopFootprint.label', default: 'NideshopFootprint'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
