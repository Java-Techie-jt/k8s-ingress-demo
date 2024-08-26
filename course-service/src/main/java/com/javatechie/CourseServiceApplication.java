package com.javatechie;

import com.javatechie.dto.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
public class CourseServiceApplication {

    @GetMapping("/allCourses")
    public List<Course> viewCourses() {
        return Stream.of(
                new Course("C001", "Java Basics", 199.99),
                new Course("C002", "Spring Boot Mastery", 299.99),
                new Course("C003", "Angular for Beginners", 249.99),
                new Course("C004", "Microservices Architecture", 399.99),
                new Course("C005", "Kubernetes for Developers", 349.99)
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        SpringApplication.run(CourseServiceApplication.class, args);
    }

}
