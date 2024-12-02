package com.zhj.datasource.mapper;

import com.zhj.datasource.config.MyMapper;
import com.zhj.datasource.model.DatasourceConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DatasourceConfigMapper extends MyMapper<DatasourceConfig> {
}
