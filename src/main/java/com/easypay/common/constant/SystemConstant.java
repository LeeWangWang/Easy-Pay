package com.easypay.common.constant;

/**
 * @ClassName: SystemConstant
 * @Description: 系统级静态变量
 * @Author: lww
 * @Date: 6/28/23 10:57 AM
 * @Version: V1
 **/
public class SystemConstant {

    /**
     * 文件分隔符
     */
    public static final String SF_FILE_SEPARATOR = System.getProperty("file.separator");

    /**
     * 数据标识
     */
    public static final String DATA_ROWS = "rows";

    /**
     * 成功
     */
    public static final String SUCCESS = "success";
    /**
     * 失败
     */
    public static final String ERROR = "error";
    /**
     * 分頁
     */
    public static final Integer PAGE_SIZE = 10;

    public static final String FILE = "file";

    /**
     * 真
     */
    public static final String TRUE = "true";
    /**
     * 假
     */
    public static final String FALSE = "false";

    /**
     * 删除
     */
    public static final Short DELETE_STATUS_YES = 0;

    public static final Short DELETE_STATUS_NO = 1;


    /**
     * 头像：0  默认 1 上传
     */
    public static final Short AVATAR_STATUS_YES = 1;

    public static final Short AVATAR_STATUS_NO = 0;

    /**
     * 支付类型 0：微信  1：支付宝 2：微信公众号
     */
    public static final Short PAY_STATUS_YES = 1;

    public static final Short PAY_STATUS_NO = 0;

    public static final Short PAY_TYPE_WXP = 2;


    /**
     * 支付类型 0：微信  1：支付宝
     */
    public static final Short PAY_TYPE_WX = 0;

    public static final Short PAY_TYPE_ALI = 1;

    /**
     * 菜单类型
     */
    public enum MenuType {
        /**
         * 目录
         */
        CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private final int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    /**
     * 通用字典
     */
    public enum MacroType {

        /**
         * 类型
         */
        TYPE(0),

        /**
         * 参数
         */
        PARAM(1);

        private final int value;

        MacroType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

    }

    /**
     * 通用变量，表示可用、禁用、显示、隐藏、是、否
     */
    public enum StatusType {

        /**
         * 禁用，隐藏
         */
        DISABLE(0),

        /**
         * 可用，显示
         */
        ENABLE(1),

        /**
         * 显示
         */
        SHOW(1),

        /**
         * 隐藏
         */
        HIDDEN(0),

        /**
         * 是
         */
        YES(1),

        /**
         * 否
         */
        NO(0);

        private final int value;

        StatusType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
