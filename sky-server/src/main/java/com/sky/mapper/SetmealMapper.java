package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface SetmealMapper {
     Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

//分页查询


    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);



    void insert(Setmeal setmeal);


@Select("SELECT * from setmeal where id = #{id}")
    Setmeal getById(Long ids);

@Delete("delete  from setmeal where id = #{id}")
    void deleteById(Long ids);

@AutoFill(value = OperationType.UPDATE)
    void update(Setmeal setmeal);
}
