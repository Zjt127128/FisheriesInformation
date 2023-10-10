package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.MudflatInformation;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
public interface MudflatInformationMapper 
{
    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统信息主键
     * @return 海底滩涂增养殖技术经济资源信息共享系统信息
     */
    public MudflatInformation selectMudflatInformationById(Long id);

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统信息列表
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 海底滩涂增养殖技术经济资源信息共享系统信息集合
     */
    public List<MudflatInformation> selectMudflatInformationList(MudflatInformation mudflatInformation);

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int insertMudflatInformation(MudflatInformation mudflatInformation);

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param mudflatInformation 海底滩涂增养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int updateMudflatInformation(MudflatInformation mudflatInformation);

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param id 海底滩涂增养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    public int deleteMudflatInformationById(Long id);

    /**
     * 批量删除海底滩涂增养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMudflatInformationByIds(Long[] ids);
}
