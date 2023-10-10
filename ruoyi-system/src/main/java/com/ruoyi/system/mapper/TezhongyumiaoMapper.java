package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Tezhongyumiao;

/**
 * 特种育苗、养殖技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface TezhongyumiaoMapper 
{
    /**
     * 查询特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 特种育苗、养殖技术经济资源信息共享系统主键
     * @return 特种育苗、养殖技术经济资源信息共享系统
     */
    public Tezhongyumiao selectTezhongyumiaoById(Long id);

    /**
     * 查询特种育苗、养殖技术经济资源信息共享系统列表
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 特种育苗、养殖技术经济资源信息共享系统集合
     */
    public List<Tezhongyumiao> selectTezhongyumiaoList(Tezhongyumiao tezhongyumiao);



    List<Tezhongyumiao> selectTezhongyumiaoListByUserLevel(Tezhongyumiao tezhongyumiao);

    /**
     * 新增特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int insertTezhongyumiao(Tezhongyumiao tezhongyumiao);

    /**
     * 修改特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param tezhongyumiao 特种育苗、养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int updateTezhongyumiao(Tezhongyumiao tezhongyumiao);

    /**
     * 删除特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param id 特种育苗、养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteTezhongyumiaoById(Long id);

    /**
     * 批量删除特种育苗、养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTezhongyumiaoByIds(Long[] ids);
}
