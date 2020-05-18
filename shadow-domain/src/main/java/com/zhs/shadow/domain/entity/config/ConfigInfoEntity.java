package com.zhs.shadow.domain.entity.config;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import com.baomidou.mybatisplus.annotation.TableName;
import com.zhs.shadow.domain.entity.BaseEntity;

/**
 * <p>
 * 配置信息
 * </p>
 *
 * @author zhs
 * @since 2020-05-18
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_config_info")
public class ConfigInfoEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 健
     */
    private String configKey;

    /**
     * 值
     */
    private String configValue;

    /**
     * 是否启用 1 是 2否
     */
    private Integer state;


}
