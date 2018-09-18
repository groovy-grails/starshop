package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopSpecificationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopSpecification.list(params), model:[nideshopSpecificationInstanceCount: NideshopSpecification.count()]
    }

    def show(NideshopSpecification nideshopSpecificationInstance) {
        respond nideshopSpecificationInstance
    }

    def create() {
        respond new NideshopSpecification(params)
    }

    @Transactional
    def save(NideshopSpecification nideshopSpecificationInstance) {
        if (nideshopSpecificationInstance == null) {
            notFound()
            return
        }

        if (nideshopSpecificationInstance.hasErrors()) {
            respond nideshopSpecificationInstance.errors, view:'create'
            return
        }

        nideshopSpecificationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopSpecification.label', default: 'NideshopSpecification'), nideshopSpecificationInstance.id])
                redirect nideshopSpecificationInstance
            }
            '*' { respond nideshopSpecificationInstance, [status: CREATED] }
        }
    }

    def edit(NideshopSpecification nideshopSpecificationInstance) {
        respond nideshopSpecificationInstance
    }

    @Transactional
    def update(NideshopSpecification nideshopSpecificationInstance) {
        if (nideshopSpecificationInstance == null) {
            notFound()
            return
        }

        if (nideshopSpecificationInstance.hasErrors()) {
            respond nideshopSpecificationInstance.errors, view:'edit'
            return
        }

        nideshopSpecificationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopSpecification.label', default: 'NideshopSpecification'), nideshopSpecificationInstance.id])
                redirect nideshopSpecificationInstance
            }
            '*'{ respond nideshopSpecificationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopSpecification nideshopSpecificationInstance) {

        if (nideshopSpecificationInstance == null) {
            notFound()
            return
        }

        nideshopSpecificationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopSpecification.label', default: 'NideshopSpecification'), nideshopSpecificationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopSpecification.label', default: 'NideshopSpecification'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
