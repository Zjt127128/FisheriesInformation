package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Wangxiangyumiao;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统
Service接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface IWangxiangyumiaoService 
{
    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统
主键
     * @return 网箱育苗、养殖技术经济资源信息共享系统

     */
    public Wangxiangyumiao selectWangxiangyumiaoById(Long id);

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统
列表
     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 网箱育苗、养殖技术经济资源信息共享系统
集合
     */
    public List<Wangxiangyumiao> selectWangxiangyumiaoList(Wangxiangyumiao wangxiangyumiao);


    List<Wangxiangyumiao> selectWangxiangyumiaoListByUserLevel(Wangxiangyumiao wangxiangyumiao);


    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 结果
     */
    public int insertWangxiangyumiao(Wangxiangyumiao wangxiangyumiao);

    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param wangxiangyumiao 网箱育苗、养殖技术经济资源信息共享系统

     * @return 结果
     */
    public int updateWangxiangyumiao(Wangxiangyumiao wangxiangyumiao);

    /**
     * 批量删除网箱育苗、养殖技术经济资源信息共享系统

     * 
     * @param ids 需要删除的网箱育苗、养殖技术经济资源信息共享系统
主键集合
     * @return 结果
     */
    public int deleteWangxiangyumiaoByIds(Long[] ids);

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统
信息
     * 
     * @param id 网箱育苗、养殖技术经济资源信息共享系统
主键
     * @return 结果
     */
    public int deleteWangxiangyumiaoById(Long id);
}
