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
  
	//Tato metoda zobraz� formul��
	
    @RequestMapping("/empform")  
    public ModelAndView showform(){  
         //command is a reserved request attribute name, now use <form> tag to show object data  
        //https://stackoverflow.com/questions/5055358/what-is-model-in-modelandview-from-spring-mvc
    	return new ModelAndView("empform","command",new Emp());  
    }  
      
    //D�ky RequestMethod.POST se data p�enesou z formul��e
    //Po stisknut� tla��tka ve fromul��i se spust� action = "save"
    //Na konec URL se p�id� �et�zec save
    //Pomoc� RequestMethod.POST se p�enesou data z fromul��e
    //Spust� String metoda save() s argumenty pomoc� kter� vyp�u data z formul��e
    //do viewemp
    
    @RequestMapping(value="/save",method = RequestMethod.POST)
    
    //Chci atributy z modeulu dat emp (t��da Emp), ke zobrazen� pou�iju objekt ModelMap model
    //Zde v podstat� definuju, co se mi stane po stisknut� tla��tka Save ve formul��i
    public String save(@ModelAttribute("emp") Emp emp, ModelMap model){  
    	
        //here, we are displaying emp object to prove emp has data  
        System.out.println(emp.getName()+" "+emp.getSalary()+" "+emp.getDesignation());  
                
       //D�ky t�mto metod�m namapuju do zobrazovac� �ablony viewemp hodnoty z formul��e
        model.addAttribute("id",emp.getId());
        model.addAttribute("name",emp.getName());
        model.addAttribute("salary", emp.getSalary());
        model.addAttribute("designation", emp.getDesignation());
        
        //Zobraz�m  �ablonu viewemp zobrazuj�c� gettery objektu emp t��dy Emp.java
        return "viewemp";

    }  
  
}  