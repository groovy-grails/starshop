package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopRegionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopRegion.list(params), model:[nideshopRegionInstanceCount: NideshopRegion.count()]
    }

    def show(NideshopRegion nideshopRegionInstance) {
        respond nideshopRegionInstance
    }

    def create() {
        respond new NideshopRegion(params)
    }

    @Transactional
    def save(NideshopRegion nideshopRegionInstance) {
        if (nideshopRegionInstance == null) {
            notFound()
            return
        }

        if (nideshopRegionInstance.hasErrors()) {
            respond nideshopRegionInstance.errors, view:'create'
            return
        }

        nideshopRegionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopRegion.label', default: 'NideshopRegion'), nideshopRegionInstance.id])
                redirect nideshopRegionInstance
            }
            '*' { respond nideshopRegionInstance, [status: CREATED] }
        }
    }

    def edit(NideshopRegion nideshopRegionInstance) {
        respond nideshopRegionInstance
    }

    @Transactional
    def update(NideshopRegion nideshopRegionInstance) {
        if (nideshopRegionInstance == null) {
            notFound()
            return
        }

        if (nideshopRegionInstance.hasErrors()) {
            respond nideshopRegionInstance.errors, view:'edit'
            return
        }

        nideshopRegionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopRegion.label', default: 'NideshopRegion'), nideshopRegionInstance.id])
                redirect nideshopRegionInstance
            }
            '*'{ respond nideshopRegionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopRegion nideshopRegionInstance) {

        if (nideshopRegionInstance == null) {
            notFound()
            return
        }

        nideshopRegionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopRegion.label', default: 'NideshopRegion'), nideshopRegionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopRegion.label', default: 'NideshopRegion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
