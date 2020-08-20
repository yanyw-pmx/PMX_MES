package com.powermax.mes.model;

import java.io.Serializable;
import java.util.Date;

public class SystemReworkRecord implements Serializable {
    private Long id;

    private Long userId;

    private Long timer;

    private Long piece;

    private Date date;

    private String reworkCodes;

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

    public Long getTimer() {
        return timer;
    }

    public void setTimer(Long timer) {
        this.timer = timer;
    }

    public Long getPiece() {
        return piece;
    }

    public void setPiece(Long piece) {
        this.piece = piece;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getReworkCodes() {
        return reworkCodes;
    }

    public void setReworkCodes(String reworkCodes) {
        this.reworkCodes = reworkCodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", timer=").append(timer);
        sb.append(", piece=").append(piece);
        sb.append(", date=").append(date);
        sb.append(", reworkCodes=").append(reworkCodes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}