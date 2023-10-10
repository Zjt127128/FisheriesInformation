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
import com.ruoyi.system.domain.NetboxInformation;
import com.ruoyi.system.service.INetboxInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 网箱育苗、养殖技术经济资源信息共享系统信息Controller
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@RestController
@RequestMapping("/system/netboxinformation")
public class NetboxInformationController extends BaseController
{
    @Autowired
    private INetboxInformationService netboxInformationService;

    /**
     * 查询网箱育苗、养殖技术经济资源信息共享系统信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(NetboxInformation netboxInformation)
    {
        startPage();
        List<NetboxInformation> list = netboxInformationService.selectNetboxInformationList(netboxInformation);
        return getDataTable(list);
    }

    /**
     * 导出网箱育苗、养殖技术经济资源信息共享系统信息列表
     */
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NetboxInformation netboxInformation)
    {
        List<NetboxInformation> list = netboxInformationService.selectNetboxInformationList(netboxInformation);
        ExcelUtil<NetboxInformation> util = new ExcelUtil<NetboxInformation>(NetboxInformation.class);
        util.exportExcel(response, list, "网箱育苗、养殖技术经济资源信息共享系统信息数据");
    }

    /**
     * 获取网箱育苗、养殖技术经济资源信息共享系统信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(netboxInformationService.selectNetboxInformationById(id));
    }

    /**
     * 新增网箱育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NetboxInformation netboxInformation)
    {
        return toAjax(netboxInformationService.insertNetboxInformation(netboxInformation));
    }

    /**
     * 修改网箱育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NetboxInformation netboxInformation)
    {
        return toAjax(netboxInformationService.updateNetboxInformation(netboxInformation));
    }

    /**
     * 删除网箱育苗、养殖技术经济资源信息共享系统信息
     */
    @Log(title = "网箱育苗、养殖技术经济资源信息共享系统信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(netboxInformationService.deleteNetboxInformationByIds(ids));
    }
}
