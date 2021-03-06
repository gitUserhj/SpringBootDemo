package com.hj.entity;

import java.io.Serializable;
import java.util.Date;

public class Consumelogs implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.cardNo
     *
     * @mbggenerated
     */
    private String cardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.readroomId
     *
     * @mbggenerated
     */
    private Integer readroomid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.inTime
     *
     * @mbggenerated
     */
    private Date intime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.outTime
     *
     * @mbggenerated
     */
    private Date outtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column consumelogs.status
     *
     * @mbggenerated
     */
    private String status;
    
    private String readroomName;

    public String getReadroomName() {
		return readroomName;
	}

	public void setReadroomName(String readroomName) {
		this.readroomName = readroomName;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table consumelogs
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.id
     *
     * @return the value of consumelogs.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.id
     *
     * @param id the value for consumelogs.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.cardNo
     *
     * @return the value of consumelogs.cardNo
     *
     * @mbggenerated
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.cardNo
     *
     * @param cardno the value for consumelogs.cardNo
     *
     * @mbggenerated
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.readroomId
     *
     * @return the value of consumelogs.readroomId
     *
     * @mbggenerated
     */
    public Integer getReadroomid() {
        return readroomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.readroomId
     *
     * @param readroomid the value for consumelogs.readroomId
     *
     * @mbggenerated
     */
    public void setReadroomid(Integer readroomid) {
        this.readroomid = readroomid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.inTime
     *
     * @return the value of consumelogs.inTime
     *
     * @mbggenerated
     */
    public Date getIntime() {
        return intime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.inTime
     *
     * @param intime the value for consumelogs.inTime
     *
     * @mbggenerated
     */
    public void setIntime(Date intime) {
        this.intime = intime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.outTime
     *
     * @return the value of consumelogs.outTime
     *
     * @mbggenerated
     */
    public Date getOuttime() {
        return outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.outTime
     *
     * @param outtime the value for consumelogs.outTime
     *
     * @mbggenerated
     */
    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column consumelogs.status
     *
     * @return the value of consumelogs.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column consumelogs.status
     *
     * @param status the value for consumelogs.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
    
    
    
    public Consumelogs() {
		super();
	}

	
	
	

	public Consumelogs(Integer id, Date outtime, String status) {
		super();
		this.id = id;
		this.outtime = outtime;
		this.status = status;
	}

	public Consumelogs(String cardno, Integer readroomid, Date intime, Date outtime, String status) {
		super();
		this.cardno = cardno;
		this.readroomid = readroomid;
		this.intime = intime;
		this.outtime = outtime;
		this.status = status;
	}

	/**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table consumelogs
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
        sb.append(", readroomid=").append(readroomid);
        sb.append(", intime=").append(intime);
        sb.append(", outtime=").append(outtime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}