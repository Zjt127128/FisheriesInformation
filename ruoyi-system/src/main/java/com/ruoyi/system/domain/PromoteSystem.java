package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 涉渔科技成果转化、推广共享系统对象 tb_promote_system
 *
 * @author ruoyi
 * @date 2023-02-23
 */
public class PromoteSystem extends BaseEntity
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

    /** 身份类别：1.业主，2.专家，3.涉渔机构 */
    @Excel(name = "身份类别：1.业主，2.专家，3.涉渔机构")
    private String identityCategory;

    /** 拟推广、转让科技成果名称 */
    @Excel(name = "拟推广、转让科技成果名称")
    private String scienceName;

    /** 应用领域概述 */
    @Excel(name = "应用领域概述")
    private String applicationFields;

    /** 有无连线相关人员或机构的现实需求 */
    @Excel(name = "有无连线相关人员或机构的现实需求")
    private String connectionStatus;

    /** 审批状态(0未审核 1 审核通过2 审核未通过) */
    @Excel(name = "审批状态(0未审核 1 审核通过2 审核未通过)")
    private String type;

    /** 会员(用户)id */
    @Excel(name = "会员(用户)id")
    private Long userId;

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
    public void setIdentityCategory(String identityCategory)
    {
        this.identityCategory = identityCategory;
    }

    public String getIdentityCategory()
    {
        return identityCategory;
    }
    public void setScienceName(String scienceName)
    {
        this.scienceName = scienceName;
    }

    public String getScienceName()
    {
        return scienceName;
    }
    public void setApplicationFields(String applicationFields)
    {
        this.applicationFields = applicationFields;
    }

    public String getApplicationFields()
    {
        return applicationFields;
    }
    public void setConnectionStatus(String connectionStatus)
    {
        this.connectionStatus = connectionStatus;
    }

    public String getConnectionStatus()
    {
        return connectionStatus;
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
                .append("identityCategory", getIdentityCategory())
                .append("scienceName", getScienceName())
                .append("applicationFields", getApplicationFields())
                .append("connectionStatus", getConnectionStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("type", getType())
                .append("userId", getUserId())
                .toString();
    }
}
