package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class SystemRepairRecord implements Serializable {
    private Long id;

    private Long rfidRecorderId;

    private Date startTime;

    private Date overTime;

    private String machineFaultCodes;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRfidRecorderId() {
        return rfidRecorderId;
    }

    public void setRfidRecorderId(Long rfidRecorderId) {
        this.rfidRecorderId = rfidRecorderId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    public String getMachineFaultCodes() {
        return machineFaultCodes;
    }

    public void setMachineFaultCodes(String machineFaultCodes) {
        this.machineFaultCodes = machineFaultCodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rfidRecorderId=").append(rfidRecorderId);
        sb.append(", startTime=").append(startTime);
        sb.append(", overTime=").append(overTime);
        sb.append(", machineFaultCodes=").append(machineFaultCodes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}