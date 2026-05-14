package com.fudn.slot2.jpa_demo.controller;

import com.fudn.slot2.jpa_demo.dto.request.StudentCreate;
import com.fudn.slot2.jpa_demo.dto.request.StudentUpdate;
import com.fudn.slot2.jpa_demo.entity.Student;
import com.fudn.slot2.jpa_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tu")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping()
    Student CreateStudent(@RequestBody StudentCreate request) {
        return studentService.CreateRequest(request);
    }

    @GetMapping()
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    Student updateStudent(@PathVariable String id, @RequestBody StudentUpdate request) {
        return studentService.updateStudent(id, request);
    }

    @DeleteMapping("/{id}")
    String deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
        return "Student has been deleted successfully.";
    }
}
