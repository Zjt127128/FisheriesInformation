package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ReservoirInformationMapper;
import com.ruoyi.system.domain.ReservoirInformation;
import com.ruoyi.system.service.IReservoirInformationService;

/**
 * 水库等大水面渔业技术经济资源信息共享系统信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@Service
public class ReservoirInformationServiceImpl implements IReservoirInformationService 
{
    @Autowired
    private ReservoirInformationMapper reservoirInformationMapper;

    /**
     * 查询水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param id 水库等大水面渔业技术经济资源信息共享系统信息主键
     * @return 水库等大水面渔业技术经济资源信息共享系统信息
     */
    @Override
    public ReservoirInformation selectReservoirInformationById(Long id)
    {
        return reservoirInformationMapper.selectReservoirInformationById(id);
    }

    /**
     * 查询水库等大水面渔业技术经济资源信息共享系统信息列表
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 水库等大水面渔业技术经济资源信息共享系统信息
     */
    @Override
    public List<ReservoirInformation> selectReservoirInformationList(ReservoirInformation reservoirInformation)
    {
        return reservoirInformationMapper.selectReservoirInformationList(reservoirInformation);
    }

    /**
     * 新增水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int insertReservoirInformation(ReservoirInformation reservoirInformation)
    {
        return reservoirInformationMapper.insertReservoirInformation(reservoirInformation);
    }

    /**
     * 修改水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int updateReservoirInformation(ReservoirInformation reservoirInformation)
    {
        return reservoirInformationMapper.updateReservoirInformation(reservoirInformation);
    }

    /**
     * 批量删除水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的水库等大水面渔业技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteReservoirInformationByIds(Long[] ids)
    {
        return reservoirInformationMapper.deleteReservoirInformationByIds(ids);
    }

    /**
     * 删除水库等大水面渔业技术经济资源信息共享系统信息信息
     * 
     * @param id 水库等大水面渔业技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteReservoirInformationById(Long id)
    {
        return reservoirInformationMapper.deleteReservoirInformationById(id);
    }
}
