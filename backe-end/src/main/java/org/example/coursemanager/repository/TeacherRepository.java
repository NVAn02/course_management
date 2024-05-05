package org.example.coursemanager.repository;


import org.example.coursemanager.model.Schedule;
import org.example.coursemanager.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}
