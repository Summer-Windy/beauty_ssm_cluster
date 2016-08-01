package com.yingjun.ssm.validator.constant;


public class CommPattern {
    /**通用类型**/
    public static final String NUM = "^[\\d]+$";
    public static final String CHARORNUM = "^[\\w\\s]+$";

    public static final String NAME = "^[\\w\\s-(%20)]+$";
    public static final String CHINANAME = "^[\\w\u4e00-\u9fa5\\s-]+$";
    public static final String TELPHONE = "^[\\d\\s-]+$";
    public static final String TEXT = "^[\\w\\s-~!@#$%&(),.:+]+$";
    public static final String EMAIL = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
    /** like US/CA/ED **/
    public static final String COUNTRY = "^([A-Z]{2}/)*([A-Z]{2}$)|^[A-Z]{2}$";
    /** 6位字符数字 **/
    public static final String PNR = "^[A-Za-z\\d]{6}$";
}
