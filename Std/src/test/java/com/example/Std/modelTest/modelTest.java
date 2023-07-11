package com.example.Std.modelTest;



import com.example.Std.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class modelTest {

    @Test
    public void testStudentModel() {

        Student student = new Student();
        student.setId(1);
        student.setEmail("Rishi@example.com");
        student.setConsultantName("Rishi12");
        student.setSubmissionDate("2023-07-11");
        student.setLeadName("Rishi21");
        student.setVendorName("Rishi23");
        student.setRate("Rate");
        student.setSalesPersonName("Rishi32");
        student.setTechnology("Technology");

        // Verify the values
        Assertions.assertEquals(1, student.getId());
        Assertions.assertEquals("Rishi@example.com", student.getEmail());
        Assertions.assertEquals("Rishi12", student.getConsultantName());
        Assertions.assertEquals("2023-07-11", student.getSubmissionDate());
        Assertions.assertEquals("Rishi21", student.getLeadName());
        Assertions.assertEquals("Rishi23", student.getVendorName());
        Assertions.assertEquals("Rate", student.getRate());
        Assertions.assertEquals("Rishi32", student.getSalesPersonName());
        Assertions.assertEquals("Technology", student.getTechnology());
    }
}
