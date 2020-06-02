package com.zhs.shadow.admin.component;

import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.zhs.shadow.common.annotation.SystemControllerLog;
import com.zhs.shadow.common.util.IpUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Title: SystemControllerLog
 * @version V1.0
 * Description: 切点类
 * @date 2018年8月31日
 * @author Austin
 */
@Aspect
@Component
public class SystemLogAspect {

    public SystemLogAspect() {
        logger.info("生成该对象");
    }

    //注入Service用于把日志保存数据库，实际项目入库采用队列做异步
//    @Resource
//    private ActionService actionService;
    //本地异常日志记录对象
    private static final Logger logger = LoggerFactory.getLogger(SystemLogAspect.class);

    //Controller层切点
    @Pointcut("@annotation(com.zhs.shadow.admin.annotation.SystemControllerLog)")
    public void controllerAspect() {
    }

    /**
     * @Description 前置通知  用于拦截Controller层记录用户的操作
     * @date 2018年9月3日 10:38
     */

    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        //读取session中的用户
//        User user = (User) session.getAttribute("user");

        String ip = IpUtils.getIpAddr(request);

        try {
            //*========控制台输出=========*//
            System.out.println("==============前置通知开始==============");
            System.out.println("请求方法" + (joinPoint.getTarget().getClass().getName() + "." + joinPoint.getSignature().getName()));
            System.out.println("方法描述：" + getControllerMethodDescription(joinPoint));
//            System.out.println("请求人：" + user.getUsername());
            System.out.println("请求ip：" + ip);

            //*========数据库日志=========*//
//            Action action = new Action();
//            action.setActionDes(getControllerMethodDescription(joinPoint));
//            action.setActionType("0");
//            action.setActionIp(ip);
//            action.setUserId(user.getId());
//            action.setActionTime(new Date());
//            //保存数据库
//            actionService.add(action);

        } catch (Exception e) {
            //记录本地异常日志
            logger.error("==前置通知异常==");
            logger.error("异常信息：{}", e.getMessage());
        }
    }

    /**
     * @Description 获取注解中对方法的描述信息 用于Controller层注解
     * @date 2018年9月3日 上午12:01
     */
    public static String getControllerMethodDescription(JoinPoint joinPoint) throws Exception {
        String targetName = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();//目标方法名
        Object[] arguments = joinPoint.getArgs();
        Class targetClass = Class.forName(targetName);
        Method[] methods = targetClass.getMethods();
        String description = "";
        for (Method method : methods) {
            if (method.getName().equals(methodName)) {
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == arguments.length) {
                    description = method.getAnnotation(SystemControllerLog.class).description();
                    break;
                }
            }
        }
        return description;
    }
}