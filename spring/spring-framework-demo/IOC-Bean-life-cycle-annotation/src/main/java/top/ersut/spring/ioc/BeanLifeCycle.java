package top.ersut.spring.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifeCycle {

    public BeanLifeCycle() {
        System.out.println("1. Bean实例化（调用类的构造方法）");
    }

    private String str;

    @Value("wang")
    public void setStr(String str) {
        System.out.println("2. 注入属性（DI）");
        this.str = str;
    }

    @PostConstruct
    public void init(){
        System.out.println("4. 调用自定义初始化方法");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("7. 上下文销毁时，调用自定义销毁方法");
    }
}
