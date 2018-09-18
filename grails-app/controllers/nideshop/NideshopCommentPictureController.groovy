package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCommentPictureController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopCommentPicture.list(params), model:[nideshopCommentPictureInstanceCount: NideshopCommentPicture.count()]
    }

    def show(NideshopCommentPicture nideshopCommentPictureInstance) {
        respond nideshopCommentPictureInstance
    }

    def create() {
        respond new NideshopCommentPicture(params)
    }

    @Transactional
    def save(NideshopCommentPicture nideshopCommentPictureInstance) {
        if (nideshopCommentPictureInstance == null) {
            notFound()
            return
        }

        if (nideshopCommentPictureInstance.hasErrors()) {
            respond nideshopCommentPictureInstance.errors, view:'create'
            return
        }

        nideshopCommentPictureInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopCommentPicture.label', default: 'NideshopCommentPicture'), nideshopCommentPictureInstance.id])
                redirect nideshopCommentPictureInstance
            }
            '*' { respond nideshopCommentPictureInstance, [status: CREATED] }
        }
    }

    def edit(NideshopCommentPicture nideshopCommentPictureInstance) {
        respond nideshopCommentPictureInstance
    }

    @Transactional
    def update(NideshopCommentPicture nideshopCommentPictureInstance) {
        if (nideshopCommentPictureInstance == null) {
            notFound()
            return
        }

        if (nideshopCommentPictureInstance.hasErrors()) {
            respond nideshopCommentPictureInstance.errors, view:'edit'
            return
        }

        nideshopCommentPictureInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopCommentPicture.label', default: 'NideshopCommentPicture'), nideshopCommentPictureInstance.id])
                redirect nideshopCommentPictureInstance
            }
            '*'{ respond nideshopCommentPictureInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopCommentPicture nideshopCommentPictureInstance) {

        if (nideshopCommentPictureInstance == null) {
            notFound()
            return
        }

        nideshopCommentPictureInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopCommentPicture.label', default: 'NideshopCommentPicture'), nideshopCommentPictureInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopCommentPicture.label', default: 'NideshopCommentPicture'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
