package com.hj.dao;

import com.hj.entity.Memberships;
import java.util.List;

public interface MembershipsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    int insert(Memberships record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    Memberships selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    List<Memberships> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Memberships record);
}