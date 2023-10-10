package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.PondInformation;
import com.ruoyi.system.service.IPondInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 池塘育苗、养殖技术经济资源信息共享系统信息Controller
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@RestController
@RequestMapping("/system/pondinformation")
public class PondInformationController extends BaseController
{
    @Autowired
    private IPondInformationService pondInformationService;

    /**
     * 查询池塘育苗、养殖技术经济资源信息共享系统信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(PondInformation pondInformation)
    {
        startPage();
        List<PondInformation> list = pondInformationService.selectPondInformationList(pondInformation);
        return getDataTable(list);
    }

    /**
     * 导出池塘育苗、养殖技术经济资源信息共享系统信息列表
     */
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PondInformation pondInformation)
    {
        List<PondInformation> list = pondInformationService.selectPondInformationList(pondInformation);
        ExcelUtil<PondInformation> util = new ExcelUtil<PondInformation>(PondInformation.class);
        util.exportExcel(response, list, "池塘育苗、养殖技术经济资源信息共享系统信息数据");
    }

    /**
     * 获取池塘育苗、养殖技术经济资源信息共享系统信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(pondInformationService.selectPondInformationById(id));
    }

    /**
     * 新增池塘育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PondInformation pondInformation)
    {
        return toAjax(pondInformationService.insertPondInformation(pondInformation));
    }

    /**
     * 修改池塘育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PondInformation pondInformation)
    {
        return toAjax(pondInformationService.updatePondInformation(pondInformation));
    }

    /**
     * 删除池塘育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "池塘育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(pondInformationService.deletePondInformationByIds(ids));
    }
}
