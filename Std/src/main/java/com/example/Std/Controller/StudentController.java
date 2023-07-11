package com.example.Std.Controller;

import com.example.Std.model.Student;
import com.example.Std.service.Stdservice.StdService;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private  StdService StdService;


    @PostMapping("/student")
    public Student saveStd(@RequestBody Student std) {
        return  StdService.saveStudent(std);
    }
    @GetMapping("/getStudents")
    public List<Student> getAll(){
        return StdService.getAllStd();

    }
    @GetMapping("/student/{id}")
    public Student getId(@PathVariable("id") long id){
        return StdService.getById(id);
    }
    @DeleteMapping("/student/{id}")
    public Student deletstd(@PathVariable("id") long id){
        return StdService.deletstudent(id);
    }
    @PutMapping("/student/{id}")
    public  Student updateStd(@PathVariable("id") long id, @RequestBody Student std){
        return StdService.updating(id,std);
    }
}
