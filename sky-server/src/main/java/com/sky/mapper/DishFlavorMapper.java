package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 批量插入口味
 */
@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
    @Delete("delete from sky_take_out.dish_flavor where dish_id = #{dishId}")
    /**
     * 批量删除口味数据
     * @param flavors
     */
    void deleteByDishId(Long dishId);
}
