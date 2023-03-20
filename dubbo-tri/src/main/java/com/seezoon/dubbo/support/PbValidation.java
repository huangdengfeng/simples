package com.seezoon.dubbo.support;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.validation.Validation;
import org.apache.dubbo.validation.Validator;

/**
 * PB 校验
 *
 * @author dfenghuang
 * @date 2023/3/20 22:03
 */
public class PbValidation implements Validation {

    private static final Validator validator = new PbValidator();

    @Override
    public Validator getValidator(URL url) {
        return validator;
    }
}
