package com.studentReportingSystem.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentReportingSystem.entity.Student;
import com.studentReportingSystem.repository.StudentDAO;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	private StudentDAO sDao;

	@Override
	public Student registerStudent(Integer roll_no, String name, Integer englishMarks, Integer mathsMarks,
			Integer scienceMarks, Integer sem) {
		// TODO Auto-generated method stub

		Student student = new Student(roll_no, name, englishMarks, mathsMarks, scienceMarks, sem);

		return sDao.save(student);

	}

	@Override
	public Integer getAvgPercentageOfClass(Integer sem) {
		// TODO Auto-generated method stub
		int total_marks = 0;
		int studentCount = 0;

		Iterable<Student> itr = sDao.findAll();
		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);

		for (Student student : students) {
			if (student.getSem().equals(sem)) {
				total_marks += (student.getEnglishMarks() + student.getMathsMarks() + student.getScienceMarks());
				studentCount++;
			}
		}
		
		if(studentCount==0) return 0;
		
		int avg = total_marks/(studentCount);

		return (avg*100) / 300;
	}

	@Override
	public Integer getAvgMarksOfStudentsPerSubject(String sub) {
		// TODO Auto-generated method stub
		int total_marks = 0;

		Iterable<Student> itr = sDao.findAll();

		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);

		for (Student student : students) {
			if (sub.equalsIgnoreCase("English"))
				total_marks += student.getEnglishMarks();
			else if (sub.equalsIgnoreCase("Maths"))
				total_marks += student.getMathsMarks();
			else if (sub.equalsIgnoreCase("Science"))
				total_marks += student.getScienceMarks();
		}
		
		if(students.size()==0) return 0;
		return total_marks / students.size();
	}

	@Override
	public List<String> getTopTwoStudents() {
		// TODO Auto-generated method stub

		Iterable<Student> itr = sDao.findAll();

		List<Student> students = new ArrayList<>();
		itr.forEach(students::add);

		Map<String, Integer> studentMap = new HashMap<>();

		for (Student student : students) {
			studentMap.put(student.getName(), studentMap.getOrDefault(student.getName(), 0)
					+ (student.getEnglishMarks() + student.getMathsMarks() + student.getScienceMarks()) / 3);
		}

		List<Entry<String, Integer>> sortedStudents = new ArrayList<Entry<String, Integer>>(studentMap.entrySet());

		Collections.sort(sortedStudents, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue() - o1.getValue();
			}

		});

		int c = 0;
		List<String> topTwoStudents = new ArrayList<>();

		for (Map.Entry<String, Integer> ent : sortedStudents) {
			if (c > 1)
				break;
			topTwoStudents.add(ent.getKey() + " - " + ent.getValue());
			c++;
		}

		return topTwoStudents;
	}

}
