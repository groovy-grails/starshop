package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopAdController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopAd.list(params), model:[nideshopAdInstanceCount: NideshopAd.count()]
    }

    def show(NideshopAd nideshopAdInstance) {
        respond nideshopAdInstance
    }

    def create() {
        respond new NideshopAd(params)
    }

    @Transactional
    def save(NideshopAd nideshopAdInstance) {
        if (nideshopAdInstance == null) {
            notFound()
            return
        }

        if (nideshopAdInstance.hasErrors()) {
            respond nideshopAdInstance.errors, view:'create'
            return
        }

        nideshopAdInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopAd.label', default: 'NideshopAd'), nideshopAdInstance.id])
                redirect nideshopAdInstance
            }
            '*' { respond nideshopAdInstance, [status: CREATED] }
        }
    }

    def edit(NideshopAd nideshopAdInstance) {
        respond nideshopAdInstance
    }

    @Transactional
    def update(NideshopAd nideshopAdInstance) {
        if (nideshopAdInstance == null) {
            notFound()
            return
        }

        if (nideshopAdInstance.hasErrors()) {
            respond nideshopAdInstance.errors, view:'edit'
            return
        }

        nideshopAdInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopAd.label', default: 'NideshopAd'), nideshopAdInstance.id])
                redirect nideshopAdInstance
            }
            '*'{ respond nideshopAdInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopAd nideshopAdInstance) {

        if (nideshopAdInstance == null) {
            notFound()
            return
        }

        nideshopAdInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopAd.label', default: 'NideshopAd'), nideshopAdInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopAd.label', default: 'NideshopAd'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
