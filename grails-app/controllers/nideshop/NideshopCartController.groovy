package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopCartController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopCart.list(params), model:[nideshopCartInstanceCount: NideshopCart.count()]
    }

    def show(NideshopCart nideshopCartInstance) {
        respond nideshopCartInstance
    }

    def create() {
        respond new NideshopCart(params)
    }

    @Transactional
    def save(NideshopCart nideshopCartInstance) {
        if (nideshopCartInstance == null) {
            notFound()
            return
        }

        if (nideshopCartInstance.hasErrors()) {
            respond nideshopCartInstance.errors, view:'create'
            return
        }

        nideshopCartInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopCart.label', default: 'NideshopCart'), nideshopCartInstance.id])
                redirect nideshopCartInstance
            }
            '*' { respond nideshopCartInstance, [status: CREATED] }
        }
    }

    def edit(NideshopCart nideshopCartInstance) {
        respond nideshopCartInstance
    }

    @Transactional
    def update(NideshopCart nideshopCartInstance) {
        if (nideshopCartInstance == null) {
            notFound()
            return
        }

        if (nideshopCartInstance.hasErrors()) {
            respond nideshopCartInstance.errors, view:'edit'
            return
        }

        nideshopCartInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopCart.label', default: 'NideshopCart'), nideshopCartInstance.id])
                redirect nideshopCartInstance
            }
            '*'{ respond nideshopCartInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopCart nideshopCartInstance) {

        if (nideshopCartInstance == null) {
            notFound()
            return
        }

        nideshopCartInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopCart.label', default: 'NideshopCart'), nideshopCartInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopCart.label', default: 'NideshopCart'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
