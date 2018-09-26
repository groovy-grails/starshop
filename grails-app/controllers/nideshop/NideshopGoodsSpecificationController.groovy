package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopGoodsSpecificationController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopGoodsSpecification.list(params), model:[nideshopGoodsSpecificationInstanceCount: NideshopGoodsSpecification.count()]
    }

    def show(NideshopGoodsSpecification nideshopGoodsSpecificationInstance) {
        respond nideshopGoodsSpecificationInstance
    }

    def create() {
        respond new NideshopGoodsSpecification(params)
    }

    @Transactional
    def save(NideshopGoodsSpecification nideshopGoodsSpecificationInstance) {
        if (nideshopGoodsSpecificationInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsSpecificationInstance.hasErrors()) {
            respond nideshopGoodsSpecificationInstance.errors, view:'create'
            return
        }

        nideshopGoodsSpecificationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification'), nideshopGoodsSpecificationInstance.id])
                redirect nideshopGoodsSpecificationInstance
            }
            '*' { respond nideshopGoodsSpecificationInstance, [status: CREATED] }
        }
    }

    def edit(NideshopGoodsSpecification nideshopGoodsSpecificationInstance) {
        respond nideshopGoodsSpecificationInstance
    }

    @Transactional
    def update(NideshopGoodsSpecification nideshopGoodsSpecificationInstance) {
        if (nideshopGoodsSpecificationInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsSpecificationInstance.hasErrors()) {
            respond nideshopGoodsSpecificationInstance.errors, view:'edit'
            return
        }

        nideshopGoodsSpecificationInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification'), nideshopGoodsSpecificationInstance.id])
                redirect nideshopGoodsSpecificationInstance
            }
            '*'{ respond nideshopGoodsSpecificationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopGoodsSpecification nideshopGoodsSpecificationInstance) {

        if (nideshopGoodsSpecificationInstance == null) {
            notFound()
            return
        }

        nideshopGoodsSpecificationInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification'), nideshopGoodsSpecificationInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopGoodsSpecification.label', default: 'NideshopGoodsSpecification'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
