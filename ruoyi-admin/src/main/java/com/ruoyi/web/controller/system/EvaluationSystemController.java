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
import com.ruoyi.system.domain.EvaluationSystem;
import com.ruoyi.system.service.IEvaluationSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 渔业资源资产价值评估系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/evaluation")
public class EvaluationSystemController extends BaseController
{
    @Autowired
    private IEvaluationSystemService evaluationSystemService;

    /**
     * 查询渔业资源资产价值评估系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:list')")
    @GetMapping("/list")
    public TableDataInfo list(EvaluationSystem evaluationSystem)
    {
        startPage();
        List<EvaluationSystem> list = null;
        if (checkUserLevelZhuan()) {
            list=evaluationSystemService.selectEvaluationSystemList(evaluationSystem);

        }else {
            evaluationSystem.setUserId(getUserId());
            evaluationSystem.setUserLevelNum(getLimitNum());
            list=evaluationSystemService.selectEvaluationSystemListByUserLevel(evaluationSystem);
        }
        return getDataTable(list);
    }

    /**
     * 导出渔业资源资产价值评估系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:export')")
    @Log(title = "渔业资源资产价值评估系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, EvaluationSystem evaluationSystem)
    {
        List<EvaluationSystem> list = evaluationSystemService.selectEvaluationSystemList(evaluationSystem);
        ExcelUtil<EvaluationSystem> util = new ExcelUtil<EvaluationSystem>(EvaluationSystem.class);
        util.exportExcel(response, list, "渔业资源资产价值评估系统数据");
    }

    /**
     * 获取渔业资源资产价值评估系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(evaluationSystemService.selectEvaluationSystemById(id));
    }
	
	 /**
     * 没有token
     * 新增渔业资源资产价值评估系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody EvaluationSystem evaluationSystem)
    {
        return toAjax(evaluationSystemService.insertEvaluationSystem(evaluationSystem));
    }

    /**
     * 新增渔业资源资产价值评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:add')")
    @Log(title = "渔业资源资产价值评估系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody EvaluationSystem evaluationSystem)
    {
        return toAjax(evaluationSystemService.insertEvaluationSystem(evaluationSystem));
    }

    /**
     * 修改渔业资源资产价值评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:edit')")
    @Log(title = "渔业资源资产价值评估系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody EvaluationSystem evaluationSystem)
    {
        return toAjax(evaluationSystemService.updateEvaluationSystem(evaluationSystem));
    }

    /**
     * 删除渔业资源资产价值评估系统
     */
    @PreAuthorize("@ss.hasPermi('system:evaluation:remove')")
    @Log(title = "渔业资源资产价值评估系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(evaluationSystemService.deleteEvaluationSystemByIds(ids));
    }
}
