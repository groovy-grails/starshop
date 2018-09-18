package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopRelatedGoodsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopRelatedGoods.list(params), model:[nideshopRelatedGoodsInstanceCount: NideshopRelatedGoods.count()]
    }

    def show(NideshopRelatedGoods nideshopRelatedGoodsInstance) {
        respond nideshopRelatedGoodsInstance
    }

    def create() {
        respond new NideshopRelatedGoods(params)
    }

    @Transactional
    def save(NideshopRelatedGoods nideshopRelatedGoodsInstance) {
        if (nideshopRelatedGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopRelatedGoodsInstance.hasErrors()) {
            respond nideshopRelatedGoodsInstance.errors, view:'create'
            return
        }

        nideshopRelatedGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopRelatedGoods.label', default: 'NideshopRelatedGoods'), nideshopRelatedGoodsInstance.id])
                redirect nideshopRelatedGoodsInstance
            }
            '*' { respond nideshopRelatedGoodsInstance, [status: CREATED] }
        }
    }

    def edit(NideshopRelatedGoods nideshopRelatedGoodsInstance) {
        respond nideshopRelatedGoodsInstance
    }

    @Transactional
    def update(NideshopRelatedGoods nideshopRelatedGoodsInstance) {
        if (nideshopRelatedGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopRelatedGoodsInstance.hasErrors()) {
            respond nideshopRelatedGoodsInstance.errors, view:'edit'
            return
        }

        nideshopRelatedGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopRelatedGoods.label', default: 'NideshopRelatedGoods'), nideshopRelatedGoodsInstance.id])
                redirect nideshopRelatedGoodsInstance
            }
            '*'{ respond nideshopRelatedGoodsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopRelatedGoods nideshopRelatedGoodsInstance) {

        if (nideshopRelatedGoodsInstance == null) {
            notFound()
            return
        }

        nideshopRelatedGoodsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopRelatedGoods.label', default: 'NideshopRelatedGoods'), nideshopRelatedGoodsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopRelatedGoods.label', default: 'NideshopRelatedGoods'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
