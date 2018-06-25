package org.ibase4j;

import top.ibase4j.core.util.SecurityUtil;

/**
 * Created by huangning on 2018/6/24.
 */
public class MyUtil {
    public static void main(String[] args) {
        byte[] KEY = {9, -1, 0, 5, 39, 8, 6, 19};
        String enecryt = SecurityUtil.encryptDes("art123",KEY);
        System.out.println(enecryt);
        System.out.println(SecurityUtil.decryptDes(enecryt,KEY));
    }
}
