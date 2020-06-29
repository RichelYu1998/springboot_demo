package cn.tedu.pj.common.pool;

import cn.tedu.pj.common.datasource.ObjectPool;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
