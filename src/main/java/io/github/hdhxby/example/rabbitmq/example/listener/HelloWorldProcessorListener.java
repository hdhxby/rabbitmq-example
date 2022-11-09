package io.github.hdhxby.example.rabbitmq.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldProcessorListener {
    private Logger logger = LoggerFactory.getLogger(HelloWorldProcessorListener.class);

    @StreamListener(io.github.hdhxby.example.rabbitmq.example.massaging.HelloWorldProcessor.INPUT)
    public void test(String playload){
        logger.info(playload);
    }
}
