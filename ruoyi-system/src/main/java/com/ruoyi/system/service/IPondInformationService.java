package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.PondInformation;

/**
 * 池塘育苗、养殖技术经济资源信息共享系统信息Service接口
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
public interface IPondInformationService 
{
    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统信息主键
     * @return 池塘育苗、养殖技术经济资源信息共享系统信息
     */
    public PondInformation selectPondInformationById(Long id);

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统信息列表
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 池塘育苗、养殖技术经济资源信息共享系统信息集合
     */
    public List<PondInformation> selectPondInformationList(PondInformation pondInformation);

    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int insertPondInformation(PondInformation pondInformation);

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param pondInformation 池塘育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int updatePondInformation(PondInformation pondInformation);

    /**
     * 批量删除池塘育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的池塘育苗、养殖技术经济资源信息共享系统信息主键集合
     * @return 结果
     */
    public int deletePondInformationByIds(Long[] ids);

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统信息信息
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    public int deletePondInformationById(Long id);
}
