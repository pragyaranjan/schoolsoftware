import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AssignGradesServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String subject = request.getParameter("subject");
        String grade = request.getParameter("grade");

        // You would typically store this in a database, here it's just printed for simplicity
        System.out.println("Assigning grade for student: " + studentName);
        System.out.println("Subject: " + subject + ", Grade: " + grade);

        // Redirect back to the teacher dashboard after assigning the grade
        response.sendRedirect("teacherDashboard.html");
    }
}
