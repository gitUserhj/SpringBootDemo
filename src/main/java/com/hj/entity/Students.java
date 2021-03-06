package com.hj.entity;

import java.io.Serializable;

public class Students implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.cardNo
     *
     * @mbggenerated
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.membershipId
     *
     * @mbggenerated
     */
    private Integer membershipid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.status
     *
     * @mbggenerated
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.stuNo
     *
     * @mbggenerated
     */
    private String stuno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column students.remake
     *
     * @mbggenerated
     */
    private String remake;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table students
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.id
     *
     * @return the value of students.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.id
     *
     * @param id the value for students.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.cardNo
     *
     * @return the value of students.cardNo
     *
     * @mbggenerated
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.cardNo
     *
     * @param cardno the value for students.cardNo
     *
     * @mbggenerated
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.name
     *
     * @return the value of students.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.name
     *
     * @param name the value for students.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.membershipId
     *
     * @return the value of students.membershipId
     *
     * @mbggenerated
     */
    public Integer getMembershipid() {
        return membershipid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.membershipId
     *
     * @param membershipid the value for students.membershipId
     *
     * @mbggenerated
     */
    public void setMembershipid(Integer membershipid) {
        this.membershipid = membershipid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.status
     *
     * @return the value of students.status
     *
     * @mbggenerated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.status
     *
     * @param status the value for students.status
     *
     * @mbggenerated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.stuNo
     *
     * @return the value of students.stuNo
     *
     * @mbggenerated
     */
    public String getStuno() {
        return stuno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.stuNo
     *
     * @param stuno the value for students.stuNo
     *
     * @mbggenerated
     */
    public void setStuno(String stuno) {
        this.stuno = stuno == null ? null : stuno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column students.remake
     *
     * @return the value of students.remake
     *
     * @mbggenerated
     */
    public String getRemake() {
        return remake;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column students.remake
     *
     * @param remake the value for students.remake
     *
     * @mbggenerated
     */
    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table students
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
        sb.append(", cardno=").append(cardno);
        sb.append(", name=").append(name);
        sb.append(", membershipid=").append(membershipid);
        sb.append(", status=").append(status);
        sb.append(", stuno=").append(stuno);
        sb.append(", remake=").append(remake);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}