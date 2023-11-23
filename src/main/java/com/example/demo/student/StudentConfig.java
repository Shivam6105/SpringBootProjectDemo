package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
           Student shivam =  new Student(
                    "Shivam",
                    "shivam@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 21)
            );

            Student alex =  new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.FEBRUARY, 21)

            );

            repository.saveAll(
                    List.of(shivam, alex)
            );
        };
    }
}
