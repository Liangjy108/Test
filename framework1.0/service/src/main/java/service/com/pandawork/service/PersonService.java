package com.pandawork.service;

import com.pandawork.common.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * NBA人物
 */
public interface PersonService {
    /**
     * 主页（遍历）
     * @return
     * @throws Exception
     */
    public List<Person> listAll() throws Exception;

    /**
     * 增加person
     * @throws Exception
     * @return
     */
    public void addPerson(@Param("addPerson") Person person) throws Exception;

    /**
     * 删除person通过id
     * @throws Exception
     * @return
     */
    public boolean delPerson(@Param("id") int id) throws Exception;

    /**
     * 修改person
     * @throws Exception
     * @return
     */
    public void updatePerson(@Param("updatePerson") Person person) throws Exception;

    /**
     * 查询person
     * @throws Exception
     * @return
     */
    public List<Person> selectPerson(String keyWord) throws Exception;

}

