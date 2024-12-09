import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentDashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Example static data for student (you would retrieve this from a database)
        String[] grades = {"Math: A", "English: B+", "Science: A-"};
        String[] attendance = {"2024-12-01: Present", "2024-12-02: Absent"};

        // Pass this data to the JSP page to display it
        request.setAttribute("grades", grades);
        request.setAttribute("attendance", attendance);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("studentDashboard.jsp");
        dispatcher.forward(request, response);
    }
}
