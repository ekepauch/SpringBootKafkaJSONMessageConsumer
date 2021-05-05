package com.onlinetutorialspoint;


import com.onlinetutorialspoint.model.Item;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "items-topic", groupId = "sample-group",containerFactory = "kafkaListener")
    public void consume(Item item){

        System.out.println("Consumed Message :"+item);
    }
}
