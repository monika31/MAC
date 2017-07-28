<%-- 
    Document   : semester_registered
    Created on : 28-Jul-2017, 9:55:18 AM
    Author     : Amandeep kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Semester </title>
        <link />
        <script>
            function sem()
            {
                var sem = document.register.Semester.value;
                var Year = document.register.Year.value;
                if (gender === "")
                    alert("Please select the semester");
                    return false;
                    else if (year === null)
                        alert("Please enter the year");
                    return false;
            }
            </script>
    </head>
    <body>
        <form action="Profile.jsp" name="semester" method="Post" onclick="return sem()">
            Semester: <select name="Semester">
                <option value="Winter">Winter</option>
                <option value="fall">Fall</option></select><br><br>
            Year: <input type="number" name="Year"><br>
            <input type="Button" value="Submit"><br> 
        </form>
    </body>
</html>
