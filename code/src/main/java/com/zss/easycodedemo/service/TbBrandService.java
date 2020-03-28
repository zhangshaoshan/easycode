package com.zss.easycodedemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zss.easycodedemo.entity.TbBrand;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表服务接口
 *
 * @author zss
 * @since 2020-03-28 23:37:55
 */
public interface TbBrandService extends IService<TbBrand> {

}