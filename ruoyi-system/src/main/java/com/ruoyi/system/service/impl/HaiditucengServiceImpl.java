package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.HaiditucengMapper;
import com.ruoyi.system.domain.Haidituceng;
import com.ruoyi.system.service.IHaiditucengService;

/**
 *  海底滩涂增养殖技术经济资源信息共享系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@Service
public class HaiditucengServiceImpl implements IHaiditucengService 
{
    @Autowired
    private HaiditucengMapper haiditucengMapper;

    /**
     * 查询 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id  海底滩涂增养殖技术经济资源信息共享系统主键
     * @return  海底滩涂增养殖技术经济资源信息共享系统
     */
    @Override
    public Haidituceng selectHaiditucengById(Long id)
    {
        return haiditucengMapper.selectHaiditucengById(id);
    }

    /**
     * 查询 海底滩涂增养殖技术经济资源信息共享系统列表
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return  海底滩涂增养殖技术经济资源信息共享系统
     */
    @Override
    public List<Haidituceng> selectHaiditucengList(Haidituceng haidituceng)
    {
        return haiditucengMapper.selectHaiditucengList(haidituceng);
    }

    @Override
    public List<Haidituceng> selectHaiditucengListByUserLevel(Haidituceng haidituceng) {
        return haiditucengMapper.selectHaiditucengListByUserLevel(haidituceng);
    }

    /**
     * 新增 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int insertHaidituceng(Haidituceng haidituceng)
    {
        haidituceng.setCreateTime(DateUtils.getNowDate());
        return haiditucengMapper.insertHaidituceng(haidituceng);
    }

    /**
     * 修改 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    @Override
    public int updateHaidituceng(Haidituceng haidituceng)
    {
        haidituceng.setUpdateTime(DateUtils.getNowDate());
        return haiditucengMapper.updateHaidituceng(haidituceng);
    }

    /**
     * 批量删除 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的 海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteHaiditucengByIds(Long[] ids)
    {
        return haiditucengMapper.deleteHaiditucengByIds(ids);
    }

    /**
     * 删除 海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param id  海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    @Override
    public int deleteHaiditucengById(Long id)
    {
        return haiditucengMapper.deleteHaiditucengById(id);
    }
}
