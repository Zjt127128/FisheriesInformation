package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.EvaluationSystem;

/**
 * 渔业资源资产价值评估系统Service接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface IEvaluationSystemService 
{
    /**
     * 查询渔业资源资产价值评估系统
     * 
     * @param id 渔业资源资产价值评估系统主键
     * @return 渔业资源资产价值评估系统
     */
    public EvaluationSystem selectEvaluationSystemById(Long id);

    /**
     * 查询渔业资源资产价值评估系统列表
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 渔业资源资产价值评估系统集合
     */
    public List<EvaluationSystem> selectEvaluationSystemList(EvaluationSystem evaluationSystem);


    public List<EvaluationSystem> selectEvaluationSystemListByUserLevel(EvaluationSystem evaluationSystem);


    /**
     * 新增渔业资源资产价值评估系统
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 结果
     */
    public int insertEvaluationSystem(EvaluationSystem evaluationSystem);

    /**
     * 修改渔业资源资产价值评估系统
     * 
     * @param evaluationSystem 渔业资源资产价值评估系统
     * @return 结果
     */
    public int updateEvaluationSystem(EvaluationSystem evaluationSystem);

    /**
     * 批量删除渔业资源资产价值评估系统
     * 
     * @param ids 需要删除的渔业资源资产价值评估系统主键集合
     * @return 结果
     */
    public int deleteEvaluationSystemByIds(Long[] ids);

    /**
     * 删除渔业资源资产价值评估系统信息
     * 
     * @param id 渔业资源资产价值评估系统主键
     * @return 结果
     */
    public int deleteEvaluationSystemById(Long id);
}
