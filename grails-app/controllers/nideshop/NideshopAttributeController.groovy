package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAttributeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAttribute.list(params), model:[nideshopAttributeInstanceCount: NideshopAttribute.count()]
    }

    def show(NideshopAttribute nideshopAttributeInstance) {
        respond nideshopAttributeInstance
    }

    def create() {
        respond new NideshopAttribute(params)
    }

    @Transactional
    def save(NideshopAttribute nideshopAttributeInstance) {
        if (nideshopAttributeInstance == null) {
            notFound()
            return
        }

        if (nideshopAttributeInstance.hasErrors()) {
            respond nideshopAttributeInstance.errors, view:'create'
            return
        }

        nideshopAttributeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAttribute.label', default: 'NideshopAttribute'), nideshopAttributeInstance.id])
                redirect nideshopAttributeInstance
            }
            '*' { respond nideshopAttributeInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAttribute nideshopAttributeInstance) {
        respond nideshopAttributeInstance
    }

    @Transactional
    def update(NideshopAttribute nideshopAttributeInstance) {
        if (nideshopAttributeInstance == null) {
            notFound()
            return
        }

        if (nideshopAttributeInstance.hasErrors()) {
            respond nideshopAttributeInstance.errors, view:'edit'
            return
        }

        nideshopAttributeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAttribute.label', default: 'NideshopAttribute'), nideshopAttributeInstance.id])
                redirect nideshopAttributeInstance
            }
            '*'{ respond nideshopAttributeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAttribute nideshopAttributeInstance) {

        if (nideshopAttributeInstance == null) {
            notFound()
            return
        }

        nideshopAttributeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAttribute.label', default: 'NideshopAttribute'), nideshopAttributeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAttribute.label', default: 'NideshopAttribute'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
