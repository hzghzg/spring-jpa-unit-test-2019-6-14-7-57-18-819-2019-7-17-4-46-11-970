package com.oocl.web.sampleWebApp.jpaSample.repository;

import com.oocl.web.sampleWebApp.jpaSample.entity.RelatedEntity;
import com.sun.org.apache.bcel.internal.generic.LLOAD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RelatedEntityRepository extends JpaRepository<RelatedEntity, Long> {
}
