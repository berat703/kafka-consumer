package com.teb.consumer.Interfaces;

public interface IKafkaConstants {
    String KAFKA_BROKERS = "192.168.1.182:9092";
    Integer MESSAGE_COUNT = 1000;
    String CLIENT_ID = "client1";
    String TOPIC_NAME = "log-monitoring";
    String GROUP_ID_CONFIG = "consumerGroup1";
    Integer MAX_NO_MESSAGE_FOUND_COUNT = 100;
    String OFFSET_RESET_LATEST = "latest";
    String OFFSET_RESET_EARLIER = "earliest";
    Integer MAX_POLL_RECORDS = 1;
}