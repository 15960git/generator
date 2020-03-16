package com.atguigu.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


/**
 * MySQL代码生成器
 *
 * @author Mark sunlightcs@gmail.com
 * @since 2018-07-24
 */

public interface MySQLGeneratorDao extends GeneratorDao {


    @Override
    default List<Map<String, Object>> queryList(Map<String, Object> map) {
        return null;
    }
}
