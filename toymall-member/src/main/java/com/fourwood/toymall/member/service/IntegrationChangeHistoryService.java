package com.fourwood.toymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fourwood.common.utils.PageUtils;
import com.fourwood.toymall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author fourwood
 * @email mlj2225042023@gmail.com
 * @date 2021-11-19 19:24:37
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

