package com.consumer.consumer;

import com.consumer.consumer.client.ProducerClient;
import com.consumer.consumer.client.UserClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerApplicationTests {

    @Autowired
    private ProducerClient producerClient;

    @Autowired
    private UserClient userClient;

    @Test
    public void test() {

        System.out.println("===========================");

        for (int i = 0; i < 6; i++) {
            System.out.println(producerClient.getProduct());
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(userClient.getUser());
        }

        System.out.println("============================");
    }

}
