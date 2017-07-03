package com.zml.demo3.config;/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */

import com.zml.demo3.model.User;
import com.zml.demo3.service.IUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: zhumeilu
 * Date: 2017/7/3
 * Time: 10:01
 * To change this template use File | Settings | File Templates.
 */
public class UserRealm extends AuthorizingRealm {
    private final Logger logger = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private IUserService userService;
    /**
     * 授权
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User)principalCollection.getPrimaryPrincipal();
        //查询用户的角色和权限
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Set<String> roles =userService.getRoleNamesByUserId(user.getId());
        logger.info("用户的角色名："+roles);

        Set<String> permissions = userService.getPermissionsNameByRoleNames(roles);
        logger.info("权限名："+permissions);
        info.setRoles(roles);
        info.setStringPermissions(permissions);
        return info;
    }

    /**
     * 认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
        User user = userService.findByUsername(username);
        if(user==null){
            throw new UnknownAccountException();    //账户不存在
        }
        return new SimpleAuthenticationInfo(user,user.getPassword(),getName());
    }
}
