package com.blogspot.pdrobushevich.pipeline.sequential;

import com.blogspot.pdrobushevich.pipeline.AbstractFlowBuilder;
import com.blogspot.pdrobushevich.pipeline.AbstractFlowTest;

public class FlowTest extends AbstractFlowTest {

    @Override
    protected AbstractFlowBuilder builder() {
        return Flow.builder();
    }

}
