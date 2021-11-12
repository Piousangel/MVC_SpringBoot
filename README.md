# MVC_SpringBoot
spring boot

## - SpringBoot MVC패턴을 활용하여 간단한 웹페이지 제작

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
