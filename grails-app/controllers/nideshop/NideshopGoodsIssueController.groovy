package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopGoodsIssueController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopGoodsIssue.list(params), model:[nideshopGoodsIssueInstanceCount: NideshopGoodsIssue.count()]
    }

    def show(NideshopGoodsIssue nideshopGoodsIssueInstance) {
        respond nideshopGoodsIssueInstance
    }

    def create() {
        respond new NideshopGoodsIssue(params)
    }

    @Transactional
    def save(NideshopGoodsIssue nideshopGoodsIssueInstance) {
        if (nideshopGoodsIssueInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsIssueInstance.hasErrors()) {
            respond nideshopGoodsIssueInstance.errors, view:'create'
            return
        }

        nideshopGoodsIssueInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopGoodsIssue.label', default: 'NideshopGoodsIssue'), nideshopGoodsIssueInstance.id])
                redirect nideshopGoodsIssueInstance
            }
            '*' { respond nideshopGoodsIssueInstance, [status: CREATED] }
        }
    }

    def edit(NideshopGoodsIssue nideshopGoodsIssueInstance) {
        respond nideshopGoodsIssueInstance
    }

    @Transactional
    def update(NideshopGoodsIssue nideshopGoodsIssueInstance) {
        if (nideshopGoodsIssueInstance == null) {
            notFound()
            return
        }

        if (nideshopGoodsIssueInstance.hasErrors()) {
            respond nideshopGoodsIssueInstance.errors, view:'edit'
            return
        }

        nideshopGoodsIssueInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopGoodsIssue.label', default: 'NideshopGoodsIssue'), nideshopGoodsIssueInstance.id])
                redirect nideshopGoodsIssueInstance
            }
            '*'{ respond nideshopGoodsIssueInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopGoodsIssue nideshopGoodsIssueInstance) {

        if (nideshopGoodsIssueInstance == null) {
            notFound()
            return
        }

        nideshopGoodsIssueInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopGoodsIssue.label', default: 'NideshopGoodsIssue'), nideshopGoodsIssueInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopGoodsIssue.label', default: 'NideshopGoodsIssue'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
