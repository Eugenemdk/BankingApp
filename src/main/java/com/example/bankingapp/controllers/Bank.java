package com.example.bankingapp.controllers;

public class Bank {
    private String custDetails;
    private String loanDetails;
    private String transNum;
    private String transDate;
    private String transTime;
    /**
     * @return String return the custDetails
     */
    public String getCustDetails() {
        return custDetails;
    }

    /**
     * @param custDetails the custDetails to set
     */
    public void setCustDetails(String custDetails) {
        this.custDetails = custDetails;
    }

    /**
     * @return String return the loanDetails
     */
    public String getLoanDetails() {
        return loanDetails;
    }

    /**
     * @param loanDetails the loanDetails to set
     */
    public void setLoanDetails(String loanDetails) {
        this.loanDetails = loanDetails;
    }

    /**
     * @return String return the transNum
     */
    public String getTransNum() {
        return transNum;
    }

    /**
     * @param transNum the transNum to set
     */
    public void setTransNum(String transNum) {
        this.transNum = transNum;
    }

    /**
     * @return String return the transDate
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * @param transDate the transDate to set
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    /**
     * @return String return the transTime
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * @param transTime the transTime to set
     */
    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }


}
