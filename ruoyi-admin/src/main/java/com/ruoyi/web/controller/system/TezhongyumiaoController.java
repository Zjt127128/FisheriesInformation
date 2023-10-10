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
import com.ruoyi.system.domain.Tezhongyumiao;
import com.ruoyi.system.service.ITezhongyumiaoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 特种育苗、养殖技术经济资源信息共享系统Controller
 * 
 * @author ruoyi
 * @date 2023-02-21
 */
@RestController
@RequestMapping("/system/tezhongyumiao")
public class TezhongyumiaoController extends BaseController
{
    @Autowired
    private ITezhongyumiaoService tezhongyumiaoService;

    /**
     * 查询特种育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:list')")
    @GetMapping("/list")
    public TableDataInfo list(Tezhongyumiao tezhongyumiao)
    {
        startPage();
        List<Tezhongyumiao> list = null;
        if (checkUserLevelZhuan()) {
           list= tezhongyumiaoService.selectTezhongyumiaoList(tezhongyumiao);

        }else {
            tezhongyumiao.setUserId(getUserId());
            tezhongyumiao.setUserLevelNum(getLimitNum());
            list=tezhongyumiaoService.selectTezhongyumiaoListByUserLevel(tezhongyumiao);
        }

        return getDataTable(list);
    }

    /**
     * 导出特种育苗、养殖技术经济资源信息共享系统列表
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:export')")
    @Log(title = "特种育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Tezhongyumiao tezhongyumiao)
    {
        List<Tezhongyumiao> list = tezhongyumiaoService.selectTezhongyumiaoList(tezhongyumiao);
        ExcelUtil<Tezhongyumiao> util = new ExcelUtil<Tezhongyumiao>(Tezhongyumiao.class);
        util.exportExcel(response, list, "特种育苗、养殖技术经济资源信息共享系统数据");
    }

    /**
     * 获取特种育苗、养殖技术经济资源信息共享系统详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tezhongyumiaoService.selectTezhongyumiaoById(id));
    }

    /**
     * 新增特种育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:add')")
    @Log(title = "特种育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Tezhongyumiao tezhongyumiao)
    {
        return toAjax(tezhongyumiaoService.insertTezhongyumiao(tezhongyumiao));
    }
	
	/**
     * 没有token
     * 新增特种育苗、养殖技术经济资源信息共享系统
     */
    @Anonymous
    @PostMapping("/addnotoken")
    public AjaxResult addnotoken(@RequestBody Tezhongyumiao tezhongyumiao)
    {
        return toAjax(tezhongyumiaoService.insertTezhongyumiao(tezhongyumiao));
    }

    /**
     * 修改特种育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:edit')")
    @Log(title = "特种育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Tezhongyumiao tezhongyumiao)
    {
        return toAjax(tezhongyumiaoService.updateTezhongyumiao(tezhongyumiao));
    }

    /**
     * 删除特种育苗、养殖技术经济资源信息共享系统
     */
    @PreAuthorize("@ss.hasPermi('system:tezhongyumiao:remove')")
    @Log(title = "特种育苗、养殖技术经济资源信息共享系统", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tezhongyumiaoService.deleteTezhongyumiaoByIds(ids));
    }
}
