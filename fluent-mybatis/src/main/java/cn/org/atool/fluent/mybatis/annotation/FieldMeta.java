package cn.org.atool.fluent.mybatis.annotation;

/**
 * FieldMeta: 实体字段和数据库字段映射信息
 *
 * @author darui.wu
 * @create 2020/6/23 9:16 上午
 */
public class FieldMeta {
    /**
     * 属性名称
     */
    public final String name;
    /**
     * 字段名称
     */
    public final String column;

    public FieldMeta(String name, String column) {
        this.name = name;
        this.column = column;
    }
}