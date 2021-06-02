package xyz.baochao;

import xyz.baochao.dao.Student;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Two extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext application = request.getServletContext();
        Student student = (Student) application.getAttribute("student1");
        response.setContentType("text/html;UTF-8");
        PrintWriter printWriter = response.getWriter();
        printWriter.println(student);
    }
}
