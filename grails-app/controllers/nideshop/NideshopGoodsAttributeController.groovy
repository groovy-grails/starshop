package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopGoodsAttributeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopGoodsAttribute.list(params), model:[nideshopGoodsAttributeInstanceCount: NideshopGoodsAttribute.count()]
    }

    def show(NideshopGoodsAttribute nideshopGoodsAttributeInstance) {
        respond nideshopGoodsAttributeInstance
    }

    def create() {
        respond new NideshopGoodsAttribute(params)
    }

    @Transactional
    def save(NideshopGoodsAttribute nideshopGoodsAttributeInstance) {
        if (nideshopGoodsAttributeInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsAttributeInstance.hasErrors()) {
            respond nideshopGoodsAttributeInstance.errors, view:'create'
            return
        }

        nideshopGoodsAttributeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopGoodsAttribute.label', default: 'NideshopGoodsAttribute'), nideshopGoodsAttributeInstance.id])
                redirect nideshopGoodsAttributeInstance
            }
            '*' { respond nideshopGoodsAttributeInstance, [status: CREATED] }
        }
    }

    def edit(NideshopGoodsAttribute nideshopGoodsAttributeInstance) {
        respond nideshopGoodsAttributeInstance
    }

    @Transactional
    def update(NideshopGoodsAttribute nideshopGoodsAttributeInstance) {
        if (nideshopGoodsAttributeInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsAttributeInstance.hasErrors()) {
            respond nideshopGoodsAttributeInstance.errors, view:'edit'
            return
        }

        nideshopGoodsAttributeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopGoodsAttribute.label', default: 'NideshopGoodsAttribute'), nideshopGoodsAttributeInstance.id])
                redirect nideshopGoodsAttributeInstance
            }
            '*'{ respond nideshopGoodsAttributeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopGoodsAttribute nideshopGoodsAttributeInstance) {

        if (nideshopGoodsAttributeInstance == null) {
            notFound()
            return
        }

        nideshopGoodsAttributeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopGoodsAttribute.label', default: 'NideshopGoodsAttribute'), nideshopGoodsAttributeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopGoodsAttribute.label', default: 'NideshopGoodsAttribute'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
