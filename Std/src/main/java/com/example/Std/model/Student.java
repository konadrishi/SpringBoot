package com.example.Std.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
//    @Column(name="firstName")
//    private String firstName;
//    @Column(name="lastName")
//    private String lastName;
    @Column(name="email")
    private String email;
    @Column(name="consultantName")
    private String consultantName;
    @Column(name="submissionDate")
    private String submissionDate;
    @Column(name="leadName")
    private String leadName;
    @Column(name="vendorName")
    private String vendorName;
    @Column(name="rate")
    private String rate;
    @Column(name="salesPersonName")
    private String salesPersonName;
    @Column(name="technology")
    private String technology;


}
