package com.mycompany.sertest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import com.mycompany.sertest.common.PerformanceTestBase;
import com.mycompany.sertest.dto.SimpleDataObject;

/**
 *
 * @author nirro
 */
public class SmileTest extends PerformanceTestBase
{
    private final ObjectMapper mapper = new ObjectMapper(new SmileFactory());

    @Override
    public byte[] serialize(SimpleDataObject object) throws Exception
    {
        return mapper.writeValueAsBytes(object);
    }

    @Override
    public SimpleDataObject deserialize(byte[] data) throws Exception
    {
        return mapper.readValue(data, SimpleDataObject.class);
    }
}
