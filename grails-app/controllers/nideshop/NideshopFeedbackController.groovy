package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopFeedbackController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopFeedback.list(params), model:[nideshopFeedbackInstanceCount: NideshopFeedback.count()]
    }

    def show(NideshopFeedback nideshopFeedbackInstance) {
        respond nideshopFeedbackInstance
    }

    def create() {
        respond new NideshopFeedback(params)
    }

    @Transactional
    def save(NideshopFeedback nideshopFeedbackInstance) {
        if (nideshopFeedbackInstance == null) {
            notFound()
            return
        }

        if (nideshopFeedbackInstance.hasErrors()) {
            respond nideshopFeedbackInstance.errors, view:'create'
            return
        }

        nideshopFeedbackInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopFeedback.label', default: 'NideshopFeedback'), nideshopFeedbackInstance.id])
                redirect nideshopFeedbackInstance
            }
            '*' { respond nideshopFeedbackInstance, [status: CREATED] }
        }
    }

    def edit(NideshopFeedback nideshopFeedbackInstance) {
        respond nideshopFeedbackInstance
    }

    @Transactional
    def update(NideshopFeedback nideshopFeedbackInstance) {
        if (nideshopFeedbackInstance == null) {
            notFound()
            return
        }

        if (nideshopFeedbackInstance.hasErrors()) {
            respond nideshopFeedbackInstance.errors, view:'edit'
            return
        }

        nideshopFeedbackInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopFeedback.label', default: 'NideshopFeedback'), nideshopFeedbackInstance.id])
                redirect nideshopFeedbackInstance
            }
            '*'{ respond nideshopFeedbackInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopFeedback nideshopFeedbackInstance) {

        if (nideshopFeedbackInstance == null) {
            notFound()
            return
        }

        nideshopFeedbackInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopFeedback.label', default: 'NideshopFeedback'), nideshopFeedbackInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopFeedback.label', default: 'NideshopFeedback'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
