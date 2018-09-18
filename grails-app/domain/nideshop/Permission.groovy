package nideshop


class Permission {

   SysUser user
   String permission
   static constraints = {
      permission unique: 'user'
   }
   public String toString() {
	   return permission
   }
}
