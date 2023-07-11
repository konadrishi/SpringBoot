package com.example.Std.Repository;

import com.example.Std.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

}
