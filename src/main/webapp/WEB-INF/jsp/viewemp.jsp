 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
 <!-- https://crunchify.com/spring-mvc-4-2-2-best-way-to-integrate-js-and-css-file-in-jsp-file-using-mvcresources-mapping/-->
 <!-- Bylo potřeba pro rozchození viewemp stáhnout jstl knihovnu do pom.xml -->  
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
 
 <html>
 <head> 
 	 <!-- Pro načtení externího css --> 
  	 <!-- https://stackoverflow.com/questions/26276603/how-to-include-js-and-css-in-jsp-with-spring-mvc -->
 	 <link href="<c:url value="/resources/crunchify.css" />" rel="stylesheet">
 

 
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	 <script src="<c:url value="/resources/crunchify.js" />"></script>
	 
 </head>
 
 <body>
 	<script>
 		sayHello();
 	</script>
 	

 <h2>This is view template</h2> 
 
<table border="2" width="70%" cellpadding="2"> 

<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th></tr>  
<!-- 
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.salary}</td>  
   <td>${emp.designation}</td>  
   </tr>  
   </c:forEach>
   
    -->  
<!-- Toto zobrazuje hodnoty z formuláře -->    
   <tr>  
   	<td>${id}</td>  
   	<td>${name}</td>  
   	<td>${salary}</td>  
   	<td>${designation}</td>  
   </tr> 
   
   </table>  
    </body>
   </html>