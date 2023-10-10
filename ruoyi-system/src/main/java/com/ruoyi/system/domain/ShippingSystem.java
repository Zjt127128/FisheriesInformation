package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 渔业船舶技术经济资源信息共享系统对象 tb_shipping_system
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public class ShippingSystem extends BaseEntity
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

    /** 作业水域 */
    @Excel(name = "作业水域")
    private String jobArea;

    /** 船籍港 */
    @Excel(name = "船籍港")
    private String homePort;

    /** 作业方式 */
    @Excel(name = "作业方式")
    private String jobWay;

    /** 船长：宽：深 */
    @Excel(name = "船长：宽：深")
    private String shipLength;

    /** 材质 */
    @Excel(name = "材质")
    private String materialQuality;

    /** 年油耗（L） */
    @Excel(name = "年油耗", readConverterExp = "L=")
    private String annualFuel;

    /** 证件是否齐全 */
    @Excel(name = "证件是否齐全")
    private String certificates;

    /** 附属设备是否齐全 */
    @Excel(name = "附属设备是否齐全")
    private String equipment;

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
    public void setJobArea(String jobArea) 
    {
        this.jobArea = jobArea;
    }

    public String getJobArea() 
    {
        return jobArea;
    }
    public void setHomePort(String homePort) 
    {
        this.homePort = homePort;
    }

    public String getHomePort() 
    {
        return homePort;
    }
    public void setJobWay(String jobWay) 
    {
        this.jobWay = jobWay;
    }

    public String getJobWay() 
    {
        return jobWay;
    }
    public void setShipLength(String shipLength) 
    {
        this.shipLength = shipLength;
    }

    public String getShipLength() 
    {
        return shipLength;
    }
    public void setMaterialQuality(String materialQuality) 
    {
        this.materialQuality = materialQuality;
    }

    public String getMaterialQuality() 
    {
        return materialQuality;
    }
    public void setAnnualFuel(String annualFuel) 
    {
        this.annualFuel = annualFuel;
    }

    public String getAnnualFuel() 
    {
        return annualFuel;
    }
    public void setCertificates(String certificates) 
    {
        this.certificates = certificates;
    }

    public String getCertificates() 
    {
        return certificates;
    }
    public void setEquipment(String equipment) 
    {
        this.equipment = equipment;
    }

    public String getEquipment() 
    {
        return equipment;
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
            .append("jobArea", getJobArea())
            .append("homePort", getHomePort())
            .append("jobWay", getJobWay())
            .append("shipLength", getShipLength())
            .append("materialQuality", getMaterialQuality())
            .append("annualFuel", getAnnualFuel())
            .append("certificates", getCertificates())
            .append("equipment", getEquipment())
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
