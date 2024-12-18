package com.example.BatchReceiver.services;

import com.example.BatchReceiver.models.Payload;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BatchService {
    List<Payload> allPayloads = new ArrayList<>();

    public List<Payload> saveBatch(List<Payload> receivedBatch){
        allPayloads.addAll(receivedBatch);
        System.out.println("All Payloads : "+allPayloads);
        return allPayloads;
    }
}
