package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OwnerSystemMapper;
import com.ruoyi.system.domain.OwnerSystem;
import com.ruoyi.system.service.IOwnerSystemService;

/**
 * 业主、专家、涉渔机构、在线交流共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class OwnerSystemServiceImpl implements IOwnerSystemService 
{
    @Autowired
    private OwnerSystemMapper ownerSystemMapper;

    /**
     * 查询业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param id 业主、专家、涉渔机构、在线交流共享系统主键
     * @return 业主、专家、涉渔机构、在线交流共享系统
     */
    @Override
    public OwnerSystem selectOwnerSystemById(Long id)
    {
        return ownerSystemMapper.selectOwnerSystemById(id);
    }

    /**
     * 查询业主、专家、涉渔机构、在线交流共享系统列表
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 业主、专家、涉渔机构、在线交流共享系统
     */
    @Override
    public List<OwnerSystem> selectOwnerSystemList(OwnerSystem ownerSystem)
    {
        return ownerSystemMapper.selectOwnerSystemList(ownerSystem);
    }

    @Override
    public List<OwnerSystem> selectOwnerSystemListByUserLevel(OwnerSystem ownerSystem) {
        return ownerSystemMapper.selectOwnerSystemListByUserLevel(ownerSystem);
    }

    /**
     * 新增业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 结果
     */
    @Override
    public int insertOwnerSystem(OwnerSystem ownerSystem)
    {
        ownerSystem.setCreateTime(DateUtils.getNowDate());
        return ownerSystemMapper.insertOwnerSystem(ownerSystem);
    }

    /**
     * 修改业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ownerSystem 业主、专家、涉渔机构、在线交流共享系统
     * @return 结果
     */
    @Override
    public int updateOwnerSystem(OwnerSystem ownerSystem)
    {
        ownerSystem.setUpdateTime(DateUtils.getNowDate());
        return ownerSystemMapper.updateOwnerSystem(ownerSystem);
    }

    /**
     * 批量删除业主、专家、涉渔机构、在线交流共享系统
     * 
     * @param ids 需要删除的业主、专家、涉渔机构、在线交流共享系统主键
     * @return 结果
     */
    @Override
    public int deleteOwnerSystemByIds(Long[] ids)
    {
        return ownerSystemMapper.deleteOwnerSystemByIds(ids);
    }

    /**
     * 删除业主、专家、涉渔机构、在线交流共享系统信息
     * 
     * @param id 业主、专家、涉渔机构、在线交流共享系统主键
     * @return 结果
     */
    @Override
    public int deleteOwnerSystemById(Long id)
    {
        return ownerSystemMapper.deleteOwnerSystemById(id);
    }
}
