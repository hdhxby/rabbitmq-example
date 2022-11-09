package io.github.hdhxby.example.rabbitmq.example;

import io.github.hdhxby.example.rabbitmq.example.massaging.HelloWorldProcessor;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
public class MessageApplicationRunner implements ApplicationRunner {

    @Autowired
    private Processor processor;
    @Autowired
    private HelloWorldProcessor helloWorldProcessor;

    private RabbitMessagingTemplate rabbitMessagingTemplate;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming application arguments
     * @throws Exception on error
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        processor.output().send(new GenericMessage<>("rabbit."));
        helloWorldProcessor.output().send(new GenericMessage<>("hello."));
    }
}