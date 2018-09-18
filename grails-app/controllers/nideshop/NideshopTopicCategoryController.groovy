package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopTopicCategoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopTopicCategory.list(params), model:[nideshopTopicCategoryInstanceCount: NideshopTopicCategory.count()]
    }

    def show(NideshopTopicCategory nideshopTopicCategoryInstance) {
        respond nideshopTopicCategoryInstance
    }

    def create() {
        respond new NideshopTopicCategory(params)
    }

    @Transactional
    def save(NideshopTopicCategory nideshopTopicCategoryInstance) {
        if (nideshopTopicCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopTopicCategoryInstance.hasErrors()) {
            respond nideshopTopicCategoryInstance.errors, view:'create'
            return
        }

        nideshopTopicCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopTopicCategory.label', default: 'NideshopTopicCategory'), nideshopTopicCategoryInstance.id])
                redirect nideshopTopicCategoryInstance
            }
            '*' { respond nideshopTopicCategoryInstance, [status: CREATED] }
        }
    }

    def edit(NideshopTopicCategory nideshopTopicCategoryInstance) {
        respond nideshopTopicCategoryInstance
    }

    @Transactional
    def update(NideshopTopicCategory nideshopTopicCategoryInstance) {
        if (nideshopTopicCategoryInstance == null) {
            notFound()
            return
        }

        if (nideshopTopicCategoryInstance.hasErrors()) {
            respond nideshopTopicCategoryInstance.errors, view:'edit'
            return
        }

        nideshopTopicCategoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopTopicCategory.label', default: 'NideshopTopicCategory'), nideshopTopicCategoryInstance.id])
                redirect nideshopTopicCategoryInstance
            }
            '*'{ respond nideshopTopicCategoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopTopicCategory nideshopTopicCategoryInstance) {

        if (nideshopTopicCategoryInstance == null) {
            notFound()
            return
        }

        nideshopTopicCategoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopTopicCategory.label', default: 'NideshopTopicCategory'), nideshopTopicCategoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopTopicCategory.label', default: 'NideshopTopicCategory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
