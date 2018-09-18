package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopOrderGoodsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopOrderGoods.list(params), model:[nideshopOrderGoodsInstanceCount: NideshopOrderGoods.count()]
    }

    def show(NideshopOrderGoods nideshopOrderGoodsInstance) {
        respond nideshopOrderGoodsInstance
    }

    def create() {
        respond new NideshopOrderGoods(params)
    }

    @Transactional
    def save(NideshopOrderGoods nideshopOrderGoodsInstance) {
        if (nideshopOrderGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderGoodsInstance.hasErrors()) {
            respond nideshopOrderGoodsInstance.errors, view:'create'
            return
        }

        nideshopOrderGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopOrderGoods.label', default: 'NideshopOrderGoods'), nideshopOrderGoodsInstance.id])
                redirect nideshopOrderGoodsInstance
            }
            '*' { respond nideshopOrderGoodsInstance, [status: CREATED] }
        }
    }

    def edit(NideshopOrderGoods nideshopOrderGoodsInstance) {
        respond nideshopOrderGoodsInstance
    }

    @Transactional
    def update(NideshopOrderGoods nideshopOrderGoodsInstance) {
        if (nideshopOrderGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopOrderGoodsInstance.hasErrors()) {
            respond nideshopOrderGoodsInstance.errors, view:'edit'
            return
        }

        nideshopOrderGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopOrderGoods.label', default: 'NideshopOrderGoods'), nideshopOrderGoodsInstance.id])
                redirect nideshopOrderGoodsInstance
            }
            '*'{ respond nideshopOrderGoodsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopOrderGoods nideshopOrderGoodsInstance) {

        if (nideshopOrderGoodsInstance == null) {
            notFound()
            return
        }

        nideshopOrderGoodsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopOrderGoods.label', default: 'NideshopOrderGoods'), nideshopOrderGoodsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopOrderGoods.label', default: 'NideshopOrderGoods'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
