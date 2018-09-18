package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopOrderController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopOrder.list(params), model:[nideshopOrderInstanceCount: NideshopOrder.count()]
    }

    def show(NideshopOrder nideshopOrderInstance) {
        respond nideshopOrderInstance
    }

    def create() {
        respond new NideshopOrder(params)
    }

    @Transactional
    def save(NideshopOrder nideshopOrderInstance) {
        if (nideshopOrderInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderInstance.hasErrors()) {
            respond nideshopOrderInstance.errors, view:'create'
            return
        }

        nideshopOrderInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopOrder.label', default: 'NideshopOrder'), nideshopOrderInstance.id])
                redirect nideshopOrderInstance
            }
            '*' { respond nideshopOrderInstance, [status: CREATED] }
        }
    }

    def edit(NideshopOrder nideshopOrderInstance) {
        respond nideshopOrderInstance
    }

    @Transactional
    def update(NideshopOrder nideshopOrderInstance) {
        if (nideshopOrderInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderInstance.hasErrors()) {
            respond nideshopOrderInstance.errors, view:'edit'
            return
        }

        nideshopOrderInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopOrder.label', default: 'NideshopOrder'), nideshopOrderInstance.id])
                redirect nideshopOrderInstance
            }
            '*'{ respond nideshopOrderInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopOrder nideshopOrderInstance) {

        if (nideshopOrderInstance == null) {
            notFound()
            return
        }

        nideshopOrderInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopOrder.label', default: 'NideshopOrder'), nideshopOrderInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopOrder.label', default: 'NideshopOrder'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
