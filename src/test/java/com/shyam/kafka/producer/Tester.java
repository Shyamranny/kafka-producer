package com.shyam.kafka.producer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class Tester {
	// topic
	private static final String HELLOWORLD_TOPIC = "stayevents";

	@Autowired
	private Sender sender;
	
	// message
	String message = "{\"name\":\"Shyam\"}";

	@Test
	public void testSend() throws Exception {
		sender.send(HELLOWORLD_TOPIC, message);

	}
}
