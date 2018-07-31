package com.pandawork.service.impl;


import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.pandawork.common.entity.Person;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.PersonMapper;
import com.pandawork.service.PersonService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.pandawork.core.common.util.Assert;

import java.util.Collections;
import java.util.List;

/**
 * NBA人物
 * PersonService的实现
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonMapper personMapper;

    @Autowired
    protected CommonDao commonDao;

    /**
     * 遍历
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<Person> listAll() throws Exception {
        List<Person> personList = Collections.emptyList();
        try {
            personList = personMapper.listAll();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return personList;
    }

    /**
     * 增加
     *
     * @param person
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void addPerson(Person person) throws Exception {
        try {
            personMapper.addPerson(person);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
    }

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean delPerson(int id) throws Exception {
        try {
            return personMapper.delPerson(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return true;
    }

    /**
     * 修改
     *
     * @param person
     * @return
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void updatePerson(Person person) throws Exception {

        try {
            personMapper.updatePerson(person);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
    }


    /**
     * 查询person
     * @param keyWord
     * @return1111
     * @throws Exception
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public List<Person> selectPerson(String keyWord) throws Exception {
        List<Person> list = null;
        try {
            list = personMapper.selectPerson(keyWord);
            System.out.println(keyWord+"Serv");
        } catch (Exception e) {
            LogClerk.errLog.error(e);
        }
        return  list;
    }
}
