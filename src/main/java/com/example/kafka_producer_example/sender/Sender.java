package com.example.kafka_producer_example.sender;

public interface Sender<T> {
    void sendData(T data);
}
