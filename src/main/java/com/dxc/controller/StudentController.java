package com.dxc.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Student1;
import com.dxc.dao.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping("studentdisplay")
	public ModelAndView displaystudents() {
		ModelAndView modelAndView = new ModelAndView("studentdisplay");
		List<Student1> students = (List<Student1>) studentRepository.findAll();
		modelAndView.addObject("stud",students);
		return modelAndView;
	}
	
	@RequestMapping("addStudent")
	public String newstudentform(){
		
		return "addStudent";
	}
	
	@RequestMapping("save")
	public String addStudent(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("dob") String dob, @RequestParam("email") String email, @RequestParam("mobile") String mobile ) throws ParseException {
		
		Student1 student = new Student1(id, name, dob, email, mobile);
		studentRepository.save(student);
		return "redirect:/studentdisplay";
	}
	
	@RequestMapping("studentEdit")
	public String editstudentform() {
		return "studentEdit";
	}
	
	@RequestMapping("update")
	public String studentEdit(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("dob") String dob, @RequestParam("email") String email, @RequestParam("mobile") String mobile ) throws ParseException {
		
		Student1 student = new Student1(id, name, dob, email, mobile);
		studentRepository.save(student);
		return "redirect:/studentdisplay";
		
	}
	
	@RequestMapping("studentdelete")
	public String deleteStudent(@RequestParam("id") int id) {
		
		studentRepository.deleteById(id);
		return "redirect:/studentdisplay";
	}

}
