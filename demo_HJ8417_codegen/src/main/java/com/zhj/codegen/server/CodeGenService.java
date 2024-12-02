package com.zhj.codegen.server;

import cn.hutool.db.Entity;
import com.zhj.codegen.common.PageResult;
import com.zhj.codegen.entity.GenConfig;
import com.zhj.codegen.entity.TableRequest;

public interface CodeGenService {
    /**
     * 生成代码
     *
     * @param genConfig 生成配置
     * @return 代码压缩文件
     */
    byte[] generatorCode(GenConfig genConfig);

    /**
     * 分页查询表信息
     *
     * @param request 请求参数
     * @return 表名分页信息
     */
    PageResult<Entity> listTables(TableRequest request);
}
