package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopChannelController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopChannel.list(params), model:[nideshopChannelInstanceCount: NideshopChannel.count()]
    }

    def show(NideshopChannel nideshopChannelInstance) {
        respond nideshopChannelInstance
    }

    def create() {
        respond new NideshopChannel(params)
    }

    @Transactional
    def save(NideshopChannel nideshopChannelInstance) {
        if (nideshopChannelInstance == null) {
            notFound()
            return
        }

        if (nideshopChannelInstance.hasErrors()) {
            respond nideshopChannelInstance.errors, view:'create'
            return
        }

        nideshopChannelInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopChannel.label', default: 'NideshopChannel'), nideshopChannelInstance.id])
                redirect nideshopChannelInstance
            }
            '*' { respond nideshopChannelInstance, [status: CREATED] }
        }
    }

    def edit(NideshopChannel nideshopChannelInstance) {
        respond nideshopChannelInstance
    }

    @Transactional
    def update(NideshopChannel nideshopChannelInstance) {
        if (nideshopChannelInstance == null) {
            notFound()
            return
        }

        if (nideshopChannelInstance.hasErrors()) {
            respond nideshopChannelInstance.errors, view:'edit'
            return
        }

        nideshopChannelInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopChannel.label', default: 'NideshopChannel'), nideshopChannelInstance.id])
                redirect nideshopChannelInstance
            }
            '*'{ respond nideshopChannelInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopChannel nideshopChannelInstance) {

        if (nideshopChannelInstance == null) {
            notFound()
            return
        }

        nideshopChannelInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopChannel.label', default: 'NideshopChannel'), nideshopChannelInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopChannel.label', default: 'NideshopChannel'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
