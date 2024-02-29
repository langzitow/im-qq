package cn.ywt.entity;

import java.io.Serializable;
import java.util.Date;

public class MsgBaseEntity implements Serializable {
    private static final long serialVersionUID = 486484445L;


    private String createBy;

    private Date createTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
