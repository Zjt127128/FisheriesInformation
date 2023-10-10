package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.NetboxInformation;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统信息Mapper接口
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
public interface NetboxInformationMapper 
{
    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统信息主键
     * @return 网箱育苗、养殖技术经济资源信息共享系统信息
     */
    public NetboxInformation selectNetboxInformationById(Long id);

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统信息列表
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 网箱育苗、养殖技术经济资源信息共享系统信息集合
     */
    public List<NetboxInformation> selectNetboxInformationList(NetboxInformation netboxInformation);

    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int insertNetboxInformation(NetboxInformation netboxInformation);

    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param netboxInformation 网箱育苗、养殖技术经济资源信息共享系统信息
     * @return 结果
     */
    public int updateNetboxInformation(NetboxInformation netboxInformation);

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统信息主键
     * @return 结果
     */
    public int deleteNetboxInformationById(Long id);

    /**
     * 批量删除网箱育苗、养殖技术经济资源信息共享系统信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNetboxInformationByIds(Long[] ids);
}
