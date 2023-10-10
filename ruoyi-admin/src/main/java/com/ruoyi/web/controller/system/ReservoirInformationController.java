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
import com.ruoyi.system.domain.ReservoirInformation;
import com.ruoyi.system.service.IReservoirInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 水库等大水面渔业技术经济资源信息共享系统信息Controller
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@RestController
@RequestMapping("/system/reservoirinformation")
public class ReservoirInformationController extends BaseController
{
    @Autowired
    private IReservoirInformationService reservoirInformationService;

    /**
     * 查询水库等大水面渔业技术经济资源信息共享系统信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(ReservoirInformation reservoirInformation)
    {
        startPage();
        List<ReservoirInformation> list = reservoirInformationService.selectReservoirInformationList(reservoirInformation);
        return getDataTable(list);
    }

    /**
     * 导出水库等大水面渔业技术经济资源信息共享系统信息列表
     */
    @Log(title = "水库等大水面渔业技术经济资源信息共享系统信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReservoirInformation reservoirInformation)
    {
        List<ReservoirInformation> list = reservoirInformationService.selectReservoirInformationList(reservoirInformation);
        ExcelUtil<ReservoirInformation> util = new ExcelUtil<ReservoirInformation>(ReservoirInformation.class);
        util.exportExcel(response, list, "水库等大水面渔业技术经济资源信息共享系统信息数据");
    }

    /**
     * 获取水库等大水面渔业技术经济资源信息共享系统信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(reservoirInformationService.selectReservoirInformationById(id));
    }

    /**
     * 新增水库等大水面渔业技术经济资源信息共享系统信息
     */
    @Log(title = "水库等大水面渔业技术经济资源信息共享系统信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReservoirInformation reservoirInformation)
    {
        return toAjax(reservoirInformationService.insertReservoirInformation(reservoirInformation));
    }

    /**
     * 修改水库等大水面渔业技术经济资源信息共享系统信息
     */
    @Log(title = "水库等大水面渔业技术经济资源信息共享系统信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReservoirInformation reservoirInformation)
    {
        return toAjax(reservoirInformationService.updateReservoirInformation(reservoirInformation));
    }

    /**
     * 删除水库等大水面渔业技术经济资源信息共享系统信息
     */
    @Log(title = "水库等大水面渔业技术经济资源信息共享系统信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(reservoirInformationService.deleteReservoirInformationByIds(ids));
    }
}
