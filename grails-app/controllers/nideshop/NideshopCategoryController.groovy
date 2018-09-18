package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopCategory.list(params), model:[nideshopCategoryInstanceCount: NideshopCategory.count()]
    }

    def show(NideshopCategory nideshopCategoryInstance) {
        respond nideshopCategoryInstance
    }

    def create() {
        respond new NideshopCategory(params)
    }

    @Transactional
    def save(NideshopCategory nideshopCategoryInstance) {
        if (nideshopCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopCategoryInstance.hasErrors()) {
            respond nideshopCategoryInstance.errors, view:'create'
            return
        }

        nideshopCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopCategory.label', default: 'NideshopCategory'), nideshopCategoryInstance.id])
                redirect nideshopCategoryInstance
            }
            '*' { respond nideshopCategoryInstance, [status: CREATED] }
        }
    }

    def edit(NideshopCategory nideshopCategoryInstance) {
        respond nideshopCategoryInstance
    }

    @Transactional
    def update(NideshopCategory nideshopCategoryInstance) {
        if (nideshopCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopCategoryInstance.hasErrors()) {
            respond nideshopCategoryInstance.errors, view:'edit'
            return
        }

        nideshopCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopCategory.label', default: 'NideshopCategory'), nideshopCategoryInstance.id])
                redirect nideshopCategoryInstance
            }
            '*'{ respond nideshopCategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopCategory nideshopCategoryInstance) {

        if (nideshopCategoryInstance == null) {
            notFound()
            return
        }

        nideshopCategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopCategory.label', default: 'NideshopCategory'), nideshopCategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopCategory.label', default: 'NideshopCategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
