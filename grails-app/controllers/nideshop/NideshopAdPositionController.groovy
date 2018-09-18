package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAdPositionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAdPosition.list(params), model:[nideshopAdPositionInstanceCount: NideshopAdPosition.count()]
    }

    def show(NideshopAdPosition nideshopAdPositionInstance) {
        respond nideshopAdPositionInstance
    }

    def create() {
        respond new NideshopAdPosition(params)
    }

    @Transactional
    def save(NideshopAdPosition nideshopAdPositionInstance) {
        if (nideshopAdPositionInstance == null) {
            notFound()
            return
        }

        if (nideshopAdPositionInstance.hasErrors()) {
            respond nideshopAdPositionInstance.errors, view:'create'
            return
        }

        nideshopAdPositionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAdPosition.label', default: 'NideshopAdPosition'), nideshopAdPositionInstance.id])
                redirect nideshopAdPositionInstance
            }
            '*' { respond nideshopAdPositionInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAdPosition nideshopAdPositionInstance) {
        respond nideshopAdPositionInstance
    }

    @Transactional
    def update(NideshopAdPosition nideshopAdPositionInstance) {
        if (nideshopAdPositionInstance == null) {
            notFound()
            return
        }

        if (nideshopAdPositionInstance.hasErrors()) {
            respond nideshopAdPositionInstance.errors, view:'edit'
            return
        }

        nideshopAdPositionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAdPosition.label', default: 'NideshopAdPosition'), nideshopAdPositionInstance.id])
                redirect nideshopAdPositionInstance
            }
            '*'{ respond nideshopAdPositionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAdPosition nideshopAdPositionInstance) {

        if (nideshopAdPositionInstance == null) {
            notFound()
            return
        }

        nideshopAdPositionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAdPosition.label', default: 'NideshopAdPosition'), nideshopAdPositionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAdPosition.label', default: 'NideshopAdPosition'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
