import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void  main(String[] argv){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloSpring obj = (HelloSpring) context.getBean("helloSpring");
        obj.sayHello();
        context.registerShutdownHook();
    }
}
