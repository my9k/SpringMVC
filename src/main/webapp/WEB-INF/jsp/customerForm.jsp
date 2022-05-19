<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      <form method="POST" action="/customer/add">
         <table>
            <tr>
               <td><label>Name</label></td>
               <td><input type="text" name = "name" /></td>
            </tr>
            <tr>
               <td><label>Mobile</label></td>
               <td><input type="text" name = "mobile" /></td>
            </tr>
            <tr>
               <td><label>Email</label></td>
               <td><input type="text" name = "email" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form>


</body>
</html>