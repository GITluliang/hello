package cn.ll.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: LL
 * @Date: 2019/5/19 20:40
 * @Description:
 */
@WebServlet("/hello.action")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>当前时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:sss").format(new Date()) + "</h1>");
        resp.getWriter().println("<h1>世界你好</h1>");
        resp.getWriter().println("<h1>aaaaaa</h1>");
        resp.getWriter().println("<h1>aaaaaa</h1>");
        resp.getWriter().println("<h1>aaaaaa</h1>");
        resp.getWriter().println("<h1>aaaaaa</h1>");
        resp.getWriter().println("<h1>aaaaaa</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
