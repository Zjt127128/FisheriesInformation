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
import com.ruoyi.system.domain.ReservoirSystem;
import com.ruoyi.system.service.IReservoirSystemService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/reservoir")
public class ReservoirSystemController extends BaseController
{
    @Autowired
    private IReservoirSystemService reservoirSystemService;

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:list')")
    @GetMapping("/list")
    public TableDataInfo list(ReservoirSystem reservoirSystem)
    {
        startPage();
        List<ReservoirSystem> list =null;
        if (checkUserLevelZhuan()) {
            list=reservoirSystemService.selectReservoirSystemList(reservoirSystem);
        }else {
            reservoirSystem.setUserId(getUserId());
            reservoirSystem.setUserLevelNum(getLimitNum());
            list=reservoirSystemService.selectReservoirSystemListByUserLevel(reservoirSystem);

        }



        return getDataTable(list);
    }

    /**
     * 导出海底滩涂增养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:export')")
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReservoirSystem reservoirSystem)
    {
        List<ReservoirSystem> list = reservoirSystemService.selectReservoirSystemList(reservoirSystem);
        ExcelUtil<ReservoirSystem> util = new ExcelUtil<ReservoirSystem>(ReservoirSystem.class);
        util.exportExcel(response, list, "海底滩涂增养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取海底滩涂增养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reservoirSystemService.selectReservoirSystemById(id));
    }

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:add')")
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReservoirSystem reservoirSystem)
    {
        return toAjax(reservoirSystemService.insertReservoirSystem(reservoirSystem));
    }
	
	/**
     * 没有token
     * 新增海底滩涂增养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody ReservoirSystem reservoirSystem)
    {
        return toAjax(reservoirSystemService.insertReservoirSystem(reservoirSystem));
    }

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:edit')")
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReservoirSystem reservoirSystem)
    {
        return toAjax(reservoirSystemService.updateReservoirSystem(reservoirSystem));
    }

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:reservoir:remove')")
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reservoirSystemService.deleteReservoirSystemByIds(ids));
    }
}
