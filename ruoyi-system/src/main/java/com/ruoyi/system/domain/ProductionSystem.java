package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 渔业生产、事故在线技术咨询、服务系统对象 tb_production_system
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public class ProductionSystem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 会员等级 */
    @Excel(name = "会员等级")
    private String userLevel;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String phone;

    /** 省 */
    @Excel(name = "省")
    private String province;

    /** 市 */
    @Excel(name = "市")
    private String city;

    /** 区 */
    @Excel(name = "区")
    private String area;

    /** 事故概述 */
    @Excel(name = "事故概述")
    private String accidentOverview;

    /** 寻求何种帮助：1.法律咨询、2.评估咨询等 */
    @Excel(name = "寻求何种帮助：1.法律咨询、2.评估咨询等")
    private String helpSeek;

    /** 审批状态(0未审核 1 审核通过2 审核未通过) */
    @Excel(name = "审批状态(0未审核 1 审核通过2 审核未通过)")
    private String type;

    /** 会员(用户)id */
    @Excel(name = "会员(用户)id")
    private Long userId;

    /** 关键影像资料 */
    @Excel(name = "关键影像资料")
    private String imageData;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setUserLevel(String userLevel) 
    {
        this.userLevel = userLevel;
    }

    public String getUserLevel() 
    {
        return userLevel;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setProvince(String province) 
    {
        this.province = province;
    }

    public String getProvince() 
    {
        return province;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getCity() 
    {
        return city;
    }
    public void setArea(String area) 
    {
        this.area = area;
    }

    public String getArea() 
    {
        return area;
    }
    public void setAccidentOverview(String accidentOverview) 
    {
        this.accidentOverview = accidentOverview;
    }

    public String getAccidentOverview() 
    {
        return accidentOverview;
    }
    public void setHelpSeek(String helpSeek) 
    {
        this.helpSeek = helpSeek;
    }

    public String getHelpSeek() 
    {
        return helpSeek;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setImageData(String imageData) 
    {
        this.imageData = imageData;
    }

    public String getImageData() 
    {
        return imageData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("userLevel", getUserLevel())
            .append("phone", getPhone())
            .append("province", getProvince())
            .append("city", getCity())
            .append("area", getArea())
            .append("accidentOverview", getAccidentOverview())
            .append("helpSeek", getHelpSeek())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("type", getType())
            .append("userId", getUserId())
            .append("imageData", getImageData())
            .toString();
    }
}
