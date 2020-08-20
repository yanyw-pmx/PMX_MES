package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class ProduceProcessPiece implements Serializable {
    private Long id;

    private Long workerId;

    private Long dispatchId;

    private Long processId;

    private Long machineId;

    private Integer cycleTime;

    private Integer valueTime;

    private Integer cycleStitch;

    private Integer cycleTrim;

    private Integer doneCnt;

    private Date overTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Long workerId) {
        this.workerId = workerId;
    }

    public Long getDispatchId() {
        return dispatchId;
    }

    public void setDispatchId(Long dispatchId) {
        this.dispatchId = dispatchId;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getMachineId() {
        return machineId;
    }

    public void setMachineId(Long machineId) {
        this.machineId = machineId;
    }

    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
    }

    public Integer getValueTime() {
        return valueTime;
    }

    public void setValueTime(Integer valueTime) {
        this.valueTime = valueTime;
    }

    public Integer getCycleStitch() {
        return cycleStitch;
    }

    public void setCycleStitch(Integer cycleStitch) {
        this.cycleStitch = cycleStitch;
    }

    public Integer getCycleTrim() {
        return cycleTrim;
    }

    public void setCycleTrim(Integer cycleTrim) {
        this.cycleTrim = cycleTrim;
    }

    public Integer getDoneCnt() {
        return doneCnt;
    }

    public void setDoneCnt(Integer doneCnt) {
        this.doneCnt = doneCnt;
    }

    public Date getOverTime() {
        return overTime;
    }

    public void setOverTime(Date overTime) {
        this.overTime = overTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", workerId=").append(workerId);
        sb.append(", dispatchId=").append(dispatchId);
        sb.append(", processId=").append(processId);
        sb.append(", machineId=").append(machineId);
        sb.append(", cycleTime=").append(cycleTime);
        sb.append(", valueTime=").append(valueTime);
        sb.append(", cycleStitch=").append(cycleStitch);
        sb.append(", cycleTrim=").append(cycleTrim);
        sb.append(", doneCnt=").append(doneCnt);
        sb.append(", overTime=").append(overTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}