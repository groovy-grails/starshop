package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCommentController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopComment.list(params), model:[nideshopCommentInstanceCount: NideshopComment.count()]
    }

    def show(NideshopComment nideshopCommentInstance) {
        respond nideshopCommentInstance
    }

    def create() {
        respond new NideshopComment(params)
    }

    @Transactional
    def save(NideshopComment nideshopCommentInstance) {
        if (nideshopCommentInstance == null) {
            notFound()
            return
        }

        if (nideshopCommentInstance.hasErrors()) {
            respond nideshopCommentInstance.errors, view:'create'
            return
        }

        nideshopCommentInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopComment.label', default: 'NideshopComment'), nideshopCommentInstance.id])
                redirect nideshopCommentInstance
            }
            '*' { respond nideshopCommentInstance, [status: CREATED] }
        }
    }

    def edit(NideshopComment nideshopCommentInstance) {
        respond nideshopCommentInstance
    }

    @Transactional
    def update(NideshopComment nideshopCommentInstance) {
        if (nideshopCommentInstance == null) {
            notFound()
            return
        }

        if (nideshopCommentInstance.hasErrors()) {
            respond nideshopCommentInstance.errors, view:'edit'
            return
        }

        nideshopCommentInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopComment.label', default: 'NideshopComment'), nideshopCommentInstance.id])
                redirect nideshopCommentInstance
            }
            '*'{ respond nideshopCommentInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopComment nideshopCommentInstance) {

        if (nideshopCommentInstance == null) {
            notFound()
            return
        }

        nideshopCommentInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopComment.label', default: 'NideshopComment'), nideshopCommentInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopComment.label', default: 'NideshopComment'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
