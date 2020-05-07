package com.bekzhankaspakov.echoServer;

import com.bekzhankaspakov.echoServer.model.Entry;
import org.apache.ibatis.type.MappedTypes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Entry.class)
@SpringBootApplication
public class EchoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EchoServerApplication.class, args);
	}

}
