package com.zhs.shadow.admin.vo.admin;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhs.shadow.admin.vo.BaseVo;
import com.zhs.shadow.domain.entity.BaseEntity;

/**
 * <p>
 * 管理员信息表
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AdminInfoVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员编号
     */
    private String adminNo;

    /**
     * 用户名称
     */
    private String username;

    /**
     * 用户头像
     */
    private String avatarUrl;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 状态 0 禁用 1 启用
     */
    private Integer state;

    /**
     * 备注
     */
    private String remark;


}
