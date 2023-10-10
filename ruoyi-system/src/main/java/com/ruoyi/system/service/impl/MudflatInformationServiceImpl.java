package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MudflatInformationMapper;
import com.ruoyi.system.domain.MudflatInformation;
import com.ruoyi.system.service.IMudflatInformationService;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@Service
public class MudflatInformationServiceImpl implements IMudflatInformationService 
{
    @Autowired
    private MudflatInformationMapper mudflatInformationMapper;

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统信息主键
     * @return 海底滩涂增养殖技术经济资源信息共享系统信息
     */
    @Override
    public MudflatInformation selectMudflatInformationById(Long id)
    {
        return mudflatInformationMapper.selectMudflatInformationById(id);
    }

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统信息列表
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 海底滩涂增养殖技术经济资源信息共享系统信息
     */
    @Override
    public List<MudflatInformation> selectMudflatInformationList(MudflatInformation mudflatInformation)
    {
        return mudflatInformationMapper.selectMudflatInformationList(mudflatInformation);
    }

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int insertMudflatInformation(MudflatInformation mudflatInformation)
    {
        return mudflatInformationMapper.insertMudflatInformation(mudflatInformation);
    }

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    @Override
    public int updateMudflatInformation(MudflatInformation mudflatInformation)
    {
        return mudflatInformationMapper.updateMudflatInformation(mudflatInformation);
    }

    /**
     * 批量删除海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的海底滩涂增养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteMudflatInformationByIds(Long[] ids)
    {
        return mudflatInformationMapper.deleteMudflatInformationByIds(ids);
    }

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统信息信息
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    @Override
    public int deleteMudflatInformationById(Long id)
    {
        return mudflatInformationMapper.deleteMudflatInformationById(id);
    }
}
