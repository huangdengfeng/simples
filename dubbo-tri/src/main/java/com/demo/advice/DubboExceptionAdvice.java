package com.demo.advice;

import com.seezoon.dubbo.advice.DubboAdvice;
import com.seezoon.dubbo.advice.DubboExceptionHandler;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author dfenghuang
 * @date 2023/3/21 19:22
 */
@DubboAdvice
public class DubboExceptionAdvice {

    @DubboExceptionHandler({IllegalArgumentException.class})
    public void illegalArgumentException(Exception e) {
        throw new RpcException(100, e.getMessage());
    }
}
