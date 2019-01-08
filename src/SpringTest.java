import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String a[]){
        String confFile = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        App app = (App) context.getBean("springTest");
        app.test();
    }
}
