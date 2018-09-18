package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAddressController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAddress.list(params), model:[nideshopAddressInstanceCount: NideshopAddress.count()]
    }

    def show(NideshopAddress nideshopAddressInstance) {
        respond nideshopAddressInstance
    }

    def create() {
        respond new NideshopAddress(params)
    }

    @Transactional
    def save(NideshopAddress nideshopAddressInstance) {
        if (nideshopAddressInstance == null) {
            notFound()
            return
        }

        if (nideshopAddressInstance.hasErrors()) {
            respond nideshopAddressInstance.errors, view:'create'
            return
        }

        nideshopAddressInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAddress.label', default: 'NideshopAddress'), nideshopAddressInstance.id])
                redirect nideshopAddressInstance
            }
            '*' { respond nideshopAddressInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAddress nideshopAddressInstance) {
        respond nideshopAddressInstance
    }

    @Transactional
    def update(NideshopAddress nideshopAddressInstance) {
        if (nideshopAddressInstance == null) {
            notFound()
            return
        }

        if (nideshopAddressInstance.hasErrors()) {
            respond nideshopAddressInstance.errors, view:'edit'
            return
        }

        nideshopAddressInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAddress.label', default: 'NideshopAddress'), nideshopAddressInstance.id])
                redirect nideshopAddressInstance
            }
            '*'{ respond nideshopAddressInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAddress nideshopAddressInstance) {

        if (nideshopAddressInstance == null) {
            notFound()
            return
        }

        nideshopAddressInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAddress.label', default: 'NideshopAddress'), nideshopAddressInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAddress.label', default: 'NideshopAddress'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
