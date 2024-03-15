package org.example.aspect;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.example.entity.Logger;
import org.example.service.LoggerService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class Myaspect {
    private final LoggerService loggerService;
    @Around(value = "@annotation(org.example.aspect.MyLogger)")
    public Object myLog(ProceedingJoinPoint joinPoint) throws Throwable {
        String answer=(String) joinPoint.proceed();
        String request= Arrays.stream(joinPoint.getArgs()).map(Object::toString).collect(Collectors.joining(","));
        Logger logger=new Logger(null,request,answer, LocalDateTime.now());
        loggerService.log(logger);
        log.info("1-{}\n2-{}",joinPoint.getArgs(),answer);

        return answer;
    }
}
