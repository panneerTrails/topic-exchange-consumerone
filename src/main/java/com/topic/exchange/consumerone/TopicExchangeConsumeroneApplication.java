package com.topic.exchange.consumerone;

import com.topic.exchange.consumerone.receiver.MessageConsumerOne;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TopicExchangeConsumeroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopicExchangeConsumeroneApplication.class, args);
	}
}
