package com.example.demo;

import com.example.demo.Service.CityService;
import com.example.demo.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private CityService cityService;

    @Autowired
    private DataSource dataSource;


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("----------------------------");
        System.out.println("DATASOURCE = " + dataSource);
        List<City> list = cityService.findAll();
        System.out.println(list.get(0).toString());

    }
}
