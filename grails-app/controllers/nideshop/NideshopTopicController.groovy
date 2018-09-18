package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class NideshopTopicController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond NideshopTopic.list(params), model:[nideshopTopicInstanceCount: NideshopTopic.count()]
    }

    def show(NideshopTopic nideshopTopicInstance) {
        respond nideshopTopicInstance
    }

    def create() {
        respond new NideshopTopic(params)
    }

    @Transactional
    def save(NideshopTopic nideshopTopicInstance) {
        if (nideshopTopicInstance == null) {
            notFound()
            return
        }

        if (nideshopTopicInstance.hasErrors()) {
            respond nideshopTopicInstance.errors, view:'create'
            return
        }

        nideshopTopicInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'nideshopTopic.label', default: 'NideshopTopic'), nideshopTopicInstance.id])
                redirect nideshopTopicInstance
            }
            '*' { respond nideshopTopicInstance, [status: CREATED] }
        }
    }

    def edit(NideshopTopic nideshopTopicInstance) {
        respond nideshopTopicInstance
    }

    @Transactional
    def update(NideshopTopic nideshopTopicInstance) {
        if (nideshopTopicInstance == null) {
            notFound()
            return
        }

        if (nideshopTopicInstance.hasErrors()) {
            respond nideshopTopicInstance.errors, view:'edit'
            return
        }

        nideshopTopicInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'NideshopTopic.label', default: 'NideshopTopic'), nideshopTopicInstance.id])
                redirect nideshopTopicInstance
            }
            '*'{ respond nideshopTopicInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(NideshopTopic nideshopTopicInstance) {

        if (nideshopTopicInstance == null) {
            notFound()
            return
        }

        nideshopTopicInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'NideshopTopic.label', default: 'NideshopTopic'), nideshopTopicInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'nideshopTopic.label', default: 'NideshopTopic'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
