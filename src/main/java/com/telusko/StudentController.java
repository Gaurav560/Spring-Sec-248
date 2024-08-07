package com.telusko;

import ch.qos.logback.core.read.ListAppender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin Reddy", "Java"),
            new Student(2, "Gaurav", "Python")
           ));


    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }


    //adding a student
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }

}

