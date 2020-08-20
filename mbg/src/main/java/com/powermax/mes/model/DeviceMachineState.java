package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class DeviceMachineState implements Serializable {
    private Long id;

    private Long userId;

    private Integer runState;

    private Boolean lockFlag;

    private Boolean autoFlag;

    private Long totalStitch;

    private Long totalTrim;

    private Long curStitch;

    private Long curTrim;

    private Long totalRunRime;

    private Long totalIdleTime;

    private Long curRunTime;

    private Long curIdleTime;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public Boolean getLockFlag() {
        return lockFlag;
    }

    public void setLockFlag(Boolean lockFlag) {
        this.lockFlag = lockFlag;
    }

    public Boolean getAutoFlag() {
        return autoFlag;
    }

    public void setAutoFlag(Boolean autoFlag) {
        this.autoFlag = autoFlag;
    }

    public Long getTotalStitch() {
        return totalStitch;
    }

    public void setTotalStitch(Long totalStitch) {
        this.totalStitch = totalStitch;
    }

    public Long getTotalTrim() {
        return totalTrim;
    }

    public void setTotalTrim(Long totalTrim) {
        this.totalTrim = totalTrim;
    }

    public Long getCurStitch() {
        return curStitch;
    }

    public void setCurStitch(Long curStitch) {
        this.curStitch = curStitch;
    }

    public Long getCurTrim() {
        return curTrim;
    }

    public void setCurTrim(Long curTrim) {
        this.curTrim = curTrim;
    }

    public Long getTotalRunRime() {
        return totalRunRime;
    }

    public void setTotalRunRime(Long totalRunRime) {
        this.totalRunRime = totalRunRime;
    }

    public Long getTotalIdleTime() {
        return totalIdleTime;
    }

    public void setTotalIdleTime(Long totalIdleTime) {
        this.totalIdleTime = totalIdleTime;
    }

    public Long getCurRunTime() {
        return curRunTime;
    }

    public void setCurRunTime(Long curRunTime) {
        this.curRunTime = curRunTime;
    }

    public Long getCurIdleTime() {
        return curIdleTime;
    }

    public void setCurIdleTime(Long curIdleTime) {
        this.curIdleTime = curIdleTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", runState=").append(runState);
        sb.append(", lockFlag=").append(lockFlag);
        sb.append(", autoFlag=").append(autoFlag);
        sb.append(", totalStitch=").append(totalStitch);
        sb.append(", totalTrim=").append(totalTrim);
        sb.append(", curStitch=").append(curStitch);
        sb.append(", curTrim=").append(curTrim);
        sb.append(", totalRunRime=").append(totalRunRime);
        sb.append(", totalIdleTime=").append(totalIdleTime);
        sb.append(", curRunTime=").append(curRunTime);
        sb.append(", curIdleTime=").append(curIdleTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}