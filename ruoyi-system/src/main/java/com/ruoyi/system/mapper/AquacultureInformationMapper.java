package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.AquacultureInformation;

/**
 * 工厂化育苗、养殖技术经济资源信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-02
 */
public interface AquacultureInformationMapper 
{
    /**
     * 查询工厂化育苗、养殖技术经济资源信息
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息主键
     * @return 工厂化育苗、养殖技术经济资源信息
     */
    public AquacultureInformation selectAquacultureInformationById(Long id);

    /**
     * 查询工厂化育苗、养殖技术经济资源信息列表
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 工厂化育苗、养殖技术经济资源信息集合
     */
    public List<AquacultureInformation> selectAquacultureInformationList(AquacultureInformation aquacultureInformation);

    /**
     * 新增工厂化育苗、养殖技术经济资源信息
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 结果
     */
    public int insertAquacultureInformation(AquacultureInformation aquacultureInformation);

    /**
     * 修改工厂化育苗、养殖技术经济资源信息
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 结果
     */
    public int updateAquacultureInformation(AquacultureInformation aquacultureInformation);

    /**
     * 删除工厂化育苗、养殖技术经济资源信息
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息主键
     * @return 结果
     */
    public int deleteAquacultureInformationById(Long id);

    /**
     * 批量删除工厂化育苗、养殖技术经济资源信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAquacultureInformationByIds(Long[] ids);
}
