package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SingleEntityRepositoryTest {
    @Autowired
    private SingleEntityRepository singleEntityRepository;

    @Test
    public void test_should_return_user_when_the_user_exist() {
        //given
        SingleEntity singleEntity=new SingleEntity("hzg");
        singleEntityRepository.save(singleEntity);
        //when
        List<SingleEntity> singleEntityList=singleEntityRepository.findAll();
        //then
        Assertions.assertEquals(1,singleEntityList.size());
        Assertions.assertEquals("hzg",singleEntityList.get(0).getName());

    }
}