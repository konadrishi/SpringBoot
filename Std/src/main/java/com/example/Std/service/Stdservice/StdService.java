package com.example.Std.service.Stdservice;

import com.example.Std.model.Student;

import java.util.List;

public interface StdService {
    Student saveStudent(Student std);

    List<Student> getAllStd();

    Student getById(long id);

    Student deletstudent(long id);

    Student updating(long id, Student std);
}
