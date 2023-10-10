package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GongchangyumiaoMapper;
import com.ruoyi.system.domain.Gongchangyumiao;
import com.ruoyi.system.service.IGongchangyumiaoService;

/**
 * 工厂化育苗、养殖技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class GongchangyumiaoServiceImpl implements IGongchangyumiaoService 
{
    @Autowired
    private GongchangyumiaoMapper gongchangyumiaoMapper;

    /**
     * 查询工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息共享系统主键
     * @return 工厂化育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public Gongchangyumiao selectGongchangyumiaoById(Long id)
    {
        return gongchangyumiaoMapper.selectGongchangyumiaoById(id);
    }

    /**
     * 查询工厂化育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 工厂化育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public List<Gongchangyumiao> selectGongchangyumiaoList(Gongchangyumiao gongchangyumiao)
    {
        return gongchangyumiaoMapper.selectGongchangyumiaoList(gongchangyumiao);
    }

    @Override
    public List<Gongchangyumiao> selectGongchangyumiaoListByUserLevel(Gongchangyumiao gongchangyumiao) {
        return gongchangyumiaoMapper.selectGongchangyumiaoListByUserLevel(gongchangyumiao);
    }

    /**
     * 新增工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertGongchangyumiao(Gongchangyumiao gongchangyumiao)
    {
        gongchangyumiao.setCreateTime(DateUtils.getNowDate());
        return gongchangyumiaoMapper.insertGongchangyumiao(gongchangyumiao);
    }

    /**
     * 修改工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateGongchangyumiao(Gongchangyumiao gongchangyumiao)
    {
        gongchangyumiao.setUpdateTime(DateUtils.getNowDate());
        return gongchangyumiaoMapper.updateGongchangyumiao(gongchangyumiao);
    }

    /**
     * 批量删除工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的工厂化育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteGongchangyumiaoByIds(Long[] ids)
    {
        return gongchangyumiaoMapper.deleteGongchangyumiaoByIds(ids);
    }

    /**
     * 删除工厂化育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteGongchangyumiaoById(Long id)
    {
        return gongchangyumiaoMapper.deleteGongchangyumiaoById(id);
    }
}
