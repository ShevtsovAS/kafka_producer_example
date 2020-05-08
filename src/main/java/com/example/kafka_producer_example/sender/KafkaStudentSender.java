package com.example.kafka_producer_example.sender;

import com.example.kafka_producer_example.config.KafkaProperties;
import com.example.kafka_producer_example.model.Student;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaStudentSender implements Sender<Student> {

    private final KafkaTemplate<String, Student> kafkaTemplate;
    private final KafkaProperties kafkaProperties;

    @Override
    public void sendData(Student student) {
        kafkaTemplate.send(kafkaProperties.getTopic(), student);
        log.info("Data {} sent to Kafka topic {}", student, kafkaProperties.getTopic());
    }
}
