package io.richa.springdata;

import io.richa.springdata.model.Course;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        String resourceUrl = "http://localhost:8081/users/list";
        //HttpEntity<String> entity = new HttpEntity<String>(headers);
       // ResponseEntity<String> responseEntity = restTemplate.exchange(resourceUrl,HttpMethod.GET, String.class);
        ResponseEntity<String> responseEntity  = restTemplate.getForEntity(resourceUrl, String.class);
        System.out.println(responseEntity);

    }
}
