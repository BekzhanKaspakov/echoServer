package com.bekzhankaspakov.echoServer.controller;

import com.bekzhankaspakov.echoServer.mapper.EntriesMapper;
import com.bekzhankaspakov.echoServer.model.Entry;
import com.bekzhankaspakov.echoServer.model.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EntriesController {

    private EntriesMapper entriesMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public EntriesController(EntriesMapper entriesMapper){
        this.entriesMapper = entriesMapper;
    }

    @GetMapping("/getEntries")
    public ResponseEntity<Object> getEntries() {
        ServiceResponse<List<Entry>> response = new ServiceResponse<>("success", entriesMapper.findAll());
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
