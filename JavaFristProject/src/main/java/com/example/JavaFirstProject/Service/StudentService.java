package com.example.JavaFirstProject.Service;

import org.springframework.stereotype.Service;

import com.example.JavaFirstProject.DTO.StudentDTO;
import com.example.JavaFirstProject.Entity.Student;
import com.example.JavaFirstProject.Repository.StudentRepository;

@Service
public class StudentService {
	
private StudentRepository studentRepository;
	
	
	public StudentDTO createOrUpdateStudent(StudentDTO dto) {
		
		Student student = new Student(
				dto.id,dto.name,dto.email,dto.phone,dto.qualification,dto.resumeleURL);
			
		Student saved = (Student) studentRepository.save(student);
		return mapToDTO(saved);
	}

	public StudentDTO getStudentByEmail(String email) {
		Student student = studentRepository.findByEmail(email).orElseThrow(()-> new RuntimeException("student not found"));
		 return mapToDTO(student);
		
	}
	public StudentDTO getStudentById(Long Id) {
		Student student = studentRepository.findById(Id).orElseThrow(()-> new RuntimeException("student not found"));
		 return mapToDTO(student);
	}
	

	private StudentDTO mapToDTO(Student student) {
		return  new StudentDTO(
				student.getId(),
				student.getName(),
				student.getEmail(),
				student.getPhone(),
				student.getQualifiaction(),
				student.getResumeURL());
				
		
	}

}
