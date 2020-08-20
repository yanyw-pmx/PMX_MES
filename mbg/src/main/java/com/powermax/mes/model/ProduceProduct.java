package com.powermax.mes.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.io.Serializable;


@ApiModel(value = "Product参数")
public class ProduceProduct implements Serializable {

    private Long id;

    @ApiModelProperty(value = "产品编号",required = true)
    @NotNull(message = "产编号不能为空")
    private String productNum;

    @ApiModelProperty(value = "产品名",required = true)
    @NotNull(message = "产品名不能为空")
    private String productName;

    private String pictureUrl;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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
        sb.append(", productNum=").append(productNum);
        sb.append(", productName=").append(productName);
        sb.append(", pictureUrl=").append(pictureUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}