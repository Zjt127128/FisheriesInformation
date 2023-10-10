package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ReservoirSystemMapper;
import com.ruoyi.system.domain.ReservoirSystem;
import com.ruoyi.system.service.IReservoirSystemService;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class ReservoirSystemServiceImpl implements IReservoirSystemService 
{
    @Autowired
    private ReservoirSystemMapper reservoirSystemMapper;

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 海底滩涂增养殖技术经济资源信息共享系统
     */
    @Override
    public ReservoirSystem selectReservoirSystemById(Long id)
    {
        return reservoirSystemMapper.selectReservoirSystemById(id);
    }

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统列表
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 海底滩涂增养殖技术经济资源信息共享系统
     */
    @Override
    public List<ReservoirSystem> selectReservoirSystemList(ReservoirSystem reservoirSystem)
    {
        return reservoirSystemMapper.selectReservoirSystemList(reservoirSystem);
    }

    @Override
    public List<ReservoirSystem> selectReservoirSystemListByUserLevel(ReservoirSystem reservoirSystem) {
        return reservoirSystemMapper.selectReservoirSystemListByUserLevel(reservoirSystem);
    }

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertReservoirSystem(ReservoirSystem reservoirSystem)
    {
        reservoirSystem.setCreateTime(DateUtils.getNowDate());
        return reservoirSystemMapper.insertReservoirSystem(reservoirSystem);
    }

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param reservoirSystem 海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateReservoirSystem(ReservoirSystem reservoirSystem)
    {
        reservoirSystem.setUpdateTime(DateUtils.getNowDate());
        return reservoirSystemMapper.updateReservoirSystem(reservoirSystem);
    }

    /**
     * 批量删除海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteReservoirSystemByIds(Long[] ids)
    {
        return reservoirSystemMapper.deleteReservoirSystemByIds(ids);
    }

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteReservoirSystemById(Long id)
    {
        return reservoirSystemMapper.deleteReservoirSystemById(id);
    }
}
