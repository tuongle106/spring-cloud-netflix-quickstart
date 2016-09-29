package com.labs.quickstart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created on 9/29/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldTest
{
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHelloWorld()
    {
        final String body = restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello world !!!");
    }
}
