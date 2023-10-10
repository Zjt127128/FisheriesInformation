package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 特种育苗、养殖技术经济资源信息共享系统对象 tb_tezhongyumiao
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public class Tezhongyumiao extends BaseEntity
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

    /** 面积（亩） */
    @Excel(name = "面积", readConverterExp = "亩=")
    private String extent;

    /** 育苗养殖种类1 */
    @Excel(name = "育苗养殖种类1")
    private String breedingSpecies;

    /** 育苗养殖种类2 */
    @Excel(name = "育苗养殖种类2")
    private String fish;

    /** 年产量（斤） */
    @Excel(name = "年产量", readConverterExp = "斤=")
    private String annualOutput;

    /** 销售规格 */
    @Excel(name = "销售规格")
    private String annualOutputType;

    /** 平均销售价格 */
    @Excel(name = "平均销售价格")
    private BigDecimal sellingPrice;

    /** 年产量 鲢：鳙：其他比例 */
    @Excel(name = "年产量 鲢：鳙：其他比例")
    private String annualOutputProportion;

    /** 年投放量（斤） */
    @Excel(name = "年投放量", readConverterExp = "斤=")
    private String annualRelease;

    /** 年投放量 规格（尾/斤） */
    @Excel(name = "年投放量 规格", readConverterExp = "尾=/斤")
    private String annualReleaseType;

    /** 苗种或成本平均销售价格 */
    @Excel(name = "苗种或成本平均销售价格")
    private String seedlingPrice;

    /** 苗种或成本平均销售价格(元/尾、元/kg) */
    @Excel(name = "苗种或成本平均销售价格(元/尾、元/kg)")
    private String annualReleaseProportion;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 面积类型(0 亩1 公顷) */
    @Excel(name = "面积类型(0 亩1 公顷)")
    private String extentDanwei;

    /** 年产量(0 kg 1 吨) */
    @Excel(name = "年产量(0 kg 1 吨)")
    private String annualOutputDanwei;

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
    public void setAnnualOutputType(String annualOutputType) 
    {
        this.annualOutputType = annualOutputType;
    }

    public String getAnnualOutputType() 
    {
        return annualOutputType;
    }
    public void setSellingPrice(BigDecimal sellingPrice) 
    {
        this.sellingPrice = sellingPrice;
    }

    public BigDecimal getSellingPrice() 
    {
        return sellingPrice;
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
    public void setExtentDanwei(String extentDanwei) 
    {
        this.extentDanwei = extentDanwei;
    }

    public String getExtentDanwei() 
    {
        return extentDanwei;
    }
    public void setAnnualOutputDanwei(String annualOutputDanwei) 
    {
        this.annualOutputDanwei = annualOutputDanwei;
    }

    public String getAnnualOutputDanwei() 
    {
        return annualOutputDanwei;
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
            .append("breedingSpecies", getBreedingSpecies())
            .append("fish", getFish())
            .append("annualOutput", getAnnualOutput())
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
            .append("extentDanwei", getExtentDanwei())
            .append("annualOutputDanwei", getAnnualOutputDanwei())
            .append("userId", getUserId())
            .toString();
    }
}
