package cn.tedu.pj.common.datasource;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 设置如下对象为一个池对象
 * Q Spring管理bean对象,会为bean赋予什么特性? 这些特性有什么好处
 * A
 * 1)延迟加载(按需加载,懒加载)特性-暂缓对象的创建?
 * a)优点 可以优化资源的使用
 * b)缺点 用时再创建可能会导致响应速度降低
 * c)场景 资源有限,大对象,稀少用懒加载则懒加载
 * d)实现 在需要懒加载的对象类型上使用@Lazy注解进行描述
 * 2)作用域(spring框架为对象提供的作用范围，对象的生命周期只可以在指定范围内有效)
 * a)优点:让对象在有效范围发挥作用，尽量控制对象的创建和销毁以保证对象的高效，低耗
 * b)缺点:框架底层难度会加大，应用不熟练会导致作用域冲突
 * c)场景:不同的业务作用域的设计也不同
 * d)实现:在需要设定作用域的类上使用@Scope注解进行描述
 * d.1)Scope("singleton")单例作用域，这个内存只有一份，通过共享设计(池)，
 * 实现对象的可重用性。此对于何时创建由懒加载(lazy)特性设计决定，是否可以
 * 被销毁由spring框架决定(一般是在容器销毁时销毁)
 *
 * d.2)@Scope("prototype")多作用域。此作用域的对象在需要时创建，
 * 每次从容器获取都是新的对象。但是spring框架不负责销毁,适合应用频度比较低的对象
 */

@Component
@Lazy
/*@Scope("singleton")默认就是singleton作用域*/
/*@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)*/
@Scope("prototype")
public class ObjectPool {
    public ObjectPool(){
        System.out.println("==ObjectPool()==");
    }
}
//程序的终极目标：高效，低耗