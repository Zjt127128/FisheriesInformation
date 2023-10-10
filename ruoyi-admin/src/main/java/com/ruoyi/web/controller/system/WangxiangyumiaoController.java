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
import com.ruoyi.system.domain.Wangxiangyumiao;
import com.ruoyi.system.service.IWangxiangyumiaoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统
Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/wangxiangyumiao")
public class WangxiangyumiaoController extends BaseController
{
    @Autowired
    private IWangxiangyumiaoService wangxiangyumiaoService;

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统
列表
     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:list')")
    @GetMapping("/list")
    public TableDataInfo list(Wangxiangyumiao wangxiangyumiao)
    {
        startPage();
        List<Wangxiangyumiao> list = null;
        if (checkUserLevelZhuan()) {
        list= wangxiangyumiaoService.selectWangxiangyumiaoList(wangxiangyumiao);

        }else {
            wangxiangyumiao.setUserId(getUserId());
            wangxiangyumiao.setUserLevelNum(getLimitNum());
            list= wangxiangyumiaoService.selectWangxiangyumiaoListByUserLevel(wangxiangyumiao);

        }
        return getDataTable(list);
    }

    /**
     * 导出网箱育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:export')")
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Wangxiangyumiao wangxiangyumiao)
    {
        List<Wangxiangyumiao> list = wangxiangyumiaoService.selectWangxiangyumiaoList(wangxiangyumiao);
        ExcelUtil<Wangxiangyumiao> util = new ExcelUtil<Wangxiangyumiao>(Wangxiangyumiao.class);
        util.exportExcel(response, list, "网箱育苗、养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取网箱育苗、养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(wangxiangyumiaoService.selectWangxiangyumiaoById(id));
    }

    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:add')")
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统 ", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Wangxiangyumiao wangxiangyumiao)
    {
        return toAjax(wangxiangyumiaoService.insertWangxiangyumiao(wangxiangyumiao));
    }
	
	 /**
     * 没有token
     * 新增网箱育苗、养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody Wangxiangyumiao wangxiangyumiao)
    {
        return toAjax(wangxiangyumiaoService.insertWangxiangyumiao(wangxiangyumiao));
    }


    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:edit')")
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统 ", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Wangxiangyumiao wangxiangyumiao)
    {
        return toAjax(wangxiangyumiaoService.updateWangxiangyumiao(wangxiangyumiao));
    }

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统

     */
    @PreAuthorize("@ss.hasPermi('system:wangxiangyumiao:remove')")
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统 ", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(wangxiangyumiaoService.deleteWangxiangyumiaoByIds(ids));
    }
}
