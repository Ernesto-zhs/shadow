package com.zhs.shadow.domain.entity.admin;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhs.shadow.domain.entity.BaseEntity;

/**
 * <p>
 * 管理员账户表
 * </p>
 *
 * @author zhs
 * @since 2020-05-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_admin_user_account")
public class AdminUserAccountEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 登陆密码
     */
    private String loginPassword;

    /**
     * 用户ID
     */
    private Long adminInfoId;

    /**
     * 登录地IP
     */
    private String ipAddress;

    /**
     * 上次登录时间
     */
    private LocalDateTime lastLoginTime;


}
