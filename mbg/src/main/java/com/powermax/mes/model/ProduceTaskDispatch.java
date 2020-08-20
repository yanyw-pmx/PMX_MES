package com.powermax.mes.model;

import java.io.Serializable;

public class ProduceTaskDispatch implements Serializable {
    private Long id;

    private Long userId;

    private Long dispatchId;

    private Long processId;

    private Long postCnt;

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

    public Long getPostCnt() {
        return postCnt;
    }

    public void setPostCnt(Long postCnt) {
        this.postCnt = postCnt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", dispatchId=").append(dispatchId);
        sb.append(", processId=").append(processId);
        sb.append(", postCnt=").append(postCnt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}