package com.zhj.ureport.config;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;

@Component
public class InnerDatasource implements BuildinDatasource {
    @Autowired
    private DataSource datasource;

    @Override
    public String name() {
        return "内部数据源";
    }

    @SneakyThrows
    @Override
    public Connection getConnection() {
        return datasource.getConnection();
    }
}

