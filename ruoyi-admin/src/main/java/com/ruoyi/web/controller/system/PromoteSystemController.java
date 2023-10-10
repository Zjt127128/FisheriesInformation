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
import com.ruoyi.system.domain.PromoteSystem;
import com.ruoyi.system.service.IPromoteSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 涉渔科技成果转化、推广共享系统Controller
 *
 * @author ruoyi
 * @date 2023-02-23
 */
@RestController
@RequestMapping("/system/promote")
public class PromoteSystemController extends BaseController
{
    @Autowired
    private IPromoteSystemService promoteSystemService;

    /**
     * 查询涉渔科技成果转化、推广共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:promote:list')")
    @GetMapping("/list")
    public TableDataInfo list(PromoteSystem promoteSystem)
    {
        startPage();
        List<PromoteSystem> list =null;
        if (checkUserLevelZhuan()) {
            list=promoteSystemService.selectPromoteSystemList(promoteSystem);

        }else {
            promoteSystem.setUserId(getUserId());
            promoteSystem.setUserLevelNum(getLimitNum());

            list=promoteSystemService.selectPromoteSystemListByUserLevel(promoteSystem);

        }

        return getDataTable(list);
    }

    /**
     * 导出涉渔科技成果转化、推广共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:promote:export')")
    @Log(title = "涉渔科技成果转化、推广共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PromoteSystem promoteSystem)
    {
        List<PromoteSystem> list = promoteSystemService.selectPromoteSystemList(promoteSystem);
        ExcelUtil<PromoteSystem> util = new ExcelUtil<PromoteSystem>(PromoteSystem.class);
        util.exportExcel(response, list, "涉渔科技成果转化、推广共享系统数据");
    }

    /**
     * 获取涉渔科技成果转化、推广共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:promote:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(promoteSystemService.selectPromoteSystemById(id));
    }

    /**
     * 新增涉渔科技成果转化、推广共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:promote:add')")
    @Log(title = "涉渔科技成果转化、推广共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PromoteSystem promoteSystem)
    {
        return toAjax(promoteSystemService.insertPromoteSystem(promoteSystem));
    }

    /**
     * 没有token
     * 新增涉渔科技成果转化、推广共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody PromoteSystem promoteSystem)
    {
        return toAjax(promoteSystemService.insertPromoteSystem(promoteSystem));
    }

    /**
     * 修改涉渔科技成果转化、推广共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:promote:edit')")
    @Log(title = "涉渔科技成果转化、推广共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PromoteSystem promoteSystem)
    {
        return toAjax(promoteSystemService.updatePromoteSystem(promoteSystem));
    }

    /**
     * 删除涉渔科技成果转化、推广共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:promote:remove')")
    @Log(title = "涉渔科技成果转化、推广共享系统", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(promoteSystemService.deletePromoteSystemByIds(ids));
    }
}


