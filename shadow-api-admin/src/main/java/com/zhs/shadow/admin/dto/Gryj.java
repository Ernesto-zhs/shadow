package com.zhs.shadow.admin.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 业绩公示
 *
 * @author yangtao
 * @version 1.0 2015/07/30
 */

@Data
@ApiModel(value = "Gryj", description = "个人业绩")
public class Gryj {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "刪除标志")
    private String deleteFlag;


    @ApiModelProperty(value = "创建时间")
    private Timestamp createTime;


    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp updateTime;

    @ApiModelProperty(value = "开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp kssj;

    @ApiModelProperty(value = "结束时间")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Timestamp jssj;

    @ApiModelProperty(value = "业绩名称")
    private String yjmc;

    @ApiModelProperty(value = "主要工作内容")
    private String zygznr;

    @ApiModelProperty(value = "工作成效")
    private String qdcx;

    @ApiModelProperty(value = "状态")
    private String zt;

    @ApiModelProperty(value = "证明人id")
    private String zmrId;

    @ApiModelProperty(value = "证明人名称")
    private String zmrMz;

    @ApiModelProperty(value = "个人名次")
    private String grmc;

    @ApiModelProperty(value = "个人名次")
    private String grmcZrs;

    @ApiModelProperty(value = "业绩难度")
    private String yjnd;

    @ApiModelProperty(value = "业绩评价标准")
    private String yjpjbz;

    @ApiModelProperty(value = "业绩角色")
    private String jjjs;

    @ApiModelProperty(value = "业绩级别")
    private String yjjb;

    @ApiModelProperty(value = "管理人")
    private String orderBy;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "是否提交")
    private String pushFlag;

    @ApiModelProperty(value = "分数")
    private BigDecimal score;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "个人业绩id")
    private String gryjId;

    @ApiModelProperty(value = "组织id")
    private String orgId;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "组织id")
    private String companyteamNo;

    @ApiModelProperty(value = "id集合以逗号分割")
    private String ids;

    @ApiModelProperty(value = "id集合以逗号分割")
    private String[] idarr;



}