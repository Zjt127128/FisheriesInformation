package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统信息对象 netbox_information
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
public class NetboxInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 唯一标识符 */
    private Long id;

    /** 水域类型（海水、淡水、半咸水） */
    @Excel(name = "水域类型", readConverterExp = "海=水、淡水、半咸水")
    private Integer waterType;

    /** 苗种规格 */
    @Excel(name = "苗种规格")
    private String seedlingSpecifications;

    /** 苗种价格 */
    @Excel(name = "苗种价格")
    private BigDecimal seedlingPrice;

    /** 年投放量 */
    @Excel(name = "年投放量")
    private Long annualStockingVolume;

    /** 销售规格 */
    @Excel(name = "销售规格")
    private String salesSpecifications;

    /** 销售平均价格 */
    @Excel(name = "销售平均价格")
    private Long averagePricePerSale;

    /** 年产量 */
    @Excel(name = "年产量")
    private Long annualProductionVolume;

    /** 地理分区 */
    @Excel(name = "地理分区")
    private String geographical;

    /** 养殖方式 */
    @Excel(name = "养殖方式")
    private String cultureMethod;

    /** 养殖阶段 */
    @Excel(name = "养殖阶段")
    private String cultureStage;

    /** 网箱面积 */
    @Excel(name = "网箱面积")
    private String netboxArea;

    /** 苗种规格单位 */
    @Excel(name = "苗种规格单位")
    private String seedlingSpecificationsUnit;

    /** 苗种价格单位 */
    @Excel(name = "苗种价格单位")
    private String seedlingPriceUnit;

    /** 年投放量单位 */
    @Excel(name = "年投放量单位")
    private String annualStockingVolumeUnit;

    /** 销售规格单位 */
    @Excel(name = "销售规格单位")
    private String salesSpecificationsUnit;

    /** 销售平均价格单位 */
    @Excel(name = "销售平均价格单位")
    private String averagePricePerSaleUnit;

    /** 年产量单位 */
    @Excel(name = "年产量单位")
    private String annualProductionVolumeUnit;

    /** 网箱规格 */
    @Excel(name = "网箱规格")
    private String netboxSpecification;

    /** 产业成熟度 */
    @Excel(name = "产业成熟度")
    private String industrialMaturity;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setWaterType(Integer waterType) 
    {
        this.waterType = waterType;
    }

    public Integer getWaterType() 
    {
        return waterType;
    }
    public void setSeedlingSpecifications(String seedlingSpecifications) 
    {
        this.seedlingSpecifications = seedlingSpecifications;
    }

    public String getSeedlingSpecifications() 
    {
        return seedlingSpecifications;
    }
    public void setSeedlingPrice(BigDecimal seedlingPrice) 
    {
        this.seedlingPrice = seedlingPrice;
    }

    public BigDecimal getSeedlingPrice() 
    {
        return seedlingPrice;
    }
    public void setAnnualStockingVolume(Long annualStockingVolume) 
    {
        this.annualStockingVolume = annualStockingVolume;
    }

    public Long getAnnualStockingVolume() 
    {
        return annualStockingVolume;
    }
    public void setSalesSpecifications(String salesSpecifications) 
    {
        this.salesSpecifications = salesSpecifications;
    }

    public String getSalesSpecifications() 
    {
        return salesSpecifications;
    }
    public void setAveragePricePerSale(Long averagePricePerSale) 
    {
        this.averagePricePerSale = averagePricePerSale;
    }

    public Long getAveragePricePerSale() 
    {
        return averagePricePerSale;
    }
    public void setAnnualProductionVolume(Long annualProductionVolume) 
    {
        this.annualProductionVolume = annualProductionVolume;
    }

    public Long getAnnualProductionVolume() 
    {
        return annualProductionVolume;
    }
    public void setGeographical(String geographical) 
    {
        this.geographical = geographical;
    }

    public String getGeographical() 
    {
        return geographical;
    }
    public void setCultureMethod(String cultureMethod) 
    {
        this.cultureMethod = cultureMethod;
    }

    public String getCultureMethod() 
    {
        return cultureMethod;
    }
    public void setCultureStage(String cultureStage) 
    {
        this.cultureStage = cultureStage;
    }

    public String getCultureStage() 
    {
        return cultureStage;
    }
    public void setNetboxArea(String netboxArea) 
    {
        this.netboxArea = netboxArea;
    }

    public String getNetboxArea() 
    {
        return netboxArea;
    }
    public void setSeedlingSpecificationsUnit(String seedlingSpecificationsUnit) 
    {
        this.seedlingSpecificationsUnit = seedlingSpecificationsUnit;
    }

    public String getSeedlingSpecificationsUnit() 
    {
        return seedlingSpecificationsUnit;
    }
    public void setSeedlingPriceUnit(String seedlingPriceUnit) 
    {
        this.seedlingPriceUnit = seedlingPriceUnit;
    }

    public String getSeedlingPriceUnit() 
    {
        return seedlingPriceUnit;
    }
    public void setAnnualStockingVolumeUnit(String annualStockingVolumeUnit) 
    {
        this.annualStockingVolumeUnit = annualStockingVolumeUnit;
    }

    public String getAnnualStockingVolumeUnit() 
    {
        return annualStockingVolumeUnit;
    }
    public void setSalesSpecificationsUnit(String salesSpecificationsUnit) 
    {
        this.salesSpecificationsUnit = salesSpecificationsUnit;
    }

    public String getSalesSpecificationsUnit() 
    {
        return salesSpecificationsUnit;
    }
    public void setAveragePricePerSaleUnit(String averagePricePerSaleUnit) 
    {
        this.averagePricePerSaleUnit = averagePricePerSaleUnit;
    }

    public String getAveragePricePerSaleUnit() 
    {
        return averagePricePerSaleUnit;
    }
    public void setAnnualProductionVolumeUnit(String annualProductionVolumeUnit) 
    {
        this.annualProductionVolumeUnit = annualProductionVolumeUnit;
    }

    public String getAnnualProductionVolumeUnit() 
    {
        return annualProductionVolumeUnit;
    }
    public void setNetboxSpecification(String netboxSpecification) 
    {
        this.netboxSpecification = netboxSpecification;
    }

    public String getNetboxSpecification() 
    {
        return netboxSpecification;
    }
    public void setIndustrialMaturity(String industrialMaturity) 
    {
        this.industrialMaturity = industrialMaturity;
    }

    public String getIndustrialMaturity() 
    {
        return industrialMaturity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("waterType", getWaterType())
            .append("seedlingSpecifications", getSeedlingSpecifications())
            .append("seedlingPrice", getSeedlingPrice())
            .append("annualStockingVolume", getAnnualStockingVolume())
            .append("salesSpecifications", getSalesSpecifications())
            .append("averagePricePerSale", getAveragePricePerSale())
            .append("annualProductionVolume", getAnnualProductionVolume())
            .append("geographical", getGeographical())
            .append("cultureMethod", getCultureMethod())
            .append("cultureStage", getCultureStage())
            .append("netboxArea", getNetboxArea())
            .append("seedlingSpecificationsUnit", getSeedlingSpecificationsUnit())
            .append("seedlingPriceUnit", getSeedlingPriceUnit())
            .append("annualStockingVolumeUnit", getAnnualStockingVolumeUnit())
            .append("salesSpecificationsUnit", getSalesSpecificationsUnit())
            .append("averagePricePerSaleUnit", getAveragePricePerSaleUnit())
            .append("annualProductionVolumeUnit", getAnnualProductionVolumeUnit())
            .append("netboxSpecification", getNetboxSpecification())
            .append("industrialMaturity", getIndustrialMaturity())
            .toString();
    }
}
