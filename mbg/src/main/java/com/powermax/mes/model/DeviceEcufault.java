package com.powermax.mes.model;

import java.io.Serializable;

public class DeviceEcufault implements Serializable {
    private Long id;

    private Long ecufaultGroupId;

    private Long errorCode;

    private String name;

    private String remarks;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEcufaultGroupId() {
        return ecufaultGroupId;
    }

    public void setEcufaultGroupId(Long ecufaultGroupId) {
        this.ecufaultGroupId = ecufaultGroupId;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        sb.append(", ecufaultGroupId=").append(ecufaultGroupId);
        sb.append(", errorCode=").append(errorCode);
        sb.append(", name=").append(name);
        sb.append(", remarks=").append(remarks);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}