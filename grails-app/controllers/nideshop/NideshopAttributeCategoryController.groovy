package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAttributeCategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAttributeCategory.list(params), model:[nideshopAttributeCategoryInstanceCount: NideshopAttributeCategory.count()]
    }

    def show(NideshopAttributeCategory nideshopAttributeCategoryInstance) {
        respond nideshopAttributeCategoryInstance
    }

    def create() {
        respond new NideshopAttributeCategory(params)
    }

    @Transactional
    def save(NideshopAttributeCategory nideshopAttributeCategoryInstance) {
        if (nideshopAttributeCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopAttributeCategoryInstance.hasErrors()) {
            respond nideshopAttributeCategoryInstance.errors, view:'create'
            return
        }

        nideshopAttributeCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAttributeCategory.label', default: 'NideshopAttributeCategory'), nideshopAttributeCategoryInstance.id])
                redirect nideshopAttributeCategoryInstance
            }
            '*' { respond nideshopAttributeCategoryInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAttributeCategory nideshopAttributeCategoryInstance) {
        respond nideshopAttributeCategoryInstance
    }

    @Transactional
    def update(NideshopAttributeCategory nideshopAttributeCategoryInstance) {
        if (nideshopAttributeCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopAttributeCategoryInstance.hasErrors()) {
            respond nideshopAttributeCategoryInstance.errors, view:'edit'
            return
        }

        nideshopAttributeCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAttributeCategory.label', default: 'NideshopAttributeCategory'), nideshopAttributeCategoryInstance.id])
                redirect nideshopAttributeCategoryInstance
            }
            '*'{ respond nideshopAttributeCategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAttributeCategory nideshopAttributeCategoryInstance) {

        if (nideshopAttributeCategoryInstance == null) {
            notFound()
            return
        }

        nideshopAttributeCategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAttributeCategory.label', default: 'NideshopAttributeCategory'), nideshopAttributeCategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAttributeCategory.label', default: 'NideshopAttributeCategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
