package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TezhongyumiaoMapper;
import com.ruoyi.system.domain.Tezhongyumiao;
import com.ruoyi.system.service.ITezhongyumiaoService;

/**
 * 特种育苗、养殖技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class TezhongyumiaoServiceImpl implements ITezhongyumiaoService 
{
    @Autowired
    private TezhongyumiaoMapper tezhongyumiaoMapper;

    /**
     * 查询特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 特种育苗、养殖技术经济资源信息共享系统主键
     * @return 特种育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public Tezhongyumiao selectTezhongyumiaoById(Long id)
    {
        return tezhongyumiaoMapper.selectTezhongyumiaoById(id);
    }

    /**
     * 查询特种育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 特种育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public List<Tezhongyumiao> selectTezhongyumiaoList(Tezhongyumiao tezhongyumiao)
    {
        return tezhongyumiaoMapper.selectTezhongyumiaoList(tezhongyumiao);
    }

    @Override
    public List<Tezhongyumiao> selectTezhongyumiaoListByUserLevel(Tezhongyumiao tezhongyumiao) {
        return tezhongyumiaoMapper.selectTezhongyumiaoListByUserLevel(tezhongyumiao);
    }

    /**
     * 新增特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertTezhongyumiao(Tezhongyumiao tezhongyumiao)
    {
        tezhongyumiao.setCreateTime(DateUtils.getNowDate());
        return tezhongyumiaoMapper.insertTezhongyumiao(tezhongyumiao);
    }

    /**
     * 修改特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateTezhongyumiao(Tezhongyumiao tezhongyumiao)
    {
        tezhongyumiao.setUpdateTime(DateUtils.getNowDate());
        return tezhongyumiaoMapper.updateTezhongyumiao(tezhongyumiao);
    }

    /**
     * 批量删除特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的特种育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteTezhongyumiaoByIds(Long[] ids)
    {
        return tezhongyumiaoMapper.deleteTezhongyumiaoByIds(ids);
    }

    /**
     * 删除特种育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 特种育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteTezhongyumiaoById(Long id)
    {
        return tezhongyumiaoMapper.deleteTezhongyumiaoById(id);
    }
}
