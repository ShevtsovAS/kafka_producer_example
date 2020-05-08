package com.example.kafka_producer_example.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("kafka")
public class KafkaProperties {
    public String bootstrapServers = "localhost:9092";
    public String studentTopic = "student_topic";
}
