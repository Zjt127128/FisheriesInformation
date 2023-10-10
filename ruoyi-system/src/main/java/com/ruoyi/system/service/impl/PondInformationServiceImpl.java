package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PondInformationMapper;
import com.ruoyi.system.domain.PondInformation;
import com.ruoyi.system.service.IPondInformationService;

/**
 * 池塘育苗、养殖技术经济资源信息共享系统信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@Service
public class PondInformationServiceImpl implements IPondInformationService 
{
    @Autowired
    private PondInformationMapper pondInformationMapper;

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统信息主键
     * @return 池塘育苗、养殖技术经济资源信息共享系统信息
     */
    @Override
    public PondInformation selectPondInformationById(Long id)
    {
        return pondInformationMapper.selectPondInformationById(id);
    }

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统信息列表
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 池塘育苗、养殖技术经济资源信息共享系统信息
     */
    @Override
    public List<PondInformation> selectPondInformationList(PondInformation pondInformation)
    {
        return pondInformationMapper.selectPondInformationList(pondInformation);
    }

    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int insertPondInformation(PondInformation pondInformation)
    {
        return pondInformationMapper.insertPondInformation(pondInformation);
    }

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int updatePondInformation(PondInformation pondInformation)
    {
        return pondInformationMapper.updatePondInformation(pondInformation);
    }

    /**
     * 批量删除池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的池塘育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deletePondInformationByIds(Long[] ids)
    {
        return pondInformationMapper.deletePondInformationByIds(ids);
    }

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统信息信息
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deletePondInformationById(Long id)
    {
        return pondInformationMapper.deletePondInformationById(id);
    }
}
