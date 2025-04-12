package domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableId(type = IdType.AUTO)
    @Column(name = "id", nullable = false)
    protected Long id;

    protected Date createDate;

    protected Date updateDate;

    protected String delFlag;
}
