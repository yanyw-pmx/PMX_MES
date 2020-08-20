package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class ProduceProcessDetail implements Serializable {
    private Long id;

    private Long dispatchId;

    private Long processId;

    private Integer avgCt;

    private Integer doneCnt;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getAvgCt() {
        return avgCt;
    }

    public void setAvgCt(Integer avgCt) {
        this.avgCt = avgCt;
    }

    public Integer getDoneCnt() {
        return doneCnt;
    }

    public void setDoneCnt(Integer doneCnt) {
        this.doneCnt = doneCnt;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dispatchId=").append(dispatchId);
        sb.append(", processId=").append(processId);
        sb.append(", avgCt=").append(avgCt);
        sb.append(", doneCnt=").append(doneCnt);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}