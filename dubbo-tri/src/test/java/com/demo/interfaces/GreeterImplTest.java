package com.demo.interfaces;

import com.demo.stub.Greeter;
import com.demo.stub.HelloReq;
import com.demo.stub.HelloResp;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 测试消费者
 */
@SpringBootTest
class GreeterImplTest {

    @DubboReference
    private Greeter greeter;

    @Test
    void greet() {
        HelloResp resp = greeter.greet(HelloReq.newBuilder().setName("zhang").build());
        System.out.println(resp.getMessage());
    }
}