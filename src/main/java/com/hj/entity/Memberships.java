package com.hj.entity;

import java.io.Serializable;

public class Memberships implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memberships.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memberships.department
     *
     * @mbggenerated
     */
    private String department;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memberships.specialty
     *
     * @mbggenerated
     */
    private String specialty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memberships.degree
     *
     * @mbggenerated
     */
    private String degree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table memberships
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memberships.id
     *
     * @return the value of memberships.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memberships.id
     *
     * @param id the value for memberships.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memberships.department
     *
     * @return the value of memberships.department
     *
     * @mbggenerated
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memberships.department
     *
     * @param department the value for memberships.department
     *
     * @mbggenerated
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memberships.specialty
     *
     * @return the value of memberships.specialty
     *
     * @mbggenerated
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memberships.specialty
     *
     * @param specialty the value for memberships.specialty
     *
     * @mbggenerated
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memberships.degree
     *
     * @return the value of memberships.degree
     *
     * @mbggenerated
     */
    public String getDegree() {
        return degree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memberships.degree
     *
     * @param degree the value for memberships.degree
     *
     * @mbggenerated
     */
    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memberships
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", department=").append(department);
        sb.append(", specialty=").append(specialty);
        sb.append(", degree=").append(degree);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}