package com.zss.easycodedemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zss.easycodedemo.entity.TbBrand;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表数据库访问层
 *
 * @author zss
 * @since 2020-03-28 23:37:55
 */
public interface TbBrandDao extends BaseMapper<TbBrand> {

}