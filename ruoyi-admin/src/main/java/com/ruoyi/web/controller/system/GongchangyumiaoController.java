package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Gongchangyumiao;
import com.ruoyi.system.service.IGongchangyumiaoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工厂化育苗、养殖技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/gongchangyumiao")
public class GongchangyumiaoController extends BaseController
{
    @Autowired
    private IGongchangyumiaoService gongchangyumiaoService;

    /**
     * 查询工厂化育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gongchangyumiao gongchangyumiao)
    {
        startPage();
        List<Gongchangyumiao> list = null;
        if (checkUserLevelZhuan()) {
         list=   gongchangyumiaoService.selectGongchangyumiaoList(gongchangyumiao);
        }else {
            gongchangyumiao.setUserId(getUserId());
            gongchangyumiao.setUserLevelNum(getLimitNum());
            list=gongchangyumiaoService.selectGongchangyumiaoListByUserLevel(gongchangyumiao);
        }


        return getDataTable(list);
    }

    /**
     * 导出工厂化育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:export')")
    @Log(title = "工厂化育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Gongchangyumiao gongchangyumiao)
    {
        List<Gongchangyumiao> list = gongchangyumiaoService.selectGongchangyumiaoList(gongchangyumiao);
        ExcelUtil<Gongchangyumiao> util = new ExcelUtil<Gongchangyumiao>(Gongchangyumiao.class);
        util.exportExcel(response, list, "工厂化育苗、养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取工厂化育苗、养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gongchangyumiaoService.selectGongchangyumiaoById(id));
    }

    /**
     * 新增工厂化育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:add')")
    @Log(title = "工厂化育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gongchangyumiao gongchangyumiao)
    {
        return toAjax(gongchangyumiaoService.insertGongchangyumiao(gongchangyumiao));
    }
	
	 /**
     * 没有token
     * 新增工厂化育苗、养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody Gongchangyumiao gongchangyumiao)
    {
        return toAjax(gongchangyumiaoService.insertGongchangyumiao(gongchangyumiao));
    }
	

    /**
     * 修改工厂化育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:edit')")
    @Log(title = "工厂化育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gongchangyumiao gongchangyumiao)
    {
        return toAjax(gongchangyumiaoService.updateGongchangyumiao(gongchangyumiao));
    }

    /**
     * 删除工厂化育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:gongchangyumiao:remove')")
    @Log(title = "工厂化育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gongchangyumiaoService.deleteGongchangyumiaoByIds(ids));
    }
}
