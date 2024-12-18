package com.example.BatchReceiver.controllers;

import com.example.BatchReceiver.models.Payload;
import com.example.BatchReceiver.services.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BatchController {
    @Autowired
    private BatchService batchService;

    @PostMapping("/process-batch")
    public List<Payload> processBatch(@RequestBody List<Payload> payloadBatch){
        return batchService.saveBatch(payloadBatch);
    }
}
