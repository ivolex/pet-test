package com.hm.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import com.hm.test.model.HMEntity;
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
    public void testFindAll(){
        HMEntity entity1 = new HMEntity("first", "first");
        HMEntity entity2 = new HMEntity("second", "second");
        HMEntity entity3 = new HMEntity("last", "last");

        entityManager.persist(entity1);
        entityManager.persist(entity2);
        entityManager.persist(entity3);

        List<HMEntity> entities = (List<HMEntity>) results.findAll();

        assertThat(entities).isNotEmpty();
        assertThat(entities).contains(entity1);
        assertThat(entities).contains(entity2);
        assertThat(entities).contains(entity3);
    }
}
