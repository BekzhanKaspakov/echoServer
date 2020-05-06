package com.bekzhankaspakov.echoServer;

import com.bekzhankaspakov.echoServer.EntriesMapper;
import com.bekzhankaspakov.echoServer.Entry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class EntriesResource {

    private EntriesMapper entriesMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    public EntriesResource(EntriesMapper entriesMapper){
        this.entriesMapper = entriesMapper;
    }

    @GetMapping("/helloworld")
    public String getAll() {
        return entriesMapper.findAll().get(0).getText();
    }

}
