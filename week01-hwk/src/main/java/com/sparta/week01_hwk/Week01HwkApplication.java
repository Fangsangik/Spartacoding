package com.sparta.week01_hwk;

import com.sparta.week01_hwk.Service.PersonService;
import com.sparta.week01_hwk.models.Person;
import com.sparta.week01_hwk.models.PersonRepository;
import com.sparta.week01_hwk.models.PersonRequestDto;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.List;

@EnableJpaAuditing
@NoArgsConstructor
@SpringBootApplication
public class Week01HwkApplication {
    public static void main(String[] args) {
        SpringApplication.run(Week01HwkApplication.class, args);
    }

}