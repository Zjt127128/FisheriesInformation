package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.PromoteSystem;

/**
 * 涉渔科技成果转化、推广共享系统Mapper接口
 *
 * @author ruoyi
 * @date 2023-02-23
 */
public interface PromoteSystemMapper
{
    /**
     * 查询涉渔科技成果转化、推广共享系统
     *
     * @param id 涉渔科技成果转化、推广共享系统主键
     * @return 涉渔科技成果转化、推广共享系统
     */
    public PromoteSystem selectPromoteSystemById(Long id);

    /**
     * 查询涉渔科技成果转化、推广共享系统列表
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 涉渔科技成果转化、推广共享系统集合
     */
    public List<PromoteSystem> selectPromoteSystemList(PromoteSystem promoteSystem);




    public List<PromoteSystem> selectPromoteSystemListByUserLevel(PromoteSystem promoteSystem);


    /**
     * 新增涉渔科技成果转化、推广共享系统
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 结果
     */
    public int insertPromoteSystem(PromoteSystem promoteSystem);

    /**
     * 修改涉渔科技成果转化、推广共享系统
     *
     * @param promoteSystem 涉渔科技成果转化、推广共享系统
     * @return 结果
     */
    public int updatePromoteSystem(PromoteSystem promoteSystem);

    /**
     * 删除涉渔科技成果转化、推广共享系统
     *
     * @param id 涉渔科技成果转化、推广共享系统主键
     * @return 结果
     */
    public int deletePromoteSystemById(Long id);

    /**
     * 批量删除涉渔科技成果转化、推广共享系统
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePromoteSystemByIds(Long[] ids);
}
