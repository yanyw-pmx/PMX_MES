package com.powermax.mes.model;

import java.io.Serializable;

public class DeviceSeries implements Serializable {
    private Long id;

    private Integer manufacturerId;

    private Integer machineTypeId;

    private String seriesName;

    private Long ecufaultGroupId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getMachineTypeId() {
        return machineTypeId;
    }

    public void setMachineTypeId(Integer machineTypeId) {
        this.machineTypeId = machineTypeId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Long getEcufaultGroupId() {
        return ecufaultGroupId;
    }

    public void setEcufaultGroupId(Long ecufaultGroupId) {
        this.ecufaultGroupId = ecufaultGroupId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", manufacturerId=").append(manufacturerId);
        sb.append(", machineTypeId=").append(machineTypeId);
        sb.append(", seriesName=").append(seriesName);
        sb.append(", ecufaultGroupId=").append(ecufaultGroupId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}