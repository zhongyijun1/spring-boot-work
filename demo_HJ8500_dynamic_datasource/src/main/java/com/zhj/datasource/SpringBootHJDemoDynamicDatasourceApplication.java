package com.zhj.datasource;

import com.zhj.datasource.datasource.DatasourceConfigCache;
import com.zhj.datasource.datasource.DatasourceConfigContextHolder;
import com.zhj.datasource.mapper.DatasourceConfigMapper;
import com.zhj.datasource.model.DatasourceConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class SpringBootHJDemoDynamicDatasourceApplication implements CommandLineRunner {
    private final DatasourceConfigMapper configMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHJDemoDynamicDatasourceApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // 设置默认的数据源
        DatasourceConfigContextHolder.setDefaultDatasource();
        // 查询所有数据库配置列表
        List<DatasourceConfig> datasourceConfigs = configMapper.selectAll();
        System.out.println("加载其余数据源配置列表: " + datasourceConfigs);
        // 将数据库配置加入缓存
        datasourceConfigs.forEach(config -> DatasourceConfigCache.INSTANCE.addConfig(config.getId(), config));
    }
}
