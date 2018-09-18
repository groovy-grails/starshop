package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCollectController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopCollect.list(params), model:[nideshopCollectInstanceCount: NideshopCollect.count()]
    }

    def show(NideshopCollect nideshopCollectInstance) {
        respond nideshopCollectInstance
    }

    def create() {
        respond new NideshopCollect(params)
    }

    @Transactional
    def save(NideshopCollect nideshopCollectInstance) {
        if (nideshopCollectInstance == null) {
            notFound()
            return
        }

        if (nideshopCollectInstance.hasErrors()) {
            respond nideshopCollectInstance.errors, view:'create'
            return
        }

        nideshopCollectInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopCollect.label', default: 'NideshopCollect'), nideshopCollectInstance.id])
                redirect nideshopCollectInstance
            }
            '*' { respond nideshopCollectInstance, [status: CREATED] }
        }
    }

    def edit(NideshopCollect nideshopCollectInstance) {
        respond nideshopCollectInstance
    }

    @Transactional
    def update(NideshopCollect nideshopCollectInstance) {
        if (nideshopCollectInstance == null) {
            notFound()
            return
        }

        if (nideshopCollectInstance.hasErrors()) {
            respond nideshopCollectInstance.errors, view:'edit'
            return
        }

        nideshopCollectInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopCollect.label', default: 'NideshopCollect'), nideshopCollectInstance.id])
                redirect nideshopCollectInstance
            }
            '*'{ respond nideshopCollectInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopCollect nideshopCollectInstance) {

        if (nideshopCollectInstance == null) {
            notFound()
            return
        }

        nideshopCollectInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopCollect.label', default: 'NideshopCollect'), nideshopCollectInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopCollect.label', default: 'NideshopCollect'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
