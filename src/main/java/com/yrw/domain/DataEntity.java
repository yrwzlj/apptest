package domain;

import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.Date;

/**
 * @desc 数据库基本对象映射类
 * @date 2022/11/26
 */
@Accessors(chain = true)
public abstract class DataEntity<T> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    protected String id;

    protected Date createDate;

    protected Date updateDate;

    protected String delFlag;
}
