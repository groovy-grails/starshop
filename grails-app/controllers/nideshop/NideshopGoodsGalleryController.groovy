package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopGoodsGalleryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopGoodsGallery.list(params), model:[nideshopGoodsGalleryInstanceCount: NideshopGoodsGallery.count()]
    }

    def show(NideshopGoodsGallery nideshopGoodsGalleryInstance) {
        respond nideshopGoodsGalleryInstance
    }

    def create() {
        respond new NideshopGoodsGallery(params)
    }

    @Transactional
    def save(NideshopGoodsGallery nideshopGoodsGalleryInstance) {
        if (nideshopGoodsGalleryInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsGalleryInstance.hasErrors()) {
            respond nideshopGoodsGalleryInstance.errors, view:'create'
            return
        }

        nideshopGoodsGalleryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopGoodsGallery.label', default: 'NideshopGoodsGallery'), nideshopGoodsGalleryInstance.id])
                redirect nideshopGoodsGalleryInstance
            }
            '*' { respond nideshopGoodsGalleryInstance, [status: CREATED] }
        }
    }

    def edit(NideshopGoodsGallery nideshopGoodsGalleryInstance) {
        respond nideshopGoodsGalleryInstance
    }

    @Transactional
    def update(NideshopGoodsGallery nideshopGoodsGalleryInstance) {
        if (nideshopGoodsGalleryInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsGalleryInstance.hasErrors()) {
            respond nideshopGoodsGalleryInstance.errors, view:'edit'
            return
        }

        nideshopGoodsGalleryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopGoodsGallery.label', default: 'NideshopGoodsGallery'), nideshopGoodsGalleryInstance.id])
                redirect nideshopGoodsGalleryInstance
            }
            '*'{ respond nideshopGoodsGalleryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopGoodsGallery nideshopGoodsGalleryInstance) {

        if (nideshopGoodsGalleryInstance == null) {
            notFound()
            return
        }

        nideshopGoodsGalleryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopGoodsGallery.label', default: 'NideshopGoodsGallery'), nideshopGoodsGalleryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopGoodsGallery.label', default: 'NideshopGoodsGallery'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
