package com.easypay.common.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @ClassName: MD5Utils
 * @Description: MD5加密工具
 * @Author: lww
 * @Date: 6/28/23 7:30 PM
 * @Version: V1
 **/
public class MD5Utils {

    private static final String SALT = "123qwedcxzaq";

    private static final String ALGORITH_NAME = "md5";

    private static final int HASH_ITERATIONS = 2;

    /**
     * 使用md5生成加密后的密码
     * @return
     */
    public static String encrypt(String pswd) {
        String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(SALT), HASH_ITERATIONS).toHex();
        return newPassword;
    }

    /**
     * 使用md5生成加密后的密码
     * @return
     */
    public static String encrypt(String username, String pswd) {
        String newPassword = new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(username + SALT), HASH_ITERATIONS).toHex();
        return newPassword;
    }

    public static void main(String[] args) {
        System.out.println(encrypt("admin", "admin2023"));
        System.out.println(encrypt("pay", "pay2023"));
    }

}