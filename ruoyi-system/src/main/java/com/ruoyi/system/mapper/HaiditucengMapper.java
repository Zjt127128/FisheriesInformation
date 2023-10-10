package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Haidituceng;

/**
 *  海底滩涂增养殖技术经济资源信息共享系统Mapper接口
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
public interface HaiditucengMapper 
{
    /**
     * 查询 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id  海底滩涂增养殖技术经济资源信息共享系统主键
     * @return  海底滩涂增养殖技术经济资源信息共享系统
     */
    public Haidituceng selectHaiditucengById(Long id);

    /**
     * 查询 海底滩涂增养殖技术经济资源信息共享系统列表
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return  海底滩涂增养殖技术经济资源信息共享系统集合
     */
    public List<Haidituceng> selectHaiditucengList(Haidituceng haidituceng);



    public List<Haidituceng> selectHaiditucengListByUserLevel(Haidituceng haidituceng);

    /**
     * 新增 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int insertHaidituceng(Haidituceng haidituceng);

    /**
     * 修改 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param haidituceng  海底滩涂增养殖技术经济资源信息共享系统
     * @return 结果
     */
    public int updateHaidituceng(Haidituceng haidituceng);

    /**
     * 删除 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param id  海底滩涂增养殖技术经济资源信息共享系统主键
     * @return 结果
     */
    public int deleteHaiditucengById(Long id);

    /**
     * 批量删除 海底滩涂增养殖技术经济资源信息共享系统
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteHaiditucengByIds(Long[] ids);
}
