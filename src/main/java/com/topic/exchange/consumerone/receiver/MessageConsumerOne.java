package com.topic.exchange.consumerone.receiver;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MessageConsumerOne implements MessageListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumerOne.class);
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onMessage(Message message) {

        try {
            String msgOne = objectMapper.readValue(message.getBody(), String.class);
            LOGGER.info("consumer One msg:::{}", msgOne);

        } catch (IOException e) {
            LOGGER.error("method=onMessage message=dataOrApplicationError", e);
        }

    }
}
