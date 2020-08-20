package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class SystemRfidRecorder implements Serializable {
    private Long id;

    private Long machineId;

    private Long rfidCardId;

    private Integer loginState;

    private Date creatTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMachineId() {
        return machineId;
    }

    public void setMachineId(Long machineId) {
        this.machineId = machineId;
    }

    public Long getRfidCardId() {
        return rfidCardId;
    }

    public void setRfidCardId(Long rfidCardId) {
        this.rfidCardId = rfidCardId;
    }

    public Integer getLoginState() {
        return loginState;
    }

    public void setLoginState(Integer loginState) {
        this.loginState = loginState;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", machineId=").append(machineId);
        sb.append(", rfidCardId=").append(rfidCardId);
        sb.append(", loginState=").append(loginState);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}