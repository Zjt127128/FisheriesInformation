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
import com.ruoyi.system.domain.ShippingSystem;
import com.ruoyi.system.service.IShippingSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 渔业船舶技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/shipping")
public class ShippingSystemController extends BaseController
{
    @Autowired
    private IShippingSystemService shippingSystemService;

    /**
     * 查询渔业船舶技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShippingSystem shippingSystem)
    {
        startPage();
        List<ShippingSystem> list = null;
        if (checkUserLevelZhuan()) {
            list= shippingSystemService.selectShippingSystemList(shippingSystem);
        }else {
            shippingSystem.setUserId(getUserId());
            shippingSystem.setUserLevelNum(getLimitNum());
            list=shippingSystemService.selectShippingSystemListByUserLevel(shippingSystem);
        }


        return getDataTable(list);
    }

    /**
     * 导出渔业船舶技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:export')")
    @Log(title = "渔业船舶技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShippingSystem shippingSystem)
    {
        List<ShippingSystem> list = shippingSystemService.selectShippingSystemList(shippingSystem);
        ExcelUtil<ShippingSystem> util = new ExcelUtil<ShippingSystem>(ShippingSystem.class);
        util.exportExcel(response, list, "渔业船舶技术经济资源信息共享系统数据");
    }

    /**
     * 获取渔业船舶技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(shippingSystemService.selectShippingSystemById(id));
    }

    /**
     * 新增渔业船舶技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:add')")
    @Log(title = "渔业船舶技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShippingSystem shippingSystem)
    {
        return toAjax(shippingSystemService.insertShippingSystem(shippingSystem));
    }
	
	/**
     * 没有token
     * 新增渔业船舶技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody ShippingSystem shippingSystem)
    {
        return toAjax(shippingSystemService.insertShippingSystem(shippingSystem));
    }

    /**
     * 修改渔业船舶技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:edit')")
    @Log(title = "渔业船舶技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShippingSystem shippingSystem)
    {
        return toAjax(shippingSystemService.updateShippingSystem(shippingSystem));
    }

    /**
     * 删除渔业船舶技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:shipping:remove')")
    @Log(title = "渔业船舶技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(shippingSystemService.deleteShippingSystemByIds(ids));
    }
}
