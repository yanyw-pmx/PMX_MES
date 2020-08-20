package com.powermax.mes.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ProduceProcess implements Serializable {
    private Long id;

    private Long processId;

    private Long productId;

    private String des;

    private Integer cycleTime;

    private Integer cycleStitch;

    private Integer cycleTrim;

    private BigDecimal workPrice;

    private Integer machineId;

    private Integer processType;

    private Integer sewingLength;

    private Integer sewingTime;

    private String partsName;

    private String remarks;

    private String videoUrl;

    private String pictureUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Integer getCycleTime() {
        return cycleTime;
    }

    public void setCycleTime(Integer cycleTime) {
        this.cycleTime = cycleTime;
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

    public BigDecimal getWorkPrice() {
        return workPrice;
    }

    public void setWorkPrice(BigDecimal workPrice) {
        this.workPrice = workPrice;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public Integer getSewingLength() {
        return sewingLength;
    }

    public void setSewingLength(Integer sewingLength) {
        this.sewingLength = sewingLength;
    }

    public Integer getSewingTime() {
        return sewingTime;
    }

    public void setSewingTime(Integer sewingTime) {
        this.sewingTime = sewingTime;
    }

    public String getPartsName() {
        return partsName;
    }

    public void setPartsName(String partsName) {
        this.partsName = partsName;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", processId=").append(processId);
        sb.append(", productId=").append(productId);
        sb.append(", des=").append(des);
        sb.append(", cycleTime=").append(cycleTime);
        sb.append(", cycleStitch=").append(cycleStitch);
        sb.append(", cycleTrim=").append(cycleTrim);
        sb.append(", workPrice=").append(workPrice);
        sb.append(", machineId=").append(machineId);
        sb.append(", processType=").append(processType);
        sb.append(", sewingLength=").append(sewingLength);
        sb.append(", sewingTime=").append(sewingTime);
        sb.append(", partsName=").append(partsName);
        sb.append(", remarks=").append(remarks);
        sb.append(", videoUrl=").append(videoUrl);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}