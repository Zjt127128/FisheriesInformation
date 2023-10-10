package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ProductionSystem;

/**
 * 渔业生产、事故在线技术咨询、服务系统Service接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface IProductionSystemService 
{
    /**
     * 查询渔业生产、事故在线技术咨询、服务系统
     * 
     * @param id 渔业生产、事故在线技术咨询、服务系统主键
     * @return 渔业生产、事故在线技术咨询、服务系统
     */
    public ProductionSystem selectProductionSystemById(Long id);

    /**
     * 查询渔业生产、事故在线技术咨询、服务系统列表
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 渔业生产、事故在线技术咨询、服务系统集合
     */
    public List<ProductionSystem> selectProductionSystemList(ProductionSystem productionSystem);

    public List<ProductionSystem> selectProductionSystemListByUserLevel(ProductionSystem productionSystem);


    /**
     * 新增渔业生产、事故在线技术咨询、服务系统
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 结果
     */
    public int insertProductionSystem(ProductionSystem productionSystem);

    /**
     * 修改渔业生产、事故在线技术咨询、服务系统
     * 
     * @param productionSystem 渔业生产、事故在线技术咨询、服务系统
     * @return 结果
     */
    public int updateProductionSystem(ProductionSystem productionSystem);

    /**
     * 批量删除渔业生产、事故在线技术咨询、服务系统
     * 
     * @param ids 需要删除的渔业生产、事故在线技术咨询、服务系统主键集合
     * @return 结果
     */
    public int deleteProductionSystemByIds(Long[] ids);

    /**
     * 删除渔业生产、事故在线技术咨询、服务系统信息
     * 
     * @param id 渔业生产、事故在线技术咨询、服务系统主键
     * @return 结果
     */
    public int deleteProductionSystemById(Long id);
}
