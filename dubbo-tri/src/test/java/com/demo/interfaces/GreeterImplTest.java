package com.demo.interfaces;

import com.demo.stub.Greeter;
import com.demo.stub.HelloReq;
import com.demo.stub.HelloResp;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.RpcException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试消费者
 */
@SpringBootTest
class GreeterImplTest {

    @DubboReference
    private Greeter greeter;

    public static void main(String[] args) {
        HelloReq req = HelloReq.newBuilder().setName("zhang").build();
        System.out.println(req);
    }

    @Test
    void greet() {
        try {
            HelloResp resp = greeter.greet(HelloReq.newBuilder().setName("zhang").build());
            resp.toString();
            System.out.println(resp.getMessage());
        } catch (RpcException rpcException) {
            rpcException.printStackTrace();
            System.out.println(rpcException);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}