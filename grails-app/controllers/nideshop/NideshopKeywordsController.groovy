package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopKeywordsController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopKeywords.list(params), model:[nideshopKeywordsInstanceCount: NideshopKeywords.count()]
    }

    def show(NideshopKeywords nideshopKeywordsInstance) {
        respond nideshopKeywordsInstance
    }

    def create() {
        respond new NideshopKeywords(params)
    }

    @Transactional
    def save(NideshopKeywords nideshopKeywordsInstance) {
        if (nideshopKeywordsInstance == null) {
            notFound()
            return
        }

        if (nideshopKeywordsInstance.hasErrors()) {
            respond nideshopKeywordsInstance.errors, view:'create'
            return
        }

        nideshopKeywordsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopKeywords.label', default: 'NideshopKeywords'), nideshopKeywordsInstance.id])
                redirect nideshopKeywordsInstance
            }
            '*' { respond nideshopKeywordsInstance, [status: CREATED] }
        }
    }

    def edit(NideshopKeywords nideshopKeywordsInstance) {
        respond nideshopKeywordsInstance
    }

    @Transactional
    def update(NideshopKeywords nideshopKeywordsInstance) {
        if (nideshopKeywordsInstance == null) {
            notFound()
            return
        }

        if (nideshopKeywordsInstance.hasErrors()) {
            respond nideshopKeywordsInstance.errors, view:'edit'
            return
        }

        nideshopKeywordsInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopKeywords.label', default: 'NideshopKeywords'), nideshopKeywordsInstance.id])
                redirect nideshopKeywordsInstance
            }
            '*'{ respond nideshopKeywordsInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopKeywords nideshopKeywordsInstance) {

        if (nideshopKeywordsInstance == null) {
            notFound()
            return
        }

        nideshopKeywordsInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopKeywords.label', default: 'NideshopKeywords'), nideshopKeywordsInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopKeywords.label', default: 'NideshopKeywords'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
