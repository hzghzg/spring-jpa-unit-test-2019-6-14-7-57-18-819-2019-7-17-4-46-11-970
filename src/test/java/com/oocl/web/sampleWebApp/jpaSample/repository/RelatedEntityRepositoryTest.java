package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.RelatedEntity;
import com.oocl.web.sampleWebApp.jpaSample.entity.SingleEntity;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RelatedEntityRepositoryTest {
    @Autowired
    private SingleEntityRepository singleEntityRepository;
    @Autowired
    private RelatedEntityRepository relatedEntityRepository;
    @Test
    public void should_return_singleentity_when_save_the_relatedentity_given_a_relateentity() {
        //given
        SingleEntity singleEntity=new SingleEntity();
        singleEntity.setName("entity1");
        RelatedEntity relatedEntity=new RelatedEntity();
        relatedEntity.setName("relatedentity1");
        relatedEntity.setSingleEntity(singleEntity);

        //when
        relatedEntityRepository.save(relatedEntity);
        //then
        Assertions.assertEquals(singleEntity.getName(),singleEntityRepository.findAll().get(0).getName());
    }
}