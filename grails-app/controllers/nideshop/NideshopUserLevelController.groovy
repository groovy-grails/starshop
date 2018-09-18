package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopUserLevelController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopUserLevel.list(params), model:[nideshopUserLevelInstanceCount: NideshopUserLevel.count()]
    }

    def show(NideshopUserLevel nideshopUserLevelInstance) {
        respond nideshopUserLevelInstance
    }

    def create() {
        respond new NideshopUserLevel(params)
    }

    @Transactional
    def save(NideshopUserLevel nideshopUserLevelInstance) {
        if (nideshopUserLevelInstance == null) {
            notFound()
            return
        }

        if (nideshopUserLevelInstance.hasErrors()) {
            respond nideshopUserLevelInstance.errors, view:'create'
            return
        }

        nideshopUserLevelInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopUserLevel.label', default: 'NideshopUserLevel'), nideshopUserLevelInstance.id])
                redirect nideshopUserLevelInstance
            }
            '*' { respond nideshopUserLevelInstance, [status: CREATED] }
        }
    }

    def edit(NideshopUserLevel nideshopUserLevelInstance) {
        respond nideshopUserLevelInstance
    }

    @Transactional
    def update(NideshopUserLevel nideshopUserLevelInstance) {
        if (nideshopUserLevelInstance == null) {
            notFound()
            return
        }

        if (nideshopUserLevelInstance.hasErrors()) {
            respond nideshopUserLevelInstance.errors, view:'edit'
            return
        }

        nideshopUserLevelInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopUserLevel.label', default: 'NideshopUserLevel'), nideshopUserLevelInstance.id])
                redirect nideshopUserLevelInstance
            }
            '*'{ respond nideshopUserLevelInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopUserLevel nideshopUserLevelInstance) {

        if (nideshopUserLevelInstance == null) {
            notFound()
            return
        }

        nideshopUserLevelInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopUserLevel.label', default: 'NideshopUserLevel'), nideshopUserLevelInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopUserLevel.label', default: 'NideshopUserLevel'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
