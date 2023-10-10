package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ReservoirInformation;

/**
 * 水库等大水面渔业技术经济资源信息共享系统信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
public interface ReservoirInformationMapper 
{
    /**
     * 查询水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param id 水库等大水面渔业技术经济资源信息共享系统信息主键
     * @return 水库等大水面渔业技术经济资源信息共享系统信息
     */
    public ReservoirInformation selectReservoirInformationById(Long id);

    /**
     * 查询水库等大水面渔业技术经济资源信息共享系统信息列表
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 水库等大水面渔业技术经济资源信息共享系统信息集合
     */
    public List<ReservoirInformation> selectReservoirInformationList(ReservoirInformation reservoirInformation);

    /**
     * 新增水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 结果
     */
    public int insertReservoirInformation(ReservoirInformation reservoirInformation);

    /**
     * 修改水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param reservoirInformation 水库等大水面渔业技术经济资源信息共享系统信息
     * @return 结果
     */
    public int updateReservoirInformation(ReservoirInformation reservoirInformation);

    /**
     * 删除水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param id 水库等大水面渔业技术经济资源信息共享系统信息主键
     * @return 结果
     */
    public int deleteReservoirInformationById(Long id);

    /**
     * 批量删除水库等大水面渔业技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReservoirInformationByIds(Long[] ids);
}
