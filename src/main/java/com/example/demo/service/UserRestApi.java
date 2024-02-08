package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import java.util.List;

public class UserRestApi{
    public List<String> getUsuarios() {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://jsonplaceholder.typicode.com/users";
        return restTemplate.getForObject(url, List.class);
    }
}
