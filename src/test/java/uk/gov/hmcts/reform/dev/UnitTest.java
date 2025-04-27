package uk.gov.hmcts.reform.dev;
import static org.assertj.core.api.Assertions.assertThat;

import uk.gov.hmcts.reform.dev.controllers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class UnitTest {

    //TODO: look more into how to do springboot unit test

    @LocalServerPort
    private int port;

    @Autowired
    private CaseController controller;
    private TestRestTemplate rest;

    @Test
    void contextLoads(){

    }

    @Test
    void contextConLoads(){
        assertThat(controller).isNotNull();
    }

    @Test
    void defaultMessage(){//Test failing
        assertThat(this.rest.getForObject("http://localhost:"+port+"/",String.class)).contains("");
    }
    
}
