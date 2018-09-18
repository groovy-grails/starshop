package nideshop



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SysUserSysRoleController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond SysUserSysRole.list(params), model:[sysUserSysRoleInstanceCount: SysUserSysRole.count()]
    }

    def show(SysUserSysRole sysUserSysRoleInstance) {
        respond sysUserSysRoleInstance
    }

    def create() {
        respond new SysUserSysRole(params)
    }

    @Transactional
    def save(SysUserSysRole sysUserSysRoleInstance) {
        if (sysUserSysRoleInstance == null) {
            notFound()
            return
        }

        if (sysUserSysRoleInstance.hasErrors()) {
            respond sysUserSysRoleInstance.errors, view:'create'
            return
        }

        sysUserSysRoleInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'sysUserSysRole.label', default: 'SysUserSysRole'), sysUserSysRoleInstance.id])
                redirect sysUserSysRoleInstance
            }
            '*' { respond sysUserSysRoleInstance, [status: CREATED] }
        }
    }

    def edit(SysUserSysRole sysUserSysRoleInstance) {
        respond sysUserSysRoleInstance
    }

    @Transactional
    def update(SysUserSysRole sysUserSysRoleInstance) {
        if (sysUserSysRoleInstance == null) {
            notFound()
            return
        }

        if (sysUserSysRoleInstance.hasErrors()) {
            respond sysUserSysRoleInstance.errors, view:'edit'
            return
        }

        sysUserSysRoleInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'SysUserSysRole.label', default: 'SysUserSysRole'), sysUserSysRoleInstance.id])
                redirect sysUserSysRoleInstance
            }
            '*'{ respond sysUserSysRoleInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(SysUserSysRole sysUserSysRoleInstance) {

        if (sysUserSysRoleInstance == null) {
            notFound()
            return
        }

        sysUserSysRoleInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'SysUserSysRole.label', default: 'SysUserSysRole'), sysUserSysRoleInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'sysUserSysRole.label', default: 'SysUserSysRole'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
