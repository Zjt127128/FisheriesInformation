package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ChitangyumiaoMapper;
import com.ruoyi.system.domain.Chitangyumiao;
import com.ruoyi.system.service.IChitangyumiaoService;

/**
 * 池塘育苗、养殖技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class ChitangyumiaoServiceImpl implements IChitangyumiaoService 
{
    @Autowired
    private ChitangyumiaoMapper chitangyumiaoMapper;

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统主键
     * @return 池塘育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public Chitangyumiao selectChitangyumiaoById(Long id)
    {
        return chitangyumiaoMapper.selectChitangyumiaoById(id);
    }

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 池塘育苗、养殖技术经济资源信息共享系统
     */
    @Override
    public List<Chitangyumiao> selectChitangyumiaoList(Chitangyumiao chitangyumiao)
    {
        return chitangyumiaoMapper.selectChitangyumiaoList(chitangyumiao);
    }

    @Override
    public List<Chitangyumiao> selectChitangyumiaoListByUserLevel(Chitangyumiao chitangyumiao) {


        return chitangyumiaoMapper.selectChitangyumiaoListByUserLevel(chitangyumiao);
    }

    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertChitangyumiao(Chitangyumiao chitangyumiao)
    {
        chitangyumiao.setCreateTime(DateUtils.getNowDate());
        return chitangyumiaoMapper.insertChitangyumiao(chitangyumiao);
    }

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateChitangyumiao(Chitangyumiao chitangyumiao)
    {
        chitangyumiao.setUpdateTime(DateUtils.getNowDate());
        return chitangyumiaoMapper.updateChitangyumiao(chitangyumiao);
    }

    /**
     * 批量删除池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的池塘育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteChitangyumiaoByIds(Long[] ids)
    {
        return chitangyumiaoMapper.deleteChitangyumiaoByIds(ids);
    }

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteChitangyumiaoById(Long id)
    {
        return chitangyumiaoMapper.deleteChitangyumiaoById(id);
    }
}
