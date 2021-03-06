package com.ljf.gmall.order.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;


@Configuration
public class MyRabbitMQConfig {

    //把Binding,Exchange放在容器中,在rabbitmq没有的情况下会创建该Binding/Exchange
    //但是Rabbitmq一旦有该Binding/Exchange，无法通过配置类方式覆盖原来的

    /**
     * 死信队列
     *
     * @return
     */@Bean
    public Queue orderDelayQueue() {
        /*
        Queue(String name, boolean durable, boolean exclusive,
        boolean autoDelete, Map<String, Object> arguments)
        */
        HashMap<String, Object> arguments = new HashMap<>();
        arguments.put("x-dead-letter-exchange", "order-event-exchange");
        arguments.put("x-dead-letter-routing-key", "order.release.order");
        arguments.put("x-message-ttl", 60000); // 消息过期时间 1分钟
        Queue queue = new Queue("order.delay.queue", true, false, false, arguments);

        return queue;
    }

    /**
     * 普通队列
     *
     * @return
     */
    @Bean
    public Queue orderReleaseQueue() {

        Queue queue = new Queue("order.release.order.queue", true, false, false);

        return queue;
    }

    /**
     * TopicExchange
     *
     * @return
     */
    @Bean
    public Exchange orderEventExchange() {
        //String name, boolean durable, boolean autoDelete, Map<String, Object> arguments
        return new TopicExchange("order-event-exchange", true, false);

    }


    @Bean
    public Binding orderCreateBinding() {
        //String destination, Binding.DestinationType destinationType,String exchange, String routingKey, Map<String, Object> arguments
        return new Binding("order.delay.queue",
                Binding.DestinationType.QUEUE,
                "order-event-exchange",
                "order.create.order",
                null);
    }

    @Bean
    public Binding orderReleaseBinding() {

        return new Binding("order.release.order.queue",
                Binding.DestinationType.QUEUE,
                "order-event-exchange",
                "order.release.order",
                null);
    }

    /**
     * 订单释放直接和库存释放进行绑定
     * @return
     */
    @Bean
    public Binding orderReleaseOtherBinding() {

        return new Binding("stock.release.stock.queue",
                Binding.DestinationType.QUEUE,
                "order-event-exchange",
                "order.release.other.#",
                null);
    }


    /**
     * 商品秒杀队列
     * @return
     */
    @Bean
    public Queue orderSecKillOrrderQueue() {
        Queue queue = new Queue("order.seckill.order.queue", true, false, false);
        return queue;
    }

    @Bean
    public Binding orderSecKillOrrderQueueBinding() {

        Binding binding = new Binding(
                "order.seckill.order.queue",
                Binding.DestinationType.QUEUE,
                "order-event-exchange",
                "order.seckill.order",
                null);

        return binding;
    }


}
