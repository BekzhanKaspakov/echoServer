package com.bekzhankaspakov.echoServer.controller;

import com.bekzhankaspakov.echoServer.mapper.EntriesMapper;
import com.bekzhankaspakov.echoServer.model.Entry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
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

    @GetMapping("/helloworld")
    public @ResponseBody String getAll() {
        String text = entriesMapper.findAll().get(0).getText();
        String result = "<h1>" + text + "</h1>";
        return result;
    }

    @GetMapping("/getEntries")
    public ResponseEntity<Object> getEntries() {
        ServiceResponse<List<Entry>> response = new ServiceResponse<>("success", entriesMapper.findAll());
        return new ResponseEntity<Object>(response, HttpStatus.OK);
    }
}
