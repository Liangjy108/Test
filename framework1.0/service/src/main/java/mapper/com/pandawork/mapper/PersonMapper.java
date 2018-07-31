package com.pandawork.mapper;

import com.pandawork.common.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * NBA人物信息
 */
public interface PersonMapper {

    /**
     * 主页（遍历）
     * @throws Exception
     * @return
     */
    public List<Person> listAll( ) throws Exception;

    /**
     * 增加person
     * @throws Exception
     * @return
     */
    public void addPerson(@Param("person") Person person) throws Exception;

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
    public void updatePerson(@Param("person") Person person) throws Exception;



    /**
     * 查询person
     * @throws Exception
     * @return
     */
    public List<Person> selectPerson(@Param("keyWord") String keyWord) throws Exception;


}
