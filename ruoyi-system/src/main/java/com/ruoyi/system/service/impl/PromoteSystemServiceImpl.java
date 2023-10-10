package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PromoteSystemMapper;
import com.ruoyi.system.domain.PromoteSystem;
import com.ruoyi.system.service.IPromoteSystemService;

/**
 * 涉渔科技成果转化、推广共享系统Service业务层处理
 *
 * @author ruoyi
 * @date 2023-02-23
 */
@Service
public class PromoteSystemServiceImpl implements IPromoteSystemService
{
    @Autowired
    private PromoteSystemMapper promoteSystemMapper;

    /**
     * 查询涉渔科技成果转化、推广共享系统
     *
     * @param id 涉渔科技成果转化、推广共享系统主键
     * @return 涉渔科技成果转化、推广共享系统
     */
    @Override
    public PromoteSystem selectPromoteSystemById(Long id)
    {
        return promoteSystemMapper.selectPromoteSystemById(id);
    }

    /**
     * 查询涉渔科技成果转化、推广共享系统列表
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 涉渔科技成果转化、推广共享系统
     */
    @Override
    public List<PromoteSystem> selectPromoteSystemList(PromoteSystem promoteSystem)
    {
        return promoteSystemMapper.selectPromoteSystemList(promoteSystem);
    }

    @Override
    public List<PromoteSystem> selectPromoteSystemListByUserLevel(PromoteSystem promoteSystem) {
        return promoteSystemMapper.selectPromoteSystemListByUserLevel(promoteSystem);
    }

    /**
     * 新增涉渔科技成果转化、推广共享系统
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 结果
     */
    @Override
    public int insertPromoteSystem(PromoteSystem promoteSystem)
    {
        promoteSystem.setCreateTime(DateUtils.getNowDate());
        return promoteSystemMapper.insertPromoteSystem(promoteSystem);
    }

    /**
     * 修改涉渔科技成果转化、推广共享系统
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 结果
     */
    @Override
    public int updatePromoteSystem(PromoteSystem promoteSystem)
    {
        promoteSystem.setUpdateTime(DateUtils.getNowDate());
        return promoteSystemMapper.updatePromoteSystem(promoteSystem);
    }

    /**
     * 批量删除涉渔科技成果转化、推广共享系统
     *
     * @param ids 需要删除的涉渔科技成果转化、推广共享系统主键
     * @return 结果
     */
    @Override
    public int deletePromoteSystemByIds(Long[] ids)
    {
        return promoteSystemMapper.deletePromoteSystemByIds(ids);
    }

    /**
     * 删除涉渔科技成果转化、推广共享系统信息
     *
     * @param id 涉渔科技成果转化、推广共享系统主键
     * @return 结果
     */
    @Override
    public int deletePromoteSystemById(Long id)
    {
        return promoteSystemMapper.deletePromoteSystemById(id);
    }
}
