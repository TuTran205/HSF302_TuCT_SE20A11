package com.fudn.slot2.jpa_demo.service;

import com.fudn.slot2.jpa_demo.dto.request.StudentCreate;
import com.fudn.slot2.jpa_demo.dto.request.StudentUpdate;
import com.fudn.slot2.jpa_demo.entity.Student;
import com.fudn.slot2.jpa_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student CreateRequest(StudentCreate request) {
        Student student = new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());
        student.setEmail(request.getEmail());
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student updateStudent(String id, StudentUpdate request) {
        Student student = getStudentById(id);
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setAge(request.getAge());
        return studentRepository.save(student);
    }

    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}