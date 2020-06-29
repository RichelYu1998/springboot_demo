package cn.tedu.pj.common.pool;

import cn.tedu.pj.common.datasource.ObjectPool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootTest
public class ObjectPoolTests {
    @Autowired
    private ObjectPool objectPool01;
    @Autowired
    private ObjectPool objectPool02;
    @Test
    void testObjectTest(){
        System.out.println(objectPool01==objectPool02);
    }
    @PostConstruct//用来初始化生命周期
    public void init(){
        System.out.println("init()");
    }
    @PreDestroy//用来销毁生命周期
    public void destroy(){
        System.out.println("destroy()");
    }
}
