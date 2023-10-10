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
import com.ruoyi.system.domain.OwnerSystem;
import com.ruoyi.system.service.IOwnerSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 业主、专家、涉渔机构、在线交流共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/owner")
public class OwnerSystemController extends BaseController
{
    @Autowired
    private IOwnerSystemService ownerSystemService;

    /**
     * 查询业主、专家、涉渔机构、在线交流共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:owner:list')")
    @GetMapping("/list")
    public TableDataInfo list(OwnerSystem ownerSystem)
    {
        startPage();
        List<OwnerSystem> list = null;
        if (checkUserLevelZhuan()) {
            list =ownerSystemService.selectOwnerSystemList(ownerSystem);

        }else {
            ownerSystem.setUserId(getUserId());
            ownerSystem.setUserLevelNum(getLimitNum());
            list=ownerSystemService.selectOwnerSystemListByUserLevel(ownerSystem);
        }

        return getDataTable(list);
    }

    /**
     * 导出业主、专家、涉渔机构、在线交流共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:owner:export')")
    @Log(title = "业主、专家、涉渔机构、在线交流共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, OwnerSystem ownerSystem)
    {
        List<OwnerSystem> list = ownerSystemService.selectOwnerSystemList(ownerSystem);
        ExcelUtil<OwnerSystem> util = new ExcelUtil<OwnerSystem>(OwnerSystem.class);
        util.exportExcel(response, list, "业主、专家、涉渔机构、在线交流共享系统数据");
    }

    /**
     * 获取业主、专家、涉渔机构、在线交流共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:owner:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ownerSystemService.selectOwnerSystemById(id));
    }

    /**
     * 新增业主、专家、涉渔机构、在线交流共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:owner:add')")
    @Log(title = "业主、专家、涉渔机构、在线交流共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody OwnerSystem ownerSystem)
    {
        return toAjax(ownerSystemService.insertOwnerSystem(ownerSystem));
    }
	
	/**
     * 没有token
     * 新增业主、专家、涉渔机构、在线交流共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody OwnerSystem ownerSystem)
    {
        return toAjax(ownerSystemService.insertOwnerSystem(ownerSystem));
    }

    /**
     * 修改业主、专家、涉渔机构、在线交流共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:owner:edit')")
    @Log(title = "业主、专家、涉渔机构、在线交流共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody OwnerSystem ownerSystem)
    {
        return toAjax(ownerSystemService.updateOwnerSystem(ownerSystem));
    }

    /**
     * 删除业主、专家、涉渔机构、在线交流共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:owner:remove')")
    @Log(title = "业主、专家、涉渔机构、在线交流共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ownerSystemService.deleteOwnerSystemByIds(ids));
    }
}
