package com.powermax.mes.model;

import java.io.Serializable;

public class SystemRfidCards implements Serializable {
    private Long id;

    private Integer rfidTypeId;

    private String serialNum;

    private String cardNum;

    private Long workerId;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRfidTypeId() {
        return rfidTypeId;
    }

    public void setRfidTypeId(Integer rfidTypeId) {
        this.rfidTypeId = rfidTypeId;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rfidTypeId=").append(rfidTypeId);
        sb.append(", serialNum=").append(serialNum);
        sb.append(", cardNum=").append(cardNum);
        sb.append(", workerId=").append(workerId);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}