package com.studentReportingSystem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.studentReportingSystem.entity.Student;
import com.studentReportingSystem.repository.StudentDAO;
import com.studentReportingSystem.services.StudentServices;

@Controller
public class StudentUIController {

	@Autowired
	private StudentServices sService;
	
	@Autowired
	private StudentDAO sRepo;
	
	@GetMapping("/home")
	public String homeLauncher() {
		
		return "welcome";
	}
	
	@GetMapping("/addStudent")
	public String addStudent() {
		return "addStudent";
	}
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestParam Integer roll_no, @RequestParam String name,
			@RequestParam Integer englishMarks, @RequestParam Integer mathsMarks, @RequestParam Integer scienceMarks, 
			@RequestParam Integer semester) {
		
		sService.registerStudent(roll_no, name, englishMarks, mathsMarks, scienceMarks, semester);
		
		return "welcome";

	}
	
	@GetMapping("/getClassPercentage")
	public String getPercentage() {
		return "percentage";
	}
	
	@PostMapping("/getClassPercentage")
	public String getPercentage(Model model, @RequestParam Integer semester) {
		
		int percentage = sService.getAvgPercentageOfClass(semester);
		
		model.addAttribute("classPercentage", percentage);
		
		return "percentageOutput";
	}
	
	@GetMapping("/subjectAvg")
	public String getAvgSubjectMarks() {
		return "average";
	}
	
	@PostMapping("/subjectAvg")
	public String getAvgSubjectMarks(Model model, @RequestParam String subject) {
		
		int avg = sService.getAvgMarksOfStudentsPerSubject(subject);
		
		model.addAttribute("average", avg);
		
		return "averageOutput";
		
	}
	
//	@GetMapping("/topTwoStudents")
//	public String getTopTwoStudents() {
//		return "topTwoStudents";
//	}
	
	@GetMapping("/topTwoStudents")
	public String getTopTwoStudents(Model model) {
		
		List<String> topTwo = sService.getTopTwoStudents();
		
		model.addAttribute("topTwoStudents", topTwo);
		
		return "topTwoStudents";
	}
	
	@GetMapping("/getAllStudents")
	public String getAllStudents(Model model ){
	 Iterable<Student> itr= sRepo.findAll();
	 
	 List<Student> students= new ArrayList<>();
	 itr.forEach(students::add);
	 
	 model.addAttribute("mydata", students);
	 
	 return "allStudents";
	 
	}
}
