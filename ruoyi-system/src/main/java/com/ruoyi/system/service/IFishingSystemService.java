package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.FishingSystem;

/**
 * 捕捞技术经济资源信息共享系统Service接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface IFishingSystemService 
{
    /**
     * 查询捕捞技术经济资源信息共享系统
     * 
     * @param id 捕捞技术经济资源信息共享系统主键
     * @return 捕捞技术经济资源信息共享系统
     */
    public FishingSystem selectFishingSystemById(Long id);

    /**
     * 查询捕捞技术经济资源信息共享系统列表
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 捕捞技术经济资源信息共享系统集合
     */
    public List<FishingSystem> selectFishingSystemList(FishingSystem fishingSystem);


    List<FishingSystem> selectFishingSystemListByUserLevel(FishingSystem fishingSystem);


    /**
     * 新增捕捞技术经济资源信息共享系统
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 结果
     */
    public int insertFishingSystem(FishingSystem fishingSystem);

    /**
     * 修改捕捞技术经济资源信息共享系统
     * 
     * @param fishingSystem 捕捞技术经济资源信息共享系统
     * @return 结果
     */
    public int updateFishingSystem(FishingSystem fishingSystem);

    /**
     * 批量删除捕捞技术经济资源信息共享系统
     * 
     * @param ids 需要删除的捕捞技术经济资源信息共享系统主键集合
     * @return 结果
     */
    public int deleteFishingSystemByIds(Long[] ids);

    /**
     * 删除捕捞技术经济资源信息共享系统信息
     * 
     * @param id 捕捞技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteFishingSystemById(Long id);
}
