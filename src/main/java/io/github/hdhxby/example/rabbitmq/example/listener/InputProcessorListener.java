package io.github.hdhxby.example.rabbitmq.example.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

@Component
public class InputProcessorListener {

    private Logger logger = LoggerFactory.getLogger(InputProcessorListener.class);

    @StreamListener(Sink.INPUT)
    public void test(String playload){
        logger.info(playload);
    }
}
