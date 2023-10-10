package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.EvaluationSystemMapper;
import com.ruoyi.system.domain.EvaluationSystem;
import com.ruoyi.system.service.IEvaluationSystemService;

/**
 * 渔业资源资产价值评估系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class EvaluationSystemServiceImpl implements IEvaluationSystemService 
{
    @Autowired
    private EvaluationSystemMapper evaluationSystemMapper;

    /**
     * 查询渔业资源资产价值评估系统
     * 
     * @param id 渔业资源资产价值评估系统主键
     * @return 渔业资源资产价值评估系统
     */
    @Override
    public EvaluationSystem selectEvaluationSystemById(Long id)
    {
        return evaluationSystemMapper.selectEvaluationSystemById(id);
    }

    /**
     * 查询渔业资源资产价值评估系统列表
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 渔业资源资产价值评估系统
     */
    @Override
    public List<EvaluationSystem> selectEvaluationSystemList(EvaluationSystem evaluationSystem)
    {
        return evaluationSystemMapper.selectEvaluationSystemList(evaluationSystem);
    }

    @Override
    public List<EvaluationSystem> selectEvaluationSystemListByUserLevel(EvaluationSystem evaluationSystem) {
        return evaluationSystemMapper.selectEvaluationSystemListByUserLevel(evaluationSystem);

    }

    /**
     * 新增渔业资源资产价值评估系统
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 结果
     */
    @Override
    public int insertEvaluationSystem(EvaluationSystem evaluationSystem)
    {
        evaluationSystem.setCreateTime(DateUtils.getNowDate());
        return evaluationSystemMapper.insertEvaluationSystem(evaluationSystem);
    }

    /**
     * 修改渔业资源资产价值评估系统
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 结果
     */
    @Override
    public int updateEvaluationSystem(EvaluationSystem evaluationSystem)
    {
        evaluationSystem.setUpdateTime(DateUtils.getNowDate());
        return evaluationSystemMapper.updateEvaluationSystem(evaluationSystem);
    }

    /**
     * 批量删除渔业资源资产价值评估系统
     * 
     * @param ids 需要删除的渔业资源资产价值评估系统主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationSystemByIds(Long[] ids)
    {
        return evaluationSystemMapper.deleteEvaluationSystemByIds(ids);
    }

    /**
     * 删除渔业资源资产价值评估系统信息
     * 
     * @param id 渔业资源资产价值评估系统主键
     * @return 结果
     */
    @Override
    public int deleteEvaluationSystemById(Long id)
    {
        return evaluationSystemMapper.deleteEvaluationSystemById(id);
    }
}
