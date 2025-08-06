package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

        Student student = (Student) context.getBean("st1");
//        student.setAge(-25);
//        System.out.println(student.getAge()+" "+student.getRollno());
        student.writeExam();
    }
}
