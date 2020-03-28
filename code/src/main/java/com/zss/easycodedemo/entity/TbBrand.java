package com.zss.easycodedemo.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 品牌表，一个品牌下有多个商品（spu），一对多关系(TbBrand)表实体类
 *
 * @author zss
 * @since 2020-03-28 23:37:53
 */
@SuppressWarnings("serial")
public class TbBrand extends Model<TbBrand> {
    //品牌id
    private Long id;
    //品牌名称
    private String name;
    //品牌图片地址
    private String image;
    //品牌的首字母
    private String letter;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }