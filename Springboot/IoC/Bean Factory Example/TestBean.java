
package com.beanExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
        Student s = (Student) factory.getBean("stu");
        s.display();
    }
}
