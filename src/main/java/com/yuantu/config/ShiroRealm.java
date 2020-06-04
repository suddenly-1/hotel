package com.yuantu.config;

import com.yuantu.data.user.AccountMapper;
import com.yuantu.po.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

public class ShiroRealm extends AuthorizingRealm {

    public void setName(String name){
        super.setName("userRealm");
    }

    @Autowired
    private AccountMapper accountMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        Subject subject = SecurityUtils.getSubject();
        User currentUser = (User)subject.getPrincipal();
        simpleAuthorizationInfo.addStringPermission(currentUser.getUserType());
        return simpleAuthorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
        User user = accountMapper.queryUserByAccountName(userToken.getUsername());
        try {
            if (!userToken.getUsername().equals(user.getAccountNumber())){
                return null;
            }
            String password = new Md5Hash(user.getPassword(),user.getUsername(),3).toString();
            return new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
        } catch (Exception e) {
            return null;
        }

    }
}
