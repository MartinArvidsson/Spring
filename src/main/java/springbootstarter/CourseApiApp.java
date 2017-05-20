package springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by marti on 2017-04-20.
 */
@SpringBootApplication
public class CourseApiApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(CourseApiApp.class,args);
    }
}

