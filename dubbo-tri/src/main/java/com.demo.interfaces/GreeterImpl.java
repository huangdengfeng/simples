package com.demo.interfaces;

import com.demo.stub.Greeter;
import com.demo.stub.HelloReq;
import com.demo.stub.HelloResp;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.context.ApplicationContext;

/**
 * 暴露服务
 */
@DubboService
public class GreeterImpl implements Greeter {

    ApplicationContext applicationContext;

    @Override
    public HelloResp greet(HelloReq request) {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        if (1 == 1) {
//            throw new IllegalArgumentException("test IllegalArgumentException");
//            throw new StatusRpcException(
//                    TriRpcStatus.INTERNAL.withCause(new RpcException(1000, "test errr")).withDescription
//                            ("参数错误"));
//            throw new RpcException(100, "test error");
        }
        return HelloResp.newBuilder().setMessage("hello world," + request.getName()).build();
    }
}
