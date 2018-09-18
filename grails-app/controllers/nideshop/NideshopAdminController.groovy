package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAdminController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAdmin.list(params), model:[nideshopAdminInstanceCount: NideshopAdmin.count()]
    }

    def show(NideshopAdmin nideshopAdminInstance) {
        respond nideshopAdminInstance
    }

    def create() {
        respond new NideshopAdmin(params)
    }

    @Transactional
    def save(NideshopAdmin nideshopAdminInstance) {
        if (nideshopAdminInstance == null) {
            notFound()
            return
        }

        if (nideshopAdminInstance.hasErrors()) {
            respond nideshopAdminInstance.errors, view:'create'
            return
        }

        nideshopAdminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAdmin.label', default: 'NideshopAdmin'), nideshopAdminInstance.id])
                redirect nideshopAdminInstance
            }
            '*' { respond nideshopAdminInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAdmin nideshopAdminInstance) {
        respond nideshopAdminInstance
    }

    @Transactional
    def update(NideshopAdmin nideshopAdminInstance) {
        if (nideshopAdminInstance == null) {
            notFound()
            return
        }

        if (nideshopAdminInstance.hasErrors()) {
            respond nideshopAdminInstance.errors, view:'edit'
            return
        }

        nideshopAdminInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAdmin.label', default: 'NideshopAdmin'), nideshopAdminInstance.id])
                redirect nideshopAdminInstance
            }
            '*'{ respond nideshopAdminInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAdmin nideshopAdminInstance) {

        if (nideshopAdminInstance == null) {
            notFound()
            return
        }

        nideshopAdminInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAdmin.label', default: 'NideshopAdmin'), nideshopAdminInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAdmin.label', default: 'NideshopAdmin'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
