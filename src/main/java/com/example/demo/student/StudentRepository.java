package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


// This interface is responsible for data access
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long > {
    // custom func here that will find a user by email
    // SELECT * FROM student WHERE email = ? or query
    @Query("SELECT s FROM Student s WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
