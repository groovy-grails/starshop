package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopUserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopUser.list(params), model:[nideshopUserInstanceCount: NideshopUser.count()]
    }

    def show(NideshopUser nideshopUserInstance) {
        respond nideshopUserInstance
    }

    def create() {
        respond new NideshopUser(params)
    }

    @Transactional
    def save(NideshopUser nideshopUserInstance) {
        if (nideshopUserInstance == null) {
            notFound()
            return
        }

        if (nideshopUserInstance.hasErrors()) {
            respond nideshopUserInstance.errors, view:'create'
            return
        }

        nideshopUserInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopUser.label', default: 'NideshopUser'), nideshopUserInstance.id])
                redirect nideshopUserInstance
            }
            '*' { respond nideshopUserInstance, [status: CREATED] }
        }
    }

    def edit(NideshopUser nideshopUserInstance) {
        respond nideshopUserInstance
    }

    @Transactional
    def update(NideshopUser nideshopUserInstance) {
        if (nideshopUserInstance == null) {
            notFound()
            return
        }

        if (nideshopUserInstance.hasErrors()) {
            respond nideshopUserInstance.errors, view:'edit'
            return
        }

        nideshopUserInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopUser.label', default: 'NideshopUser'), nideshopUserInstance.id])
                redirect nideshopUserInstance
            }
            '*'{ respond nideshopUserInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopUser nideshopUserInstance) {

        if (nideshopUserInstance == null) {
            notFound()
            return
        }

        nideshopUserInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopUser.label', default: 'NideshopUser'), nideshopUserInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopUser.label', default: 'NideshopUser'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
