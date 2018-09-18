package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCouponController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopCoupon.list(params), model:[nideshopCouponInstanceCount: NideshopCoupon.count()]
    }

    def show(NideshopCoupon nideshopCouponInstance) {
        respond nideshopCouponInstance
    }

    def create() {
        respond new NideshopCoupon(params)
    }

    @Transactional
    def save(NideshopCoupon nideshopCouponInstance) {
        if (nideshopCouponInstance == null) {
            notFound()
            return
        }

        if (nideshopCouponInstance.hasErrors()) {
            respond nideshopCouponInstance.errors, view:'create'
            return
        }

        nideshopCouponInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopCoupon.label', default: 'NideshopCoupon'), nideshopCouponInstance.id])
                redirect nideshopCouponInstance
            }
            '*' { respond nideshopCouponInstance, [status: CREATED] }
        }
    }

    def edit(NideshopCoupon nideshopCouponInstance) {
        respond nideshopCouponInstance
    }

    @Transactional
    def update(NideshopCoupon nideshopCouponInstance) {
        if (nideshopCouponInstance == null) {
            notFound()
            return
        }

        if (nideshopCouponInstance.hasErrors()) {
            respond nideshopCouponInstance.errors, view:'edit'
            return
        }

        nideshopCouponInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopCoupon.label', default: 'NideshopCoupon'), nideshopCouponInstance.id])
                redirect nideshopCouponInstance
            }
            '*'{ respond nideshopCouponInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopCoupon nideshopCouponInstance) {

        if (nideshopCouponInstance == null) {
            notFound()
            return
        }

        nideshopCouponInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopCoupon.label', default: 'NideshopCoupon'), nideshopCouponInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopCoupon.label', default: 'NideshopCoupon'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
