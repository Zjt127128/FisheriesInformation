package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AquacultureInformationMapper;
import com.ruoyi.system.domain.AquacultureInformation;
import com.ruoyi.system.service.IAquacultureInformationService;

/**
 * 工厂化育苗、养殖技术经济资源信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-02
 */
@Service
public class AquacultureInformationServiceImpl implements IAquacultureInformationService 
{
    @Autowired
    private AquacultureInformationMapper aquacultureInformationMapper;

    /**
     * 查询工厂化育苗、养殖技术经济资源信息
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息主键
     * @return 工厂化育苗、养殖技术经济资源信息
     */
    @Override
    public AquacultureInformation selectAquacultureInformationById(Long id)
    {
        return aquacultureInformationMapper.selectAquacultureInformationById(id);
    }

    /**
     * 查询工厂化育苗、养殖技术经济资源信息列表
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 工厂化育苗、养殖技术经济资源信息
     */
    @Override
    public List<AquacultureInformation> selectAquacultureInformationList(AquacultureInformation aquacultureInformation)
    {
        return aquacultureInformationMapper.selectAquacultureInformationList(aquacultureInformation);
    }

    /**
     * 新增工厂化育苗、养殖技术经济资源信息
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 结果
     */
    @Override
    public int insertAquacultureInformation(AquacultureInformation aquacultureInformation)
    {
        return aquacultureInformationMapper.insertAquacultureInformation(aquacultureInformation);
    }

    /**
     * 修改工厂化育苗、养殖技术经济资源信息
     * 
     * @param aquacultureInformation 工厂化育苗、养殖技术经济资源信息
     * @return 结果
     */
    @Override
    public int updateAquacultureInformation(AquacultureInformation aquacultureInformation)
    {
        return aquacultureInformationMapper.updateAquacultureInformation(aquacultureInformation);
    }

    /**
     * 批量删除工厂化育苗、养殖技术经济资源信息
     * 
     * @param ids 需要删除的工厂化育苗、养殖技术经济资源信息主键
     * @return 结果
     */
    @Override
    public int deleteAquacultureInformationByIds(Long[] ids)
    {
        return aquacultureInformationMapper.deleteAquacultureInformationByIds(ids);
    }

    /**
     * 删除工厂化育苗、养殖技术经济资源信息信息
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息主键
     * @return 结果
     */
    @Override
    public int deleteAquacultureInformationById(Long id)
    {
        return aquacultureInformationMapper.deleteAquacultureInformationById(id);
    }
}
