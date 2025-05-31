package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        //중요하지 않는 정보
        // 메서드 호출이기 때문에 연산을 진행하지 않고 중지하고 넘어간다.
        log.trace("trace log= {}", name);

        // 로그에서 연산을 사용하면 안되는 이유!!!!
        //스프링은 연산을 먼저 진행한다. 로그 화면에서는 출력이 되지는 않지만 연산 과정이 일어난다. 리소스 낭비가 됨
        log.trace("trace log= "+ name);


        //디버깅 정보
        log.debug("debug log= {}", name);
        //중요한 정보
        log.info("info log= {}", name);
        //경고성 정보
        log.warn("warn log= {}", name);
        //위험한 정보
        log.error("error log= {}", name);


        return "ok";
    }
}

//**더 공부하실 분**
//로그에 대해서 더 자세한 내용은 slf4j, logback을 검색해보자.
//        SLF4J - http://www.slf4j.org
//        Logback - http://logback.qos.ch
//스프링 부트가 제공하는 로그 기능은 다음을 참고하자.
//        https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-logging
