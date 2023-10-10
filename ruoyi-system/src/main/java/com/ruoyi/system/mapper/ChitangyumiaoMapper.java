package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Chitangyumiao;

/**
 * 池塘育苗、养殖技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface ChitangyumiaoMapper 
{
    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统主键
     * @return 池塘育苗、养殖技术经济资源信息共享系统
     */
    public Chitangyumiao selectChitangyumiaoById(Long id);

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 池塘育苗、养殖技术经济资源信息共享系统集合
     */
    public List<Chitangyumiao> selectChitangyumiaoList(Chitangyumiao chitangyumiao);





    List<Chitangyumiao> selectChitangyumiaoListByUserLevel(Chitangyumiao chitangyumiao);
    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int insertChitangyumiao(Chitangyumiao chitangyumiao);

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param chitangyumiao 池塘育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int updateChitangyumiao(Chitangyumiao chitangyumiao);

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 池塘育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteChitangyumiaoById(Long id);

    /**
     * 批量删除池塘育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteChitangyumiaoByIds(Long[] ids);
}
