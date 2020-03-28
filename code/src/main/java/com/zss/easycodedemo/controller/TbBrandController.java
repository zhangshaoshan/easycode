package com.zss.easycodedemo.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zss.easycodedemo.entity.TbBrand;
import com.zss.easycodedemo.service.TbBrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表控制层
 *
 * @author zss
 * @since 2020-03-28 23:37:56
 */
@RestController
@RequestMapping("tbBrand")
public class TbBrandController extends ApiController {
    /**
     * 服务对象
     */
    @Resource(name = "tbBrandService")
    private TbBrandService tbBrandService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param tbBrand 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TbBrand> page, TbBrand tbBrand) {
        return success(this.tbBrandService.page(page, new QueryWrapper<>(tbBrand)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.tbBrandService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param tbBrand 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TbBrand tbBrand) {
        return success(this.tbBrandService.save(tbBrand));
    }

    /**
     * 修改数据
     *
     * @param tbBrand 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TbBrand tbBrand) {
        return success(this.tbBrandService.updateById(tbBrand));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.tbBrandService.removeByIds(idList));
    }
}