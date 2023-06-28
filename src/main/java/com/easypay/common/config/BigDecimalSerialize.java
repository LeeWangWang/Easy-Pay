package com.easypay.common.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * @ClassName: BigDecimalSerialize
 * @Description:
 * @Author: lww
 * @Date: 6/28/23 10:55 AM
 * @Version: V1
 **/
public class BigDecimalSerialize extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializerProvider) throws IOException {
        if (value != null && !"".equals(value)) {
            gen.writeString(value.setScale(2, BigDecimal.ROUND_HALF_DOWN) + "");
        } else {
            gen.writeString(value + "");
        }
    }

}