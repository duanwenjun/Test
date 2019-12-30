package com.duanwj.learn;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 时光
 * @date 2019/12/30 10:35
 * @description
 */
@Data
@Accessors(chain = true)
public class UserCacheObject implements Serializable {
    private Integer id;
    private String name;
    private Integer gender;

    @Override
    public String toString() {
        return "UserCacheObject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
