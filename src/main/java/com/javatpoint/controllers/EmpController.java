package com.javatpoint.controllers;  
//http://www.baeldung.com/spring-mvc-and-the-modelattribute-annotation 
import java.util.ArrayList;  
import java.util.List;  

import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  

import com.javatpoint.beans.Emp;  

@Controller  

//https://www.javatpoint.com/spring-mvc-form-example
public class EmpController {  
  
	//Tato metoda zobrazí formuláø
	
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        //https://stackoverflow.com/questions/5055358/what-is-model-in-modelandview-from-spring-mvc
    	return new ModelAndView("empform","command",new Emp());  
    }  
      
    //Díky RequestMethod.POST se data pøenesou z formuláøe
    //Po stisknutí tlaèítka ve fromuláøi se spustí action = "save"
    //Na konec URL se pøidá øetìzec save
    //Pomocí RequestMethod.POST se pøenesou data z fromuláøe
    //Spustí String metoda save() s argumenty pomocí které vypíšu data z formuláøe
    //do viewemp
    
    @RequestMapping(value="/save",method = RequestMethod.POST)
    
    //Chci atributy z modeulu dat emp (tøída Emp), ke zobrazení použiju objekt ModelMap model
    //Zde v podstatì definuju, co se mi stane po stisknutí tlaèítka Save ve formuláøi
    public String save(@ModelAttribute("emp") Emp emp, ModelMap model){  
    	
        //here, we are displaying emp object to prove emp has data  
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
                
       //Díky tìmto metodám namapuju do zobrazovací šablony viewemp hodnoty z formuláøe
        model.addAttribute("id",emp.getId());
        model.addAttribute("name",emp.getName());
        model.addAttribute("salary", emp.getSalary());
        model.addAttribute("designation", emp.getDesignation());
        
        //Zobrazím  šablonu viewemp zobrazující gettery objektu emp tøídy Emp.java
        return "viewemp";

    }  
  
}  