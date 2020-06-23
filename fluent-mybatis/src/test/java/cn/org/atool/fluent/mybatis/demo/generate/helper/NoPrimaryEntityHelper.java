package cn.org.atool.fluent.mybatis.demo.generate.helper;

import cn.org.atool.fluent.mybatis.demo.generate.entity.NoPrimaryEntity;
import cn.org.atool.fluent.mybatis.demo.generate.mapping.NoPrimaryMP;

import java.util.HashMap;
import java.util.Map;


/**
 * <p>
 * 
 * </p>
 *
 * @author generate code
 */
public class NoPrimaryEntityHelper {
    /**
     * NoPrimaryEntity对象转换为HashMap，key值是对象属性
     *
     * @param entity
     * @return
     */
    public static Map<String, Object> map(NoPrimaryEntity entity){
        Map<String, Object> map = new HashMap<>();
        if (entity.getColumn1() != null) {
            map.put(NoPrimaryMP.column1.name, entity.getColumn1());
        }
        if (entity.getColumn2() != null) {
            map.put(NoPrimaryMP.column2.name, entity.getColumn2());
        }
        return map;
    }

    /**
     * NoPrimaryEntity对象转换为HashMap，key值是数据库字段
     *
     * @param entity
     * @return
     */
    public static Map<String, Object> column(NoPrimaryEntity entity){
        Map<String, Object> map = new HashMap<>();
        if (entity.getColumn1() != null) {
            map.put(NoPrimaryMP.column1.column, entity.getColumn1());
        }
        if (entity.getColumn2() != null) {
            map.put(NoPrimaryMP.column2.column, entity.getColumn2());
        }
        return map;
    }

    /**
     * map对应属性值设置到NoPrimaryEntity对象中
     *
     * @param map
     * @return
     */
    public static NoPrimaryEntity entity(Map<String, Object> map){
        NoPrimaryEntity entity = new NoPrimaryEntity();
        if (map.containsKey(NoPrimaryMP.column1.name)) {
            entity.setColumn1((Integer) map.get(NoPrimaryMP.column1.name));
        }
        if (map.containsKey(NoPrimaryMP.column2.name)) {
            entity.setColumn2((String) map.get(NoPrimaryMP.column2.name));
        }
        return entity;
    }

    public static NoPrimaryEntity copy(NoPrimaryEntity entity) {
        NoPrimaryEntity copy = new NoPrimaryEntity();
        {
            copy.setColumn1(entity.getColumn1());
            copy.setColumn2(entity.getColumn2());
        }
        return copy;
    }
}