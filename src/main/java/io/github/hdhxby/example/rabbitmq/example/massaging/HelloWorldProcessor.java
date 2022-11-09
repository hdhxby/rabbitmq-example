package io.github.hdhxby.example.rabbitmq.example.massaging;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface HelloWorldProcessor {
    String INPUT = "helloWorld";

    @Input(INPUT)
    SubscribableChannel input();

    String OUTPUT = "helloWorld";

    @Output(OUTPUT)
    MessageChannel output();
}
