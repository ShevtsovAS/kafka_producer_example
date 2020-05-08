package com.example.kafka_producer_example.controller;

import com.example.kafka_producer_example.model.Student;
import com.example.kafka_producer_example.sender.Sender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafkaProducer")
@RequiredArgsConstructor
public class KafkaController {

    private final Sender<Student> sender;

    @PostMapping
    public ResponseEntity<String> sendData(@RequestBody Student student) {
        sender.sendData(student);
        return ResponseEntity.ok("Data sent to Kafka");
    }

}
