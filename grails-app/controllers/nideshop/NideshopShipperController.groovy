package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopShipperController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopShipper.list(params), model:[nideshopShipperInstanceCount: NideshopShipper.count()]
    }

    def show(NideshopShipper nideshopShipperInstance) {
        respond nideshopShipperInstance
    }

    def create() {
        respond new NideshopShipper(params)
    }

    @Transactional
    def save(NideshopShipper nideshopShipperInstance) {
        if (nideshopShipperInstance == null) {
            notFound()
            return
        }

        if (nideshopShipperInstance.hasErrors()) {
            respond nideshopShipperInstance.errors, view:'create'
            return
        }

        nideshopShipperInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopShipper.label', default: 'NideshopShipper'), nideshopShipperInstance.id])
                redirect nideshopShipperInstance
            }
            '*' { respond nideshopShipperInstance, [status: CREATED] }
        }
    }

    def edit(NideshopShipper nideshopShipperInstance) {
        respond nideshopShipperInstance
    }

    @Transactional
    def update(NideshopShipper nideshopShipperInstance) {
        if (nideshopShipperInstance == null) {
            notFound()
            return
        }

        if (nideshopShipperInstance.hasErrors()) {
            respond nideshopShipperInstance.errors, view:'edit'
            return
        }

        nideshopShipperInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopShipper.label', default: 'NideshopShipper'), nideshopShipperInstance.id])
                redirect nideshopShipperInstance
            }
            '*'{ respond nideshopShipperInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopShipper nideshopShipperInstance) {

        if (nideshopShipperInstance == null) {
            notFound()
            return
        }

        nideshopShipperInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopShipper.label', default: 'NideshopShipper'), nideshopShipperInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopShipper.label', default: 'NideshopShipper'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
