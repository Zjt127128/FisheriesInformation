package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProductionSystemMapper;
import com.ruoyi.system.domain.ProductionSystem;
import com.ruoyi.system.service.IProductionSystemService;

/**
 * 渔业生产、事故在线技术咨询、服务系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class ProductionSystemServiceImpl implements IProductionSystemService 
{
    @Autowired
    private ProductionSystemMapper productionSystemMapper;

    /**
     * 查询渔业生产、事故在线技术咨询、服务系统
     * 
     * @param id 渔业生产、事故在线技术咨询、服务系统主键
     * @return 渔业生产、事故在线技术咨询、服务系统
     */
    @Override
    public ProductionSystem selectProductionSystemById(Long id)
    {
        return productionSystemMapper.selectProductionSystemById(id);
    }

    /**
     * 查询渔业生产、事故在线技术咨询、服务系统列表
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 渔业生产、事故在线技术咨询、服务系统
     */
    @Override
    public List<ProductionSystem> selectProductionSystemList(ProductionSystem productionSystem)
    {
        return productionSystemMapper.selectProductionSystemList(productionSystem);
    }

    @Override
    public List<ProductionSystem> selectProductionSystemListByUserLevel(ProductionSystem productionSystem) {
        return productionSystemMapper.selectProductionSystemListByUserLevel(productionSystem);
    }

    /**
     * 新增渔业生产、事故在线技术咨询、服务系统
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 结果
     */
    @Override
    public int insertProductionSystem(ProductionSystem productionSystem)
    {
        productionSystem.setCreateTime(DateUtils.getNowDate());
        return productionSystemMapper.insertProductionSystem(productionSystem);
    }

    /**
     * 修改渔业生产、事故在线技术咨询、服务系统
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 结果
     */
    @Override
    public int updateProductionSystem(ProductionSystem productionSystem)
    {
        productionSystem.setUpdateTime(DateUtils.getNowDate());
        return productionSystemMapper.updateProductionSystem(productionSystem);
    }

    /**
     * 批量删除渔业生产、事故在线技术咨询、服务系统
     * 
     * @param ids 需要删除的渔业生产、事故在线技术咨询、服务系统主键
     * @return 结果
     */
    @Override
    public int deleteProductionSystemByIds(Long[] ids)
    {
        return productionSystemMapper.deleteProductionSystemByIds(ids);
    }

    /**
     * 删除渔业生产、事故在线技术咨询、服务系统信息
     * 
     * @param id 渔业生产、事故在线技术咨询、服务系统主键
     * @return 结果
     */
    @Override
    public int deleteProductionSystemById(Long id)
    {
        return productionSystemMapper.deleteProductionSystemById(id);
    }
}
