package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ReservoirSystem;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface ReservoirSystemMapper 
{
    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 海底滩涂增养殖技术经济资源信息共享系统
     */
    public ReservoirSystem selectReservoirSystemById(Long id);

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统列表
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 海底滩涂增养殖技术经济资源信息共享系统集合
     */
    public List<ReservoirSystem> selectReservoirSystemList(ReservoirSystem reservoirSystem);




      List<ReservoirSystem> selectReservoirSystemListByUserLevel(ReservoirSystem reservoirSystem);

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int insertReservoirSystem(ReservoirSystem reservoirSystem);

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int updateReservoirSystem(ReservoirSystem reservoirSystem);

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteReservoirSystemById(Long id);

    /**
     * 批量删除海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReservoirSystemByIds(Long[] ids);
}
