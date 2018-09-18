package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopGoodsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopGoods.list(params), model:[nideshopGoodsInstanceCount: NideshopGoods.count()]
    }

    def show(NideshopGoods nideshopGoodsInstance) {
        respond nideshopGoodsInstance
    }

    def create() {
        respond new NideshopGoods(params)
    }

    @Transactional
    def save(NideshopGoods nideshopGoodsInstance) {
        if (nideshopGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsInstance.hasErrors()) {
            respond nideshopGoodsInstance.errors, view:'create'
            return
        }

        nideshopGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopGoods.label', default: 'NideshopGoods'), nideshopGoodsInstance.id])
                redirect nideshopGoodsInstance
            }
            '*' { respond nideshopGoodsInstance, [status: CREATED] }
        }
    }

    def edit(NideshopGoods nideshopGoodsInstance) {
        respond nideshopGoodsInstance
    }

    @Transactional
    def update(NideshopGoods nideshopGoodsInstance) {
        if (nideshopGoodsInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsInstance.hasErrors()) {
            respond nideshopGoodsInstance.errors, view:'edit'
            return
        }

        nideshopGoodsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopGoods.label', default: 'NideshopGoods'), nideshopGoodsInstance.id])
                redirect nideshopGoodsInstance
            }
            '*'{ respond nideshopGoodsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopGoods nideshopGoodsInstance) {

        if (nideshopGoodsInstance == null) {
            notFound()
            return
        }

        nideshopGoodsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopGoods.label', default: 'NideshopGoods'), nideshopGoodsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopGoods.label', default: 'NideshopGoods'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
