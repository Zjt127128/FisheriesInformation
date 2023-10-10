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
import com.ruoyi.system.domain.MudflatInformation;
import com.ruoyi.system.service.IMudflatInformationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 海底滩涂增养殖技术经济资源信息共享系统信息Controller
 * 
 * @author ruoyi
 * @date 2023-10-03
 */
@RestController
@RequestMapping("/system/mudflatinformation")
public class MudflatInformationController extends BaseController
{
    @Autowired
    private IMudflatInformationService mudflatInformationService;

    /**
     * 查询海底滩涂增养殖技术经济资源信息共享系统信息列表
     */
    @GetMapping("/list")
    public TableDataInfo list(MudflatInformation mudflatInformation)
    {
        startPage();
        List<MudflatInformation> list = mudflatInformationService.selectMudflatInformationList(mudflatInformation);
        return getDataTable(list);
    }

    /**
     * 导出海底滩涂增养殖技术经济资源信息共享系统信息列表
     */
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MudflatInformation mudflatInformation)
    {
        List<MudflatInformation> list = mudflatInformationService.selectMudflatInformationList(mudflatInformation);
        ExcelUtil<MudflatInformation> util = new ExcelUtil<MudflatInformation>(MudflatInformation.class);
        util.exportExcel(response, list, "海底滩涂增养殖技术经济资源信息共享系统信息数据");
    }

    /**
     * 获取海底滩涂增养殖技术经济资源信息共享系统信息详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(mudflatInformationService.selectMudflatInformationById(id));
    }

    /**
     * 新增海底滩涂增养殖技术经济资源信息共享系统信息
     */
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MudflatInformation mudflatInformation)
    {
        return toAjax(mudflatInformationService.insertMudflatInformation(mudflatInformation));
    }

    /**
     * 修改海底滩涂增养殖技术经济资源信息共享系统信息
     */
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MudflatInformation mudflatInformation)
    {
        return toAjax(mudflatInformationService.updateMudflatInformation(mudflatInformation));
    }

    /**
     * 删除海底滩涂增养殖技术经济资源信息共享系统信息
     */
    @Log(title = "海底滩涂增养殖技术经济资源信息共享系统信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(mudflatInformationService.deleteMudflatInformationByIds(ids));
    }
}
