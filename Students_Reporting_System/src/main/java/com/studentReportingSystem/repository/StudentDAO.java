package com.studentReportingSystem.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.studentReportingSystem.entity.Student;

@Repository
public interface StudentDAO extends ElasticsearchRepository<Student, Integer>{

}
