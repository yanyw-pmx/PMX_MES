package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class ProduceOrderDispatch implements Serializable {
    private Long id;

    private Long orderId;

    private Long productId;

    private Long orgId;

    private Integer count;

    private Integer cntPara;

    private Date dispatchDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCntPara() {
        return cntPara;
    }

    public void setCntPara(Integer cntPara) {
        this.cntPara = cntPara;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", productId=").append(productId);
        sb.append(", orgId=").append(orgId);
        sb.append(", count=").append(count);
        sb.append(", cntPara=").append(cntPara);
        sb.append(", dispatchDate=").append(dispatchDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}