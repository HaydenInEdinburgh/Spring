package com.bernieye;

import com.bernieye.dao.StudentDao;
import com.bernieye.domain.Student;
import com.bernieye.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext tx = new ClassPathXmlApplicationContext(config);
        //StudentDao dao = (StudentDao) tx.getBean("studentDao");
        String names[] = tx.getBeanDefinitionNames();
        for (String name: names){
            System.out.println("容器中的对象名字"+ name+ "|"+ tx.getBean(name));
        }
    }

    @Test
    public void testDaoInsert(){
        String config = "applicationContext.xml";
        ApplicationContext tx = new ClassPathXmlApplicationContext(config);
        StudentDao dao = (StudentDao) tx.getBean("studentDao");
        Student student = new Student();
        student.setAge(23);
        student.setName("Tom");
        student.setEmail("tom@gmail.com");
        student.setId(1018);

        int nums = dao.insertStudent(student);
        System.out.println("nums"+nums);
    }

    @Test
    public void testServiceInsert(){
        String config = "applicationContext.xml";
        ApplicationContext tx = new ClassPathXmlApplicationContext(config);
        StudentService service =(StudentService) tx.getBean("studentService");
        Student student = new Student();
        student.setAge(30);
        student.setName("Tina");
        student.setEmail("Tina@gmail.com");
        student.setId(1013);
        int nums = service.addStudent(student);
        //spring和mybatis整合在一起使用 事务自动提交 无需执行SqlSession.commit();
        System.out.println("nums"+ nums);
    }

    @Test
    public void testServiceSelect(){
        String config = "applicationContext.xml";
        ApplicationContext tx = new ClassPathXmlApplicationContext(config);
        StudentService service =(StudentService) tx.getBean("studentService");
        List<Student> students = service.queryStudents();
        for(Student student: students){
            System.out.println(student.toString());
        }
        //System.out.println(students);
    }
}
