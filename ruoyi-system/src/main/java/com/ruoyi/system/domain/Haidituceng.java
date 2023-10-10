package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 *  海底滩涂增养殖技术经济资源信息共享系统对象 tb_haidituceng
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public class Haidituceng extends BaseEntity
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

    /** 水域类型 */
    @Excel(name = "水域类型")
    private String waters;

    /** 面积 */
    @Excel(name = "面积")
    private String extent;

    /** 面积类型(0 亩1 公顷) */
    @Excel(name = "面积类型(0 亩1 公顷)")
    private String extentDanwei;

    /** 增养殖物种类1 */
    @Excel(name = "增养殖物种类1")
    private String breedingSpecies;

    /** 增养殖物种类2 */
    @Excel(name = "增养殖物种类2")
    private String fish;

    /** 年产量（斤） */
    @Excel(name = "年产量", readConverterExp = "斤=")
    private String annualOutput;

    /** 年产量(0 kg 1 吨) */
    @Excel(name = "年产量(0 kg 1 吨)")
    private String annualOutputDanwei;

    /** 销售规格（尾/斤） */
    @Excel(name = "销售规格", readConverterExp = "尾=/斤")
    private String annualOutputType;

    /** 销售平均价格（元/斤） */
    @Excel(name = "销售平均价格", readConverterExp = "元=/斤")
    private String sellingPrice;

    /** 主要产品的比例 */
    @Excel(name = "主要产品的比例")
    private String annualOutputProportion;

    /** 年投放量（斤） */
    @Excel(name = "年投放量", readConverterExp = "斤=")
    private String annualRelease;

    /** 投放规格（尾/斤） */
    @Excel(name = "投放规格", readConverterExp = "尾=/斤")
    private String annualReleaseType;

    /** 苗种平均价格（元/kg） */
    @Excel(name = "苗种平均价格", readConverterExp = "元=/kg")
    private String seedlingPrice;

    /** 苗种中鲢：鳙：其他比例 */
    @Excel(name = "苗种中鲢：鳙：其他比例")
    private String annualReleaseProportion;

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
    public void setWaters(String waters) 
    {
        this.waters = waters;
    }

    public String getWaters() 
    {
        return waters;
    }
    public void setExtent(String extent) 
    {
        this.extent = extent;
    }

    public String getExtent() 
    {
        return extent;
    }
    public void setExtentDanwei(String extentDanwei) 
    {
        this.extentDanwei = extentDanwei;
    }

    public String getExtentDanwei() 
    {
        return extentDanwei;
    }
    public void setBreedingSpecies(String breedingSpecies) 
    {
        this.breedingSpecies = breedingSpecies;
    }

    public String getBreedingSpecies() 
    {
        return breedingSpecies;
    }
    public void setFish(String fish) 
    {
        this.fish = fish;
    }

    public String getFish() 
    {
        return fish;
    }
    public void setAnnualOutput(String annualOutput) 
    {
        this.annualOutput = annualOutput;
    }

    public String getAnnualOutput() 
    {
        return annualOutput;
    }
    public void setAnnualOutputDanwei(String annualOutputDanwei) 
    {
        this.annualOutputDanwei = annualOutputDanwei;
    }

    public String getAnnualOutputDanwei() 
    {
        return annualOutputDanwei;
    }
    public void setAnnualOutputType(String annualOutputType) 
    {
        this.annualOutputType = annualOutputType;
    }

    public String getAnnualOutputType() 
    {
        return annualOutputType;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setAnnualOutputProportion(String annualOutputProportion)
    {
        this.annualOutputProportion = annualOutputProportion;
    }

    public String getAnnualOutputProportion() 
    {
        return annualOutputProportion;
    }
    public void setAnnualRelease(String annualRelease) 
    {
        this.annualRelease = annualRelease;
    }

    public String getAnnualRelease() 
    {
        return annualRelease;
    }
    public void setAnnualReleaseType(String annualReleaseType) 
    {
        this.annualReleaseType = annualReleaseType;
    }

    public String getAnnualReleaseType() 
    {
        return annualReleaseType;
    }
    public void setSeedlingPrice(String seedlingPrice) 
    {
        this.seedlingPrice = seedlingPrice;
    }

    public String getSeedlingPrice() 
    {
        return seedlingPrice;
    }
    public void setAnnualReleaseProportion(String annualReleaseProportion) 
    {
        this.annualReleaseProportion = annualReleaseProportion;
    }

    public String getAnnualReleaseProportion() 
    {
        return annualReleaseProportion;
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
            .append("waters", getWaters())
            .append("extent", getExtent())
            .append("extentDanwei", getExtentDanwei())
            .append("breedingSpecies", getBreedingSpecies())
            .append("fish", getFish())
            .append("annualOutput", getAnnualOutput())
            .append("annualOutputDanwei", getAnnualOutputDanwei())
            .append("annualOutputType", getAnnualOutputType())
            .append("sellingPrice", getSellingPrice())
            .append("annualOutputProportion", getAnnualOutputProportion())
            .append("annualRelease", getAnnualRelease())
            .append("annualReleaseType", getAnnualReleaseType())
            .append("seedlingPrice", getSeedlingPrice())
            .append("annualReleaseProportion", getAnnualReleaseProportion())
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
