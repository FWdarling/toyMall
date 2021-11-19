package com.fourwood.toymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fourwood.common.utils.PageUtils;
import com.fourwood.toymall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author fourwood
 * @email mlj2225042023@gmail.com
 * @date 2021-11-19 19:33:30
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

