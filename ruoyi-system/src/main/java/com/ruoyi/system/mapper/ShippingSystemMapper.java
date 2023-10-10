package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ShippingSystem;

/**
 * 渔业船舶技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface ShippingSystemMapper 
{
    /**
     * 查询渔业船舶技术经济资源信息共享系统
     * 
     * @param id 渔业船舶技术经济资源信息共享系统主键
     * @return 渔业船舶技术经济资源信息共享系统
     */
    public ShippingSystem selectShippingSystemById(Long id);

    /**
     * 查询渔业船舶技术经济资源信息共享系统列表
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 渔业船舶技术经济资源信息共享系统集合
     */
    public List<ShippingSystem> selectShippingSystemList(ShippingSystem shippingSystem);


    public List<ShippingSystem> selectShippingSystemListByUserLevel(ShippingSystem shippingSystem);


    /**
     * 新增渔业船舶技术经济资源信息共享系统
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 结果
     */
    public int insertShippingSystem(ShippingSystem shippingSystem);

    /**
     * 修改渔业船舶技术经济资源信息共享系统
     * 
     * @param shippingSystem 渔业船舶技术经济资源信息共享系统
     * @return 结果
     */
    public int updateShippingSystem(ShippingSystem shippingSystem);

    /**
     * 删除渔业船舶技术经济资源信息共享系统
     * 
     * @param id 渔业船舶技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteShippingSystemById(Long id);

    /**
     * 批量删除渔业船舶技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShippingSystemByIds(Long[] ids);
}
