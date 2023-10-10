package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ShippingSystemMapper;
import com.ruoyi.system.domain.ShippingSystem;
import com.ruoyi.system.service.IShippingSystemService;

/**
 * 渔业船舶技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class ShippingSystemServiceImpl implements IShippingSystemService 
{
    @Autowired
    private ShippingSystemMapper shippingSystemMapper;

    /**
     * 查询渔业船舶技术经济资源信息共享系统
     * 
     * @param id 渔业船舶技术经济资源信息共享系统主键
     * @return 渔业船舶技术经济资源信息共享系统
     */
    @Override
    public ShippingSystem selectShippingSystemById(Long id)
    {
        return shippingSystemMapper.selectShippingSystemById(id);
    }

    /**
     * 查询渔业船舶技术经济资源信息共享系统列表
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 渔业船舶技术经济资源信息共享系统
     */
    @Override
    public List<ShippingSystem> selectShippingSystemList(ShippingSystem shippingSystem)
    {
        return shippingSystemMapper.selectShippingSystemList(shippingSystem);
    }

    @Override
    public List<ShippingSystem> selectShippingSystemListByUserLevel(ShippingSystem shippingSystem) {
        return shippingSystemMapper.selectShippingSystemListByUserLevel(shippingSystem);
    }

    /**
     * 新增渔业船舶技术经济资源信息共享系统
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertShippingSystem(ShippingSystem shippingSystem)
    {
        shippingSystem.setCreateTime(DateUtils.getNowDate());
        return shippingSystemMapper.insertShippingSystem(shippingSystem);
    }

    /**
     * 修改渔业船舶技术经济资源信息共享系统
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateShippingSystem(ShippingSystem shippingSystem)
    {
        shippingSystem.setUpdateTime(DateUtils.getNowDate());
        return shippingSystemMapper.updateShippingSystem(shippingSystem);
    }

    /**
     * 批量删除渔业船舶技术经济资源信息共享系统
     * 
     * @param ids 需要删除的渔业船舶技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteShippingSystemByIds(Long[] ids)
    {
        return shippingSystemMapper.deleteShippingSystemByIds(ids);
    }

    /**
     * 删除渔业船舶技术经济资源信息共享系统信息
     * 
     * @param id 渔业船舶技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteShippingSystemById(Long id)
    {
        return shippingSystemMapper.deleteShippingSystemById(id);
    }
}
