package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.Mark;
import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarkRepository extends JpaRepository<Mark,Long> {
    @Query(value="SELECT m FROM Mark m WHERE m.markId=?1")
    public Mark getMark(Long markId);
    @Query(value = "SELECT m FROM Mark m WHERE m.examTypeId=?1")
    public List<Mark> getTotalNumberOfStudentsPassed(Long examTypeId);
}
