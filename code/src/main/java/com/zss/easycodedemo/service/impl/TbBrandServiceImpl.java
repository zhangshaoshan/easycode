package com.zss.easycodedemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zss.easycodedemo.dao.TbBrandDao;
import com.zss.easycodedemo.entity.TbBrand;
import com.zss.easycodedemo.service.TbBrandService;
import org.springframework.stereotype.Service;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表服务实现类
 *
 * @author zss
 * @since 2020-03-28 23:37:56
 */
@Service("tbBrandService")
public class TbBrandServiceImpl extends ServiceImpl<TbBrandDao, TbBrand> implements TbBrandService {

}