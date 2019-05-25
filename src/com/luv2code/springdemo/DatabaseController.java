package com.luv2code.springdemo;

import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tejas.springdata.Student;
import com.tejas.springdata.StudentDao;

@Controller
public class DatabaseController 
{
	@Autowired
	 private StudentDao studentDAO;
	
	 @RequestMapping("/insertdata")
     public String Insert()
     {
    	 return "Insertion";
     }
	 
	 @RequestMapping("/list")
     public String Working(Model theModel)
     {
		 
		 List<Student> list = studentDAO.getStudents();
		 theModel.addAttribute("Studentdata", list);
    	 return "list";
     }
	 
	 @GetMapping("/Submit")
	 public String insertion(Model theModel)
	 {
		 Student thestudent = new Student();
	     theModel.addAttribute("student", thestudent);
		 return "Datasubmit";
	 }
	 
	 @RequestMapping("/saveStudent")
	 public String insertSub(@ModelAttribute("student") Student thestudent)
	 {
		 System.out.println("Value is "+thestudent.getEmail()+" Name is "+thestudent.getName());
		 studentDAO.insertData(thestudent);
		 return "Insertion";
	 }
	 
	 @GetMapping("/Delete")
	    public String checkFour(Model theModel)
	    {
		    Student std = new Student();
		    theModel.addAttribute("student1", theModel);
	    	return "Delete";
	    }
	 
	   @RequestMapping("/DeleteStudent")
	    public String checkFive(@ModelAttribute("student1") Student tej)
	    {
		     System.out.println("ID value is "+tej.getId());
		     try {
			 studentDAO.deleteData(tej);
			 return "Deletion-stmt";
		     }
		     catch(Exception ae)
		     {
		    	 System.out.println("Deletion exception"+ae.getMessage());
		    	 return "Failed";
		     }
			 
		   
	    }
	 
}
