package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WangxiangyumiaoMapper;
import com.ruoyi.system.domain.Wangxiangyumiao;
import com.ruoyi.system.service.IWangxiangyumiaoService;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统
Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class WangxiangyumiaoServiceImpl implements IWangxiangyumiaoService 
{
    @Autowired
    private WangxiangyumiaoMapper wangxiangyumiaoMapper;

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统
主键
     * @return 网箱育苗、养殖技术经济资源信息共享系统

     */
    @Override
    public Wangxiangyumiao selectWangxiangyumiaoById(Long id)
    {
        return wangxiangyumiaoMapper.selectWangxiangyumiaoById(id);
    }

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统
列表
     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 网箱育苗、养殖技术经济资源信息共享系统

     */
    @Override
    public List<Wangxiangyumiao> selectWangxiangyumiaoList(Wangxiangyumiao wangxiangyumiao)
    {
        return wangxiangyumiaoMapper.selectWangxiangyumiaoList(wangxiangyumiao);
    }

    @Override
    public List<Wangxiangyumiao> selectWangxiangyumiaoListByUserLevel(Wangxiangyumiao wangxiangyumiao) {
        return wangxiangyumiaoMapper.selectWangxiangyumiaoListByUserLevel(wangxiangyumiao);
    }

    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 结果
     */
    @Override
    public int insertWangxiangyumiao(Wangxiangyumiao wangxiangyumiao)
    {
        wangxiangyumiao.setCreateTime(DateUtils.getNowDate());
        return wangxiangyumiaoMapper.insertWangxiangyumiao(wangxiangyumiao);
    }

    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 结果
     */
    @Override
    public int updateWangxiangyumiao(Wangxiangyumiao wangxiangyumiao)
    {
        wangxiangyumiao.setUpdateTime(DateUtils.getNowDate());
        return wangxiangyumiaoMapper.updateWangxiangyumiao(wangxiangyumiao);
    }

    /**
     * 批量删除网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param ids 需要删除的网箱育苗、养殖技术经济资源信息共享系统
主键
     * @return 结果
     */
    @Override
    public int deleteWangxiangyumiaoByIds(Long[] ids)
    {
        return wangxiangyumiaoMapper.deleteWangxiangyumiaoByIds(ids);
    }

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统
信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统
主键
     * @return 结果
     */
    @Override
    public int deleteWangxiangyumiaoById(Long id)
    {
        return wangxiangyumiaoMapper.deleteWangxiangyumiaoById(id);
    }
}
