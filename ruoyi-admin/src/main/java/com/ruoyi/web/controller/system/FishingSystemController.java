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
import com.ruoyi.system.domain.FishingSystem;
import com.ruoyi.system.service.IFishingSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 捕捞技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/fishing")
public class FishingSystemController extends BaseController
{
    @Autowired
    private IFishingSystemService fishingSystemService;

    /**
     * 查询捕捞技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:list')")
    @GetMapping("/list")
    public TableDataInfo list(FishingSystem fishingSystem)
    {
        startPage();
        List<FishingSystem> list = null;
        if (checkUserLevelZhuan()) {
          list=  fishingSystemService.selectFishingSystemList(fishingSystem);

        }else {
            fishingSystem.setUserId(getUserId());
            fishingSystem.setUserLevelNum(getLimitNum());
            list=  fishingSystemService.selectFishingSystemListByUserLevel(fishingSystem);
        }

        return getDataTable(list);
    }

    /**
     * 导出捕捞技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:export')")
    @Log(title = "捕捞技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FishingSystem fishingSystem)
    {
        List<FishingSystem> list = fishingSystemService.selectFishingSystemList(fishingSystem);
        ExcelUtil<FishingSystem> util = new ExcelUtil<FishingSystem>(FishingSystem.class);
        util.exportExcel(response, list, "捕捞技术经济资源信息共享系统数据");
    }

    /**
     * 获取捕捞技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(fishingSystemService.selectFishingSystemById(id));
    }

    /**
     * 新增捕捞技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:add')")
    @Log(title = "捕捞技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FishingSystem fishingSystem)
    {
        return toAjax(fishingSystemService.insertFishingSystem(fishingSystem));
    }
	
	 /**
     * 没有token
     * 新增捕捞技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody FishingSystem fishingSystem)
    {
        return toAjax(fishingSystemService.insertFishingSystem(fishingSystem));
    }

    /**
     * 修改捕捞技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:edit')")
    @Log(title = "捕捞技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FishingSystem fishingSystem)
    {
        return toAjax(fishingSystemService.updateFishingSystem(fishingSystem));
    }

    /**
     * 删除捕捞技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:fishing:remove')")
    @Log(title = "捕捞技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(fishingSystemService.deleteFishingSystemByIds(ids));
    }
}
