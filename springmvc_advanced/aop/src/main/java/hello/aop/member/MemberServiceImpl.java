package hello.aop.member;

import hello.aop.member.annotation.ClaasAop;
import hello.aop.member.annotation.MethodAop;
import org.springframework.stereotype.Component;

@ClaasAop
@Component
public class MemberServiceImpl implements MemberService{

    @Override
    @MethodAop("test value")
    public String hello(String name) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }
}
