package practice.spring_boot_prac.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect //aop로 쓰겠다는 뜻
@Component //스프링 빈으로 등록
public class TimeTraceAop {

  @Around("execution(* practice.spring_boot_prac..*(..))") //어디서 적용될 지
  public Object excute(ProceedingJoinPoint joinPoint) throws Throwable{
    long start = System.currentTimeMillis();
    System.out.println("START: " + joinPoint.toString());
    try{
      return joinPoint.proceed(); //다음 메소드로 진행
    }finally {
      long finish = System.currentTimeMillis();
      long timeMs = finish - start;
      System.out.println("END: " + joinPoint.toString() + " " + timeMs + "ms");
    }

  }
}
