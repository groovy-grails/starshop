package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopOrderExpressController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopOrderExpress.list(params), model:[nideshopOrderExpressInstanceCount: NideshopOrderExpress.count()]
    }

    def show(NideshopOrderExpress nideshopOrderExpressInstance) {
        respond nideshopOrderExpressInstance
    }

    def create() {
        respond new NideshopOrderExpress(params)
    }

    @Transactional
    def save(NideshopOrderExpress nideshopOrderExpressInstance) {
        if (nideshopOrderExpressInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderExpressInstance.hasErrors()) {
            respond nideshopOrderExpressInstance.errors, view:'create'
            return
        }

        nideshopOrderExpressInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopOrderExpress.label', default: 'NideshopOrderExpress'), nideshopOrderExpressInstance.id])
                redirect nideshopOrderExpressInstance
            }
            '*' { respond nideshopOrderExpressInstance, [status: CREATED] }
        }
    }

    def edit(NideshopOrderExpress nideshopOrderExpressInstance) {
        respond nideshopOrderExpressInstance
    }

    @Transactional
    def update(NideshopOrderExpress nideshopOrderExpressInstance) {
        if (nideshopOrderExpressInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderExpressInstance.hasErrors()) {
            respond nideshopOrderExpressInstance.errors, view:'edit'
            return
        }

        nideshopOrderExpressInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopOrderExpress.label', default: 'NideshopOrderExpress'), nideshopOrderExpressInstance.id])
                redirect nideshopOrderExpressInstance
            }
            '*'{ respond nideshopOrderExpressInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopOrderExpress nideshopOrderExpressInstance) {

        if (nideshopOrderExpressInstance == null) {
            notFound()
            return
        }

        nideshopOrderExpressInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopOrderExpress.label', default: 'NideshopOrderExpress'), nideshopOrderExpressInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopOrderExpress.label', default: 'NideshopOrderExpress'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
