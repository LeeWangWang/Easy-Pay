package com.easypay.common.util;

import com.easypay.common.constant.MsgConstant;
import com.easypay.common.constant.SystemConstant;
import com.easypay.common.model.Result;

/**
 * @ClassName: CommonUtils
 * @Description: 通用工具类
 * @Author: lww
 * @Date: 6/28/23 7:23 PM
 * @Version: V1
 **/
public class CommonUtils {

    /**
     * 对象是否为空
     *
     * @param obj
     * @return
     */
    public static boolean isNullOrEmpty(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }


    /**
     * 查询详情提示
     * @param data
     * @return
     */
    public static Result msg(Object data) {
        if (isNullOrEmpty(data)) {
            return Result.error(MsgConstant.MSG_INIT_FORM);
        }
        return Result.ok(data);
    }

    /**
     * 返回数据
     *
     * @param data
     * @return
     */
    public static Result msgNotCheckNull(Object data) {
        return Result.ok().put(SystemConstant.DATA_ROWS, data);
    }

}