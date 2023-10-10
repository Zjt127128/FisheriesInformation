package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NetboxInformationMapper;
import com.ruoyi.system.domain.NetboxInformation;
import com.ruoyi.system.service.INetboxInformationService;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@Service
public class NetboxInformationServiceImpl implements INetboxInformationService 
{
    @Autowired
    private NetboxInformationMapper netboxInformationMapper;

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统信息主键
     * @return 网箱育苗、养殖技术经济资源信息共享系统信息
     */
    @Override
    public NetboxInformation selectNetboxInformationById(Long id)
    {
        return netboxInformationMapper.selectNetboxInformationById(id);
    }

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统信息列表
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 网箱育苗、养殖技术经济资源信息共享系统信息
     */
    @Override
    public List<NetboxInformation> selectNetboxInformationList(NetboxInformation netboxInformation)
    {
        return netboxInformationMapper.selectNetboxInformationList(netboxInformation);
    }

    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int insertNetboxInformation(NetboxInformation netboxInformation)
    {
        return netboxInformationMapper.insertNetboxInformation(netboxInformation);
    }

    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int updateNetboxInformation(NetboxInformation netboxInformation)
    {
        return netboxInformationMapper.updateNetboxInformation(netboxInformation);
    }

    /**
     * 批量删除网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的网箱育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteNetboxInformationByIds(Long[] ids)
    {
        return netboxInformationMapper.deleteNetboxInformationByIds(ids);
    }

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统信息信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteNetboxInformationById(Long id)
    {
        return netboxInformationMapper.deleteNetboxInformationById(id);
    }
}
