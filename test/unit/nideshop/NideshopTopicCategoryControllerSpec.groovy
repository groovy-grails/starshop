package nideshop



import grails.test.mixin.*
import spock.lang.*

@TestFor(NideshopTopicCategoryController)
@Mock(NideshopTopicCategory)
class NideshopTopicCategoryControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when:"The index action is executed"
            controller.index()

        then:"The model is correct"
            !model.nideshopTopicCategoryInstanceList
            model.nideshopTopicCategoryInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when:"The create action is executed"
            controller.create()

        then:"The model is correctly created"
            model.nideshopTopicCategoryInstance!= null
    }

    void "Test the save action correctly persists an instance"() {

        when:"The save action is executed with an invalid instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'POST'
            def nideshopTopicCategory = new NideshopTopicCategory()
            nideshopTopicCategory.validate()
            controller.save(nideshopTopicCategory)

        then:"The create view is rendered again with the correct model"
            model.nideshopTopicCategoryInstance!= null
            view == 'create'

        when:"The save action is executed with a valid instance"
            response.reset()
            populateValidParams(params)
            nideshopTopicCategory = new NideshopTopicCategory(params)

            controller.save(nideshopTopicCategory)

        then:"A redirect is issued to the show action"
            response.redirectedUrl == '/nideshopTopicCategory/show/1'
            controller.flash.message != null
            NideshopTopicCategory.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when:"The show action is executed with a null domain"
            controller.show(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the show action"
            populateValidParams(params)
            def nideshopTopicCategory = new NideshopTopicCategory(params)
            controller.show(nideshopTopicCategory)

        then:"A model is populated containing the domain instance"
            model.nideshopTopicCategoryInstance == nideshopTopicCategory
    }

    void "Test that the edit action returns the correct model"() {
        when:"The edit action is executed with a null domain"
            controller.edit(null)

        then:"A 404 error is returned"
            response.status == 404

        when:"A domain instance is passed to the edit action"
            populateValidParams(params)
            def nideshopTopicCategory = new NideshopTopicCategory(params)
            controller.edit(nideshopTopicCategory)

        then:"A model is populated containing the domain instance"
            model.nideshopTopicCategoryInstance == nideshopTopicCategory
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when:"Update is called for a domain instance that doesn't exist"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'PUT'
            controller.update(null)

        then:"A 404 error is returned"
            response.redirectedUrl == '/nideshopTopicCategory/index'
            flash.message != null


        when:"An invalid domain instance is passed to the update action"
            response.reset()
            def nideshopTopicCategory = new NideshopTopicCategory()
            nideshopTopicCategory.validate()
            controller.update(nideshopTopicCategory)

        then:"The edit view is rendered again with the invalid instance"
            view == 'edit'
            model.nideshopTopicCategoryInstance == nideshopTopicCategory

        when:"A valid domain instance is passed to the update action"
            response.reset()
            populateValidParams(params)
            nideshopTopicCategory = new NideshopTopicCategory(params).save(flush: true)
            controller.update(nideshopTopicCategory)

        then:"A redirect is issues to the show action"
            response.redirectedUrl == "/nideshopTopicCategory/show/$nideshopTopicCategory.id"
            flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when:"The delete action is called for a null instance"
            request.contentType = FORM_CONTENT_TYPE
            request.method = 'DELETE'
            controller.delete(null)

        then:"A 404 is returned"
            response.redirectedUrl == '/nideshopTopicCategory/index'
            flash.message != null

        when:"A domain instance is created"
            response.reset()
            populateValidParams(params)
            def nideshopTopicCategory = new NideshopTopicCategory(params).save(flush: true)

        then:"It exists"
            NideshopTopicCategory.count() == 1

        when:"The domain instance is passed to the delete action"
            controller.delete(nideshopTopicCategory)

        then:"The instance is deleted"
            NideshopTopicCategory.count() == 0
            response.redirectedUrl == '/nideshopTopicCategory/index'
            flash.message != null
    }
}
