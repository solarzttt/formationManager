package com.lo54_project;


import com.lo54_project.utils.HibernateUtil;
import org.springframework.boot.SpringApplication;
import org.hibernate.Session;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"com.lo54_project"})
@RestController
public class App 
{
    @RequestMapping("/")
    public String home(){
        return "hello";
    }
    public static void main(String[] args)
    {
        Session session=HibernateUtil.getSessionFactory().openSession();

        SpringApplication.run(App.class,args);
    }
}
