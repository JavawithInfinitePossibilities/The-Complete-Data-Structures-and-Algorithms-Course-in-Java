package com.sid.tutorials.spring.boot3.java.app.bean;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private Integer age;
}
