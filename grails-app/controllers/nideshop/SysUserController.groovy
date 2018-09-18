package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SysUserController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond SysUser.list(params), model:[sysUserInstanceCount: SysUser.count()]
    }

    def show(SysUser sysUserInstance) {
        respond sysUserInstance
    }

    def create() {
        respond new SysUser(params)
    }

    @Transactional
    def save(SysUser sysUserInstance) {
        if (sysUserInstance == null) {
            notFound()
            return
        }

        if (sysUserInstance.hasErrors()) {
            respond sysUserInstance.errors, view:'create'
            return
        }

        sysUserInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sysUser.label', default: 'SysUser'), sysUserInstance.id])
                redirect sysUserInstance
            }
            '*' { respond sysUserInstance, [status: CREATED] }
        }
    }

    def edit(SysUser sysUserInstance) {
        respond sysUserInstance
    }

    @Transactional
    def update(SysUser sysUserInstance) {
        if (sysUserInstance == null) {
            notFound()
            return
        }

        if (sysUserInstance.hasErrors()) {
            respond sysUserInstance.errors, view:'edit'
            return
        }

        sysUserInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'SysUser.label', default: 'SysUser'), sysUserInstance.id])
                redirect sysUserInstance
            }
            '*'{ respond sysUserInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(SysUser sysUserInstance) {

        if (sysUserInstance == null) {
            notFound()
            return
        }

        sysUserInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'SysUser.label', default: 'SysUser'), sysUserInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sysUser.label', default: 'SysUser'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
