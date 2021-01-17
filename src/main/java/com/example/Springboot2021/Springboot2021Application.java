package com.example.Springboot2021;

import com.example.Springboot2021.Student.Student;
import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class Springboot2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot2021Application.class, args);
	}

}
