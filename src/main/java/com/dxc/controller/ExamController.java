package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Exam;
import com.dxc.dao.ExamRepository;

@Controller
public class ExamController {
	
	@Autowired
	ExamRepository examRepository;
	
	@RequestMapping("examdisplay")
	public ModelAndView dispalyexams() {
		ModelAndView modelAndView = new ModelAndView("examdisplay");
		List<Exam> exams = (List<Exam>) examRepository.findAll();
		modelAndView.addObject("exam", exams);
		return modelAndView;
	}
	
	@RequestMapping("addExam")
	public String newexamform() {
		
		return "addExam";
	}
	
	@RequestMapping("examsave")
	public String addExam(@RequestParam("id") int id,@RequestParam("name") String name) {
		
		Exam exam = new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/examdisplay";
	}
	
	@RequestMapping("examEdit")
	public String editstudentform()
	{
		return "examEdit";
	}
	
	@RequestMapping("examupdate")
	public String examEdit(@RequestParam("id") int id,@RequestParam("name") String name) {
		
		Exam exam = new Exam(id, name);
		examRepository.save(exam);
		return "redirect:/examdisplay";
	}
	
	@RequestMapping("examdelete")
	public String deleteStudent(@RequestParam("id") int id)
	{
		examRepository.deleteById(id);
		return "redirect:/examdisplay";
	}
	
	
}
