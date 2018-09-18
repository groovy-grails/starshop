package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopSearchHistoryController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopSearchHistory.list(params), model:[nideshopSearchHistoryInstanceCount: NideshopSearchHistory.count()]
    }

    def show(NideshopSearchHistory nideshopSearchHistoryInstance) {
        respond nideshopSearchHistoryInstance
    }

    def create() {
        respond new NideshopSearchHistory(params)
    }

    @Transactional
    def save(NideshopSearchHistory nideshopSearchHistoryInstance) {
        if (nideshopSearchHistoryInstance == null) {
            notFound()
            return
        }

        if (nideshopSearchHistoryInstance.hasErrors()) {
            respond nideshopSearchHistoryInstance.errors, view:'create'
            return
        }

        nideshopSearchHistoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopSearchHistory.label', default: 'NideshopSearchHistory'), nideshopSearchHistoryInstance.id])
                redirect nideshopSearchHistoryInstance
            }
            '*' { respond nideshopSearchHistoryInstance, [status: CREATED] }
        }
    }

    def edit(NideshopSearchHistory nideshopSearchHistoryInstance) {
        respond nideshopSearchHistoryInstance
    }

    @Transactional
    def update(NideshopSearchHistory nideshopSearchHistoryInstance) {
        if (nideshopSearchHistoryInstance == null) {
            notFound()
            return
        }

        if (nideshopSearchHistoryInstance.hasErrors()) {
            respond nideshopSearchHistoryInstance.errors, view:'edit'
            return
        }

        nideshopSearchHistoryInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopSearchHistory.label', default: 'NideshopSearchHistory'), nideshopSearchHistoryInstance.id])
                redirect nideshopSearchHistoryInstance
            }
            '*'{ respond nideshopSearchHistoryInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopSearchHistory nideshopSearchHistoryInstance) {

        if (nideshopSearchHistoryInstance == null) {
            notFound()
            return
        }

        nideshopSearchHistoryInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopSearchHistory.label', default: 'NideshopSearchHistory'), nideshopSearchHistoryInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopSearchHistory.label', default: 'NideshopSearchHistory'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
