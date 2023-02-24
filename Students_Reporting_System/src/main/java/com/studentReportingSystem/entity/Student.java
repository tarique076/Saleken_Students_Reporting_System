package com.studentReportingSystem.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "student")
public class Student {

	@Id
	private Integer roll_no;
	private String name;
	private Integer englishMarks;
	private Integer mathsMarks;
	private Integer scienceMarks;
	private Integer sem;
}
