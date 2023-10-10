package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Gongchangyumiao;

/**
 * 工厂化育苗、养殖技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface GongchangyumiaoMapper 
{
    /**
     * 查询工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息共享系统主键
     * @return 工厂化育苗、养殖技术经济资源信息共享系统
     */
    public Gongchangyumiao selectGongchangyumiaoById(Long id);

    /**
     * 查询工厂化育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 工厂化育苗、养殖技术经济资源信息共享系统集合
     */
    public List<Gongchangyumiao> selectGongchangyumiaoList(Gongchangyumiao gongchangyumiao);



    public List<Gongchangyumiao> selectGongchangyumiaoListByUserLevel(Gongchangyumiao gongchangyumiao);


    /**
     * 新增工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int insertGongchangyumiao(Gongchangyumiao gongchangyumiao);

    /**
     * 修改工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param gongchangyumiao 工厂化育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int updateGongchangyumiao(Gongchangyumiao gongchangyumiao);

    /**
     * 删除工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 工厂化育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteGongchangyumiaoById(Long id);

    /**
     * 批量删除工厂化育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGongchangyumiaoByIds(Long[] ids);
}
