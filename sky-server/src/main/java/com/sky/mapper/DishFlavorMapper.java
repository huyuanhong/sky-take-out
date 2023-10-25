package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 批量插入口味
 */
@Mapper
public interface DishFlavorMapper {
    void insertBatch(List<DishFlavor> flavors);
}
