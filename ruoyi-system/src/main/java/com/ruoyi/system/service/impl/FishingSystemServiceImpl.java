package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FishingSystemMapper;
import com.ruoyi.system.domain.FishingSystem;
import com.ruoyi.system.service.IFishingSystemService;

/**
 * 捕捞技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class FishingSystemServiceImpl implements IFishingSystemService 
{
    @Autowired
    private FishingSystemMapper fishingSystemMapper;

    /**
     * 查询捕捞技术经济资源信息共享系统
     * 
     * @param id 捕捞技术经济资源信息共享系统主键
     * @return 捕捞技术经济资源信息共享系统
     */
    @Override
    public FishingSystem selectFishingSystemById(Long id)
    {
        return fishingSystemMapper.selectFishingSystemById(id);
    }

    /**
     * 查询捕捞技术经济资源信息共享系统列表
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 捕捞技术经济资源信息共享系统
     */
    @Override
    public List<FishingSystem> selectFishingSystemList(FishingSystem fishingSystem)
    {
        return fishingSystemMapper.selectFishingSystemList(fishingSystem);
    }

    @Override
    public List<FishingSystem> selectFishingSystemListByUserLevel(FishingSystem fishingSystem) {
        return fishingSystemMapper.selectFishingSystemListByUserLevel(fishingSystem);
    }

    /**
     * 新增捕捞技术经济资源信息共享系统
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertFishingSystem(FishingSystem fishingSystem)
    {
        fishingSystem.setCreateTime(DateUtils.getNowDate());
        return fishingSystemMapper.insertFishingSystem(fishingSystem);
    }

    /**
     * 修改捕捞技术经济资源信息共享系统
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateFishingSystem(FishingSystem fishingSystem)
    {
        fishingSystem.setUpdateTime(DateUtils.getNowDate());
        return fishingSystemMapper.updateFishingSystem(fishingSystem);
    }

    /**
     * 批量删除捕捞技术经济资源信息共享系统
     * 
     * @param ids 需要删除的捕捞技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteFishingSystemByIds(Long[] ids)
    {
        return fishingSystemMapper.deleteFishingSystemByIds(ids);
    }

    /**
     * 删除捕捞技术经济资源信息共享系统信息
     * 
     * @param id 捕捞技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteFishingSystemById(Long id)
    {
        return fishingSystemMapper.deleteFishingSystemById(id);
    }
}
