package com.mmcr.projectsys.entity;

import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;

/**
 * Created by Administrator on 2018/2/12.
 */
public class User {
    private Long id;
    /**
     * 用户昵称
     */
    @NotBlank
    private String nickname;
    /**
     * 用户密码
     */
    @NotBlank
    private String password;
    /**
     * 用户性别
     */
    @NotBlank
    private String gender;
    /**
     * 用户头像
     */
    @NotBlank
    private String headPortrait;
    /**
     * 用户手机号
     */
    @NotBlank
    private String cellPhoneNumber;
    /**
     * 用户添加时间
     */
    private Date addTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", headPortrait='" + headPortrait + '\'' +
                ", cellPhoneNumber='" + cellPhoneNumber + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
