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
import com.ruoyi.system.domain.AquacultureInformation;
import com.ruoyi.system.service.IAquacultureInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工厂化育苗、养殖技术经济资源信息Controller
 * 
 * @author ruoyi
 * @date 2023-10-02
 */
@RestController
@RequestMapping("/system/information")
public class AquacultureInformationController extends BaseController
{
    @Autowired
    private IAquacultureInformationService aquacultureInformationService;

    /**
     * 查询工厂化育苗、养殖技术经济资源信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(AquacultureInformation aquacultureInformation)
    {
        startPage();
        List<AquacultureInformation> list = aquacultureInformationService.selectAquacultureInformationList(aquacultureInformation);
        return getDataTable(list);
    }

    /**
     * 导出工厂化育苗、养殖技术经济资源信息列表
     */
    @Log(title = "工厂化育苗、养殖技术经济资源信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, AquacultureInformation aquacultureInformation)
    {
        List<AquacultureInformation> list = aquacultureInformationService.selectAquacultureInformationList(aquacultureInformation);
        ExcelUtil<AquacultureInformation> util = new ExcelUtil<AquacultureInformation>(AquacultureInformation.class);
        util.exportExcel(response, list, "工厂化育苗、养殖技术经济资源信息数据");
    }

    /**
     * 获取工厂化育苗、养殖技术经济资源信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(aquacultureInformationService.selectAquacultureInformationById(id));
    }

    /**
     * 新增工厂化育苗、养殖技术经济资源信息
     */
    @Log(title = "工厂化育苗、养殖技术经济资源信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody AquacultureInformation aquacultureInformation)
    {
        return toAjax(aquacultureInformationService.insertAquacultureInformation(aquacultureInformation));
    }

    /**
     * 修改工厂化育苗、养殖技术经济资源信息
     */
    @Log(title = "工厂化育苗、养殖技术经济资源信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody AquacultureInformation aquacultureInformation)
    {
        return toAjax(aquacultureInformationService.updateAquacultureInformation(aquacultureInformation));
    }

    /**
     * 删除工厂化育苗、养殖技术经济资源信息
     */
    @Log(title = "工厂化育苗、养殖技术经济资源信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(aquacultureInformationService.deleteAquacultureInformationByIds(ids));
    }
}
