package com.sample.mapper.orika;

import com.sample.dto.SampleDTO;
import com.sample.entity.SampleEntity;
import com.sample.mapper.modelmapper.ModelMapperSampleMapper;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by crequena on 13/09/2016.
 */
public class OrikaSampleMapperTest {

    @Test
    public void testMapEntityToDTO() throws Exception {
        //given
        SampleEntity sampleEntity = new SampleEntity(1, "FirstName", "LastName", "sample@email.com");
        //when
        OrikaSampleMapper orikaSampleMapper = new OrikaSampleMapper();
        SampleDTO sampleDTO = orikaSampleMapper.mapEntityToDTO(sampleEntity);
        //then
        assertTrue(sampleDTO!=null);
    }

    @Test
    public void testMapDTOToEntity() throws Exception {
        //given
        SampleDTO sampleDTO = new SampleDTO(1, "FirstName", "LastName", "sample@email.com");
        //when
        OrikaSampleMapper orikaSampleMapper = new OrikaSampleMapper();
        SampleEntity sampleEntity = orikaSampleMapper.mapDTOToEntity(sampleDTO);
        //then
        assertTrue(sampleEntity!=null);
    }
}
