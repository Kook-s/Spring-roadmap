package hello.proxy.pureproxy.decorator;

import hello.proxy.pureproxy.decorator.code.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class DecoratorPatternTest {

    @Test
    void noDecoratorTest() {
        RealComponent realComponent = new RealComponent();
        DecoratorPatterClient client = new DecoratorPatterClient(realComponent);

        client.execute();
    }

    @Test
    void decorator1() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        DecoratorPatterClient client = new DecoratorPatterClient(messageDecorator);
        client.execute();

    }

    @Test
    void decorator2() {
        Component realComponent = new RealComponent();
        Component messageDecorator = new MessageDecorator(realComponent);
        Component timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatterClient client = new DecoratorPatterClient(timeDecorator);
        client.execute();

    }

}
