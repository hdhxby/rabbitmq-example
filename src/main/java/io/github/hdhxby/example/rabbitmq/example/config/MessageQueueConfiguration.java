package io.github.hdhxby.example.rabbitmq.example.config;

import io.github.hdhxby.example.rabbitmq.example.massaging.HelloWorldProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;

@EnableBinding({Processor.class, HelloWorldProcessor.class})
public class MessageQueueConfiguration {

}
