package com.example.Std.service.Stdservice;

import com.example.Std.Repository.StudentRepository;
import com.example.Std.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class impl implements StdService {
    @Autowired
    private StudentRepository stdRepo;
    @Override
    public Student saveStudent(Student std) {
        return stdRepo.save(std);
    }

    @Override
    public List<Student> getAllStd() {
        return stdRepo.findAll();
    }

    @Override
    public Student getById(long id) {
        return stdRepo.findById(id).get();
    }

    @Override
    public Student deletstudent(long id) {
        stdRepo.deleteById(id);
        System.out.println("deleted");
        return null;
    }

    @Override
    public Student updating(long id, Student std) {
        return stdRepo.save(std);
    }
}
