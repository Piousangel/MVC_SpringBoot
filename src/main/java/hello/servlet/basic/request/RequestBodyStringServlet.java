package hello.servlet.basic.request;

import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet(name = "requestBodyStringServlet", urlPatterns = "/request-body-string")
public class RequestBodyStringServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletInputStream inputStream = request.getInputStream();  //message body내용을 바이트코드로 얻을 수 있다(InputStream으로 데이터를 읽을 수 있다).
        String messageBody = StreamUtils.copyToString(inputStream, StandardCharsets.UTF_8); //바이트코드를 스트링으로 변환(스프링 유틸리티).

        System.out.println("messageBody = " + messageBody);
        response.getWriter().write("ok");

    }
}
