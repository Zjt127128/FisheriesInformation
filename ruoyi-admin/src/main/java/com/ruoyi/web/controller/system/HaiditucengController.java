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
import com.ruoyi.system.domain.Haidituceng;
import com.ruoyi.system.service.IHaiditucengService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 *  海底滩涂增养殖技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/haidituceng")
public class HaiditucengController extends BaseController
{
    @Autowired
    private IHaiditucengService haiditucengService;

    /**
     * 查询 海底滩涂增养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:list')")
    @GetMapping("/list")
    public TableDataInfo list(Haidituceng haidituceng)
    {
        startPage();
        List<Haidituceng> list = null;
        if (checkUserLevelZhuan()) {
            list =  haiditucengService.selectHaiditucengList(haidituceng);

        }else {
            haidituceng.setUserId(getUserId());
            haidituceng.setUserLevelNum(getLimitNum());
            list=haiditucengService.selectHaiditucengListByUserLevel(haidituceng);
        }

        return getDataTable(list);
    }

    /**
     * 导出 海底滩涂增养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:export')")
    @Log(title = " 海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Haidituceng haidituceng)
    {
        List<Haidituceng> list = haiditucengService.selectHaiditucengList(haidituceng);
        ExcelUtil<Haidituceng> util = new ExcelUtil<Haidituceng>(Haidituceng.class);
        util.exportExcel(response, list, " 海底滩涂增养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取 海底滩涂增养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(haiditucengService.selectHaiditucengById(id));
    }

    /**
     * 新增 海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:add')")
    @Log(title = " 海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Haidituceng haidituceng)
    {
        return toAjax(haiditucengService.insertHaidituceng(haidituceng));
    }
	
	/**
	 * 没有token
     * 新增 海底滩涂增养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody Haidituceng haidituceng)
    {
        return toAjax(haiditucengService.insertHaidituceng(haidituceng));
    }

    /**
     * 修改 海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:edit')")
    @Log(title = " 海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Haidituceng haidituceng)
    {
        return toAjax(haiditucengService.updateHaidituceng(haidituceng));
    }

    /**
     * 删除 海底滩涂增养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:haidituceng:remove')")
    @Log(title = " 海底滩涂增养殖技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(haiditucengService.deleteHaiditucengByIds(ids));
    }
}
