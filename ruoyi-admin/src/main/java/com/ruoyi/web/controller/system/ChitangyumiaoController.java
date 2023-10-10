package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.annotation.Anonymous;
import org.aspectj.lang.annotation.Around;
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
import com.ruoyi.system.domain.Chitangyumiao;
import com.ruoyi.system.service.IChitangyumiaoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

    /**
     * 池塘育苗、养殖技术经济资源信息共享系统Controller
     *
     * @author ruoyi
     * @date 2023-02-21
     */
    @RestController
    @RequestMapping("/system/chitangyumiao")
    public class ChitangyumiaoController extends BaseController
    {
    @Autowired
    private IChitangyumiaoService chitangyumiaoService;

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:list')")
    @GetMapping("/list")
    public TableDataInfo list(Chitangyumiao chitangyumiao)
    {
        startPage();
        List<Chitangyumiao> list =null;
        if (checkUserLevelZhuan()) {
            list=    chitangyumiaoService.selectChitangyumiaoList(chitangyumiao);
        }else {
            chitangyumiao.setUserId(getUserId());
            //可以访问的条数
            chitangyumiao.setUserLevelNum(getLimitNum());
            list= chitangyumiaoService.selectChitangyumiaoListByUserLevel(chitangyumiao);

        }

        return getDataTable(list);
    }

    /**
     * 导出池塘育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:export')")
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Chitangyumiao chitangyumiao)
    {
        List<Chitangyumiao> list = chitangyumiaoService.selectChitangyumiaoList(chitangyumiao);
        ExcelUtil<Chitangyumiao> util = new ExcelUtil<Chitangyumiao>(Chitangyumiao.class);
        util.exportExcel(response, list, "池塘育苗、养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取池塘育苗、养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(chitangyumiaoService.selectChitangyumiaoById(id));
    }
	
	 /**
	 * 没有token
     * 新增池塘育苗、养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody Chitangyumiao chitangyumiao)
    {
        return toAjax(chitangyumiaoService.insertChitangyumiao(chitangyumiao));
    }

    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:add')")
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Chitangyumiao chitangyumiao)
    {
        return toAjax(chitangyumiaoService.insertChitangyumiao(chitangyumiao));
    }

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:edit')")
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Chitangyumiao chitangyumiao)
    {
        return toAjax(chitangyumiaoService.updateChitangyumiao(chitangyumiao));
    }

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:chitangyumiao:remove')")
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(chitangyumiaoService.deleteChitangyumiaoByIds(ids));
    }
}
