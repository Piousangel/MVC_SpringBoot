# MVC_SpringBoot
spring boot 개인적으로 할게요 업로드가 안됩니다.

## - SpringBoot MVC패턴을 활용하여 간단한 웹페이지 제작


<img width="823" alt="스크린샷 2021-11-23 오후 5 47 57" src="https://user-images.githubusercontent.com/55525574/142994161-727297c3-8c58-4db8-ac36-1dfac643ec98.png">

- 핸들러 조회 : 핸들러 매핑을 통해 요청 URL에 매핑된 핸들러(컨트롤러)를 조회한다.
- 핸들러 오댑터 조회 : 핸들러를 실행할 수 있는 핼들러 어댑터를 조회한다.
- 핸들러 어댑터 실행 : 핸들러 어댑터를 실행한다.
- 핸들러 실행 : 핸들러 어댑터가 실제 핸들러를 실행한다.
- ModelAndView 반환 : 핸들러 어댑터는 핸들러가 반환하는 정보를 ModelAndView로 변환해서 반환한다.
- viewResolver 호출 : 뷰 리졸버를 찾고 실행한다. JSP경우 InternalResourceView(ustlView)를 반환하는데, 내부에 forward()로직이 있음
- 뷰 렌더링 : 뷰를 통해서 뷰를 렌더링 한다.

### 주요 인터페이스 목록
- 핸들러 매핑 : org.springframework.web.servlet.HandlerMapping
- 핸들러 어댑터 : org.springframework.web.servlet.HandlerAdapter
- 뷰 리졸버 : org.springframework.web.servlet.ViewResolver
- 뷰 : org.springframework.web.servlet.View

SLF4J가 인터페이스 Logback이 구현체임 로깅!!! log.info(), log.trace(), log.warn(), log.error(), log.debug()

### HTTP 요청 메시지
* Start Line
   - HTTP 메소드
   - URL
   - 쿼리 스트링
   - 스키마 프로토콜
* 헤더
   - 헤더 조회
* 바디
   - form 파라미터 형식 조회
   - message body 데이터 직접 조회

# HTTP스펙이 제공하는 요청, 응답 메세지 자체를 심도있게 이해해야함
--------------------------------------

- SpringBoot의 다양한 dependencies사용
- 간단한 Message는 Postman활용
- 비즈니스모델 작성
- h2 데이터베이스 사용


- lsof -i :number of port
- kill -9 PID

Queue.offer() -> 실패시 false반환 , Queue.add() -> 실패시 예외발생 처리

request.getHeaderNames().asIterator()
         .forEachRemaining(headerName -> System.out.~) 응용


import java.util.regex.Pattern;
boolean chk = Pattern.matches("^[a-zA-Z0-9]*$", s);
