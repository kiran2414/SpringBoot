package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private int custId;

    private String custName;

    private String custAddress;

    private String custEmailId;

    private long custContactNumber;

    @JsonFormat(pattern = "dd-mm-yyyy",timezone = "Asia/Kolkata")
    private Date custDOB;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public long getCustContactNumber() {
        return custContactNumber;
    }

    public void setCustContactNumber(long custContactNumber) {
        this.custContactNumber = custContactNumber;
    }

    public Date getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(Date custDOB) {
        this.custDOB = custDOB;
    }
}
