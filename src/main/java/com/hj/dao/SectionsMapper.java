package com.hj.dao;

import com.hj.entity.Sections;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SectionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sections
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sections
     *
     * @mbggenerated
     */
    int insert(Sections record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sections
     *
     * @mbggenerated
     */
    Sections selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sections
     *
     * @mbggenerated
     */
    List<Sections> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sections
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sections record);
    
    /**
     * 	根据id查询
     * @param id
     * @return
     */
    Sections queryById(@Param("id")String id);
}