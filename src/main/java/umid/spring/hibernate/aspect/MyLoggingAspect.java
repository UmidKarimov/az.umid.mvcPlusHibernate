package umid.spring.hibernate.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
@Aspect
public class MyLoggingAspect {

    @Around("execution(* umid.spring.hibernate.dao.*.*(..))")
    public Object allRepositoryAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        System.out.println("Begin of " + methodSignature.getName());
        Object object = proceedingJoinPoint.proceed();
        System.out.println("End of "+methodSignature.getName());

        return object;

    }
}
