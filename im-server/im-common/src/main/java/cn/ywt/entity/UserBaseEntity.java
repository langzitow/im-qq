package cn.ywt.entity;

import java.io.Serializable;

public class UserBaseEntity implements Serializable {
    private static final long serialVersionUID = 123154L;
    private Long userId;
    private String userName;
    private String sex;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
