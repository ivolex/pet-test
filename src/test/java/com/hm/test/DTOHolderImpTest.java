package com.hm.test;

import com.hm.test.model.DTOHolder;
import com.hm.test.model.ResultRepository;
import com.hm.test.model.dto.DTOEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DTOHolderImpTest {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
    private List<Integer> testDTOData = Arrays.asList(32, 17, 12345, 023, 456, 78);

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ResultRepository results;

    @Autowired
    private DTOHolder holder;

    @Test
    public void givenDTOEntityWhenAddNewThenNewHMEntityPersisted() {
        DTOEntity dto = new DTOEntity();
        LocalDateTime currentTime = LocalDateTime.now();
        String timestam = currentTime.format(formatter);
        dto.setTimestamp(timestam);
        dto.setInput(testDTOData);

        holder.addNew(dto);

        assert

    }
}
