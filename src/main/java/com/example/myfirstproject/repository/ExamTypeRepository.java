package com.example.myfirstproject.repository;

import com.example.myfirstproject.entity.ExamType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamTypeRepository extends JpaRepository<ExamType,Long> {
    @Query(value = "SELECT e FROM ExamType e WHERE e.examTypeId=?1")
    public ExamType getExamType(Long examTypeId);
}
