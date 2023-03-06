package com.demo.interfaces;

import com.demo.stub.Greeter;
import com.demo.stub.HelloReq;
import com.demo.stub.HelloResp;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 暴露服务
 */
@DubboService
public class GreeterImpl implements Greeter {

    @Override
    public HelloResp greet(HelloReq request) {
        return HelloResp.newBuilder().setMessage("hello world," + request.getName()).build();
    }
}
