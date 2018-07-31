package com.pandawork.test;

import com.pandawork.common.entity.Person;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.mapper.PersonMapper;
import com.pandawork.service.PersonService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonServiceTest  extends AbstractTestCase{
    @Autowired
    PersonService personService;

    //遍历test
    @Test
    public void testListAll() throws Exception{
         System.out.print(personService.listAll());
    }


    //增加test
    @Test
    public void testAddPerson()throws Exception{
        Person person = new Person();
        person.setId(3);
        person.setName("斯蒂芬库里");
        person.setBirthday(1986);
        person.setTeam("火箭");
        person.setComment("123");
        personService.addPerson(person);
        System.out.println("增加成功！");
    }

    //删除test
    @Test
    public void testDelPerson()throws Exception{
        Person person = new Person();
        person.setId(8);
        personService.delPerson(person.getId());
        System.out.println("删除成功！");
    }

//    修改test
    @Test
    public void testUpdatePerson()throws Exception{
        Person person = new Person();
        person.setId(8);
        person.setName("1333");
        person.setBirthday(123);
        person.setDepartment("123");
        person.setTeam("123");
        person.setComment("123");
        person.setId(8);
        personService.updatePerson(person);
        System.out.println("8");
    }

    //查询test
    @Test
    public void testSelectPerson()throws Exception{
        Person person = new Person();
        personService.selectPerson("库里");
        System.out.println("222");
    }
}
