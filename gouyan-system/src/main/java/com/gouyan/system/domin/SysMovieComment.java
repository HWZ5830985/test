package com.gouyan.system.domin;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * 演员角色实体类
 * @Author: 华雨欣
 * @Create: 2020-11-19 22:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysMovieComment implements Serializable {

    private static final long serialVersionUID = 1L;

    //电影id
    @NotNull(message = "评论的电影不存在")
    private Long movieId;

    //用户id
    @NotNull(message = "评论的用户不存在")
    private Long userId;

    //评论时间
    private Date commentTime;

    //评论内容
    @NotBlank(message = "评论内容不能为空")
    private String content;

    //评分
    private Double score;


    //评论用户
    SysUser sysUser;

}
