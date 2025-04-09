package com.shadow.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.IDbQuery;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;

/**
 * 配置类
 *
 * @author Austin
 */
public class Config {

    private static final String AUTHOR = "zhs";
    private static final String DB_URL = "jdbc:mysql://192.168.180.12:3306/kte_tms?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Kte2021@";
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final IDbQuery DB_QUERY = new MySqlQuery();
    private static final String PARENT_PACKAGE = "com.kte.ntms";

    public static GlobalConfig getGlobalConfig() {
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/shadow-generate/src/main/java");
        gc.setAuthor(AUTHOR);
        gc.setOpen(false);
        gc.setSwagger2(true);
        gc.setServiceName("I%sService");
        gc.setServiceImplName("%sService");
        gc.setEntityName("%s");
        gc.setMapperName("%sMapper");
        gc.setControllerName("%sController");
        gc.setXmlName("%sMapper");
        return gc;
    }

    public static DataSourceConfig getDataSourceConfig() {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(DB_URL);
        dsc.setUsername(DB_USERNAME);
        dsc.setPassword(DB_PASSWORD);
        dsc.setDriverName(DB_DRIVER);
        dsc.setDbType(DbType.MYSQL);
        dsc.setDbQuery(DB_QUERY);
        return dsc;
    }

    public static PackageConfig getPackageConfig() {
        PackageConfig pc = new PackageConfig();
        pc.setParent(PARENT_PACKAGE);
        pc.setEntity("entity");
        pc.setXml("");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setServiceImpl("service");
        pc.setController(".controller");
        return pc;
    }
}
