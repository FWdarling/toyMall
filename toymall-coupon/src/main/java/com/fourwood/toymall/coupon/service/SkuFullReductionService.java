package com.fourwood.toymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fourwood.common.utils.PageUtils;
import com.fourwood.toymall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author fourwood
 * @email mlj2225042023@gmail.com
 * @date 2021-11-19 19:11:07
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

