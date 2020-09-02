package com.zhenglei.rabbitmq.topic;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "topic.woman")
public class TopicWomanReceiver1 {

    @RabbitHandler
    public void process(Map testMessage) {
        System.out.println("TopicWomanReceiver消费者1收到消息  : " + testMessage.toString());
    }
}