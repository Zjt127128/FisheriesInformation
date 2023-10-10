package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OwnerSystem;

/**
 * 业主、专家、涉渔机构、在线交流共享系统Service接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface IOwnerSystemService 
{
    /**
     * 查询业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param id 业主、专家、涉渔机构、在线交流共享系统主键
     * @return 业主、专家、涉渔机构、在线交流共享系统
     */
    public OwnerSystem selectOwnerSystemById(Long id);

    /**
     * 查询业主、专家、涉渔机构、在线交流共享系统列表
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 业主、专家、涉渔机构、在线交流共享系统集合
     */
    public List<OwnerSystem> selectOwnerSystemList(OwnerSystem ownerSystem);

    public List<OwnerSystem> selectOwnerSystemListByUserLevel(OwnerSystem ownerSystem);


    /**
     * 新增业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 结果
     */
    public int insertOwnerSystem(OwnerSystem ownerSystem);

    /**
     * 修改业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 结果
     */
    public int updateOwnerSystem(OwnerSystem ownerSystem);

    /**
     * 批量删除业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ids 需要删除的业主、专家、涉渔机构、在线交流共享系统主键集合
     * @return 结果
     */
    public int deleteOwnerSystemByIds(Long[] ids);

    /**
     * 删除业主、专家、涉渔机构、在线交流共享系统信息
     * 
     * @param id 业主、专家、涉渔机构、在线交流共享系统主键
     * @return 结果
     */
    public int deleteOwnerSystemById(Long id);
}
