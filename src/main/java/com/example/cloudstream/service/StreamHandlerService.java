package com.example.cloudstream.service;

import com.example.cloudstream.model.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@EnableBinding(Sink.class)
@MessageEndpoint
public class StreamHandlerService {
    @StreamListener(target = Sink.INPUT)
    public void storeBook(Book receivedBook) throws Exception {
        log.info("storeBook: handle message " + receivedBook);
    }
}
