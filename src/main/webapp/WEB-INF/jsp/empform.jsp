<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
  		<!-- Pokud zmacknu ve formuláři tlačítko, spustí se mi metoda save v EmpController.java
  		Nějaká akce (zmáčknutí tlačítka) vyvolá spuštění metody a načtení view 
  		-->
       <form:form method="post" action="save">    
        <table >   
        
         <tr>    
          <td>Id : </td> 
          <!-- Zde asi musí být path aby se to přenášelo do view, vygooglit -->  
          <td><form:input path="id"  /></td>  
         </tr>  
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>  