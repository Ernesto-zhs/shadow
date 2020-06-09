package com.shadow.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.IDbQuery;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.querys.MySqlQuery;

/**
 * 配置类
 * @author Austin
 */
public class Config {

    private final static String AUTHOR = "zhs";
    private final static String DB_URL = "jdbc:mysql://localhost:3306/shadow?useUnicode=true&useSSL=false&characterEncoding=utf8";
    private final static String DB_USERNAME = "root";
    private final static String DB_PASSWORD = "Hs123456";
    private final static String DB_DRIVER = "com.mysql.jdbc.Driver";
    private final static IDbQuery DB_QUERY = new MySqlQuery();
    private final static String PARENT_PACKAGE = "com.zhs.shadow";

    public static GlobalConfig getGlobalConfig(String writeOrRead) {
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/shadow-generate/src/main/java");
        gc.setAuthor(AUTHOR);
        gc.setOpen(false);
        gc.setSwagger2(false);
        gc.setServiceName("%s" + writeOrRead + "Service");
        gc.setServiceImplName("%s" + writeOrRead + "ServiceImpl");
        gc.setEntityName("%sEntity");
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

    public static PackageConfig getPackageConfig(String moduleName, String featuresName, String writeOrRead) {
        if (StringUtils.isBlank(featuresName)) {
            featuresName = "";
        } else {
            featuresName = "." + featuresName;
        }
        if (StringUtils.isNotBlank(writeOrRead)) {
            if ("Read".equals(writeOrRead)) {
                writeOrRead = ".read";
            } else if ("Write".equals(writeOrRead)) {
                writeOrRead = ".write";
            }
        } else {
            writeOrRead = "";
        }
        PackageConfig pc = new PackageConfig();
        pc.setParent(PARENT_PACKAGE);
        pc.setEntity("domain.entity" + featuresName);
        pc.setXml("dao.mapper.xml");
        pc.setMapper("dao.mapper");
        pc.setService("service" + featuresName + writeOrRead);
        pc.setServiceImpl("service" + featuresName + writeOrRead + ".impl");
        pc.setController(moduleName + ".controller" + featuresName);
        return pc;
    }
}
