package com.fourwood.toymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fourwood.common.utils.PageUtils;
import com.fourwood.toymall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author fourwood
 * @email mlj2225042023@gmail.com
 * @date 2021-11-19 17:30:56
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

