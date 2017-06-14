package com.hm.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.hm.test.model.ResultEntity;
import com.hm.test.model.ResultRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ResultRepository results;

    @Test
    public void testFindByLastName() {
        ResultEntity entity = new ResultEntity("first", 3, "last");
        entityManager.persist(entity);

        List<ResultEntity> findByLastName = results.findByTimeEstimate(entity.getTimeEstimate());

        assertThat(findByLastName).extracting(ResultEntity::getTimeEstimate).containsOnly(entity.getTimeEstimate());
    }
}
