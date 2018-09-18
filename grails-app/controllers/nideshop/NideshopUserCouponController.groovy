package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopUserCouponController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopUserCoupon.list(params), model:[nideshopUserCouponInstanceCount: NideshopUserCoupon.count()]
    }

    def show(NideshopUserCoupon nideshopUserCouponInstance) {
        respond nideshopUserCouponInstance
    }

    def create() {
        respond new NideshopUserCoupon(params)
    }

    @Transactional
    def save(NideshopUserCoupon nideshopUserCouponInstance) {
        if (nideshopUserCouponInstance == null) {
            notFound()
            return
        }

        if (nideshopUserCouponInstance.hasErrors()) {
            respond nideshopUserCouponInstance.errors, view:'create'
            return
        }

        nideshopUserCouponInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopUserCoupon.label', default: 'NideshopUserCoupon'), nideshopUserCouponInstance.id])
                redirect nideshopUserCouponInstance
            }
            '*' { respond nideshopUserCouponInstance, [status: CREATED] }
        }
    }

    def edit(NideshopUserCoupon nideshopUserCouponInstance) {
        respond nideshopUserCouponInstance
    }

    @Transactional
    def update(NideshopUserCoupon nideshopUserCouponInstance) {
        if (nideshopUserCouponInstance == null) {
            notFound()
            return
        }

        if (nideshopUserCouponInstance.hasErrors()) {
            respond nideshopUserCouponInstance.errors, view:'edit'
            return
        }

        nideshopUserCouponInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopUserCoupon.label', default: 'NideshopUserCoupon'), nideshopUserCouponInstance.id])
                redirect nideshopUserCouponInstance
            }
            '*'{ respond nideshopUserCouponInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopUserCoupon nideshopUserCouponInstance) {

        if (nideshopUserCouponInstance == null) {
            notFound()
            return
        }

        nideshopUserCouponInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopUserCoupon.label', default: 'NideshopUserCoupon'), nideshopUserCouponInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopUserCoupon.label', default: 'NideshopUserCoupon'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
