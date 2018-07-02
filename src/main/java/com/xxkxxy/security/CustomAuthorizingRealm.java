//package com.xxkxxy.security;
//
//import com.xxkxxy.entity.User;
//import com.xxkxxy.service.UserService;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.subject.PrincipalCollection;
//
//import javax.annotation.Resource;
//
///**
// * shiro 授权
// * Created by LK on 2018/3/20.
// */
//public class CustomAuthorizingRealm extends AuthorizingRealm {
//
//    @Resource
//    private UserService userMng;
//
//    /**
//     * 获取授权信息
//     *
//     * @param principals
//     * @return 授权信息
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//
//        String username = (String) principals.getPrimaryPrincipal();
//
//        User user = this.userMng.findByUserName(username);
//
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        return simpleAuthorizationInfo;
//
////        //从 principals获取主身份信息
////        //将getPrimaryPrincipal方法返回值转为真实身份类型（在上边的doGetAuthenticationInfo认证通过填充到SimpleAuthenticationInfo中身份类型），
////        ActiveUser activeUser =  (ActiveUser) principals.getPrimaryPrincipal();
////
////        //根据身份信息获取权限信息
////        //从数据库获取到权限数据
////        List<SysPermission> permissionList = null;
////        try {
////            permissionList = sysService.findPermissionListByUserId(activeUser.getUserid());
////        } catch (Exception e) {
////            // TODO Auto-generated catch block
////            e.printStackTrace();
////        }
////        //单独定一个集合对象
////        List<String> permissions = new ArrayList<String>();
////        if(permissionList!=null){
////            for(SysPermission sysPermission:permissionList){
////                //将数据库中的权限标签 符放入集合
////                permissions.add(sysPermission.getPercode());
////            }
////        }
////
////
////		List<String> permissions = new ArrayList<String>();
////		permissions.add("user:create");//用户的创建
////		permissions.add("item:query");//商品查询权限
////		permissions.add("item:add");//商品添加权限
////		permissions.add("item:edit");//商品修改权限
////		//....
////
////        //查到权限数据，返回授权信息(要包括 上边的permissions)
////        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
////        //将上边查询到授权信息填充到simpleAuthorizationInfo对象中
////        simpleAuthorizationInfo.addStringPermissions(permissions);
////
////        return simpleAuthorizationInfo;
//    }
//
//    /**
//     * 身份认证
//     *
//     * @param token 认证令牌
//     * @return 认证信息
//     * @throws AuthenticationException
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
//        // token是用户输入的用户名和密码
//        // 第一步从token中取出用户名
//        UsernamePasswordToken authcToken = (UsernamePasswordToken) token;
//
//        User user = this.userMng.findByUserName(authcToken.getUsername());
//
//        if (user != null) {
//            return new SimpleAuthenticationInfo(user.getUserName(), user.getPassword(), getName());
//        } else {
//            return null;
//        }
//
////        String userCode = (String) token.getPrincipal();
////        // 第二步：根据用户输入的userCode从数据库查询
////        SysUser sysUser = null;
////        try {
////            sysUser = sysService.findSysUserByUserCode(userCode);
////        } catch (Exception e1) {
////            e1.printStackTrace();
////        }
////        // 如果查询不到返回null
////        if(user==null){//
////            return null;
////        }
////        // 从数据库查询到密码
////        String password = user.getPassword();
////
////        //盐
////        String salt = user.getSalt();
////
////        // 如果查询到返回认证信息AuthenticationInfo
////
////        //activeUser就是用户身份信息
////        ActiveUser activeUser = new ActiveUser();
////
////        activeUser.setUserid(sysUser.getId());
////        activeUser.setUsercode(sysUser.getUsercode());
////        activeUser.setUsername(sysUser.getUsername());
////        //..
////
////        //根据用户id取出菜单
////        List<SysPermission> menus  = null;
////        try {
////            //通过service取出菜单
////            menus = sysService.findMenuListByUserId(sysUser.getId());
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
////        //将用户菜单 设置到activeUser
////        activeUser.setMenus(menus);
////
////
////        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(
////                activeUser, password, ByteSource.Util.bytes(salt), this.getName());
////
////        return simpleAuthenticationInfo;
////
//
//    }
//}
