package com.zhs.shadow.admin.vo.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhs.shadow.admin.vo.BaseVo;
import com.zhs.shadow.domain.entity.BaseEntity;

/**
 * <p>
 * 配置信息的key描述
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Data

public class ConfigKeyVo extends BaseVo {

    private static final long serialVersionUID = 1L;

    /**
     * 键
     */
    private String configKey;

    /**
     * 键描述
     */
    private String configDesc;


}
