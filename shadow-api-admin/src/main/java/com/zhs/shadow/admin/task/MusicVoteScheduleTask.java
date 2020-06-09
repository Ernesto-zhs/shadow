package com.zhs.shadow.admin.task;

import com.zhs.shadow.service.music.write.MusicVoteWriteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Austin
 * 主要用于标记配置类，兼备Component的效果
 * 开启定时任务
 */
@Configuration
@EnableScheduling
public class MusicVoteScheduleTask {

    /**
     * 日志记录器
     */
    private Logger logger = LoggerFactory.getLogger(MusicVoteScheduleTask.class);

    @Autowired
    private MusicVoteWriteService musicVoteWriteService;

    /**
     * 定时任务
     * cron表达式  @Scheduled(cron = "* * * 10 * ?")
     * 指定时间间隔 @Scheduled(fixedRate=5000)
     * @throws Exception
     */
    @Scheduled(cron = "* * * 10 * ?")
    private void configureTasks() throws Exception {
        logger.info("定时任务开始");
        // musicVoteWriteService.refreshData();
        logger.info("定时任务结束");
    }
}