package com.zhs.shadow.domain.entity.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
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
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_config_key")
public class ConfigKeyEntity extends BaseEntity {

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
