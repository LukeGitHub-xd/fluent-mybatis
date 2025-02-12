package cn.org.atool.fluent.mybatis.base;

import cn.org.atool.fluent.mybatis.functions.TableSupplier;

/**
 * Entity基类, 非充血模式
 *
 * @author wudarui
 */
@SuppressWarnings({"unchecked"})
public abstract class BaseEntity implements IEntity {

    /**
     * 归属表, 在需要动态判断entity归属表场景下使用
     * 默认无需设置
     */
    private TableSupplier supplier;

    @Override
    public <E extends IEntity> E tableSupplier(TableSupplier supplier) {
        this.supplier = supplier;
        return (E) this;
    }

    @Override
    public <E extends IEntity> E tableSupplier(String table) {
        this.supplier = e -> table;
        return (E) this;
    }

    @Override
    public String tableSupplier() {
        return this.supplier == null ? null : this.supplier.get(this);
    }
}
