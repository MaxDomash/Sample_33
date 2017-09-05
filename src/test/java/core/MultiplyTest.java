package core;

import core.Calculator;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

public class MultiplyTest {

    @Test
    public void multiply_test_instanceOf(){
        assertThat(Calculator.multiply(2,2), instanceOf(Double.class));
    }

    @Test
    public void multiply_test_2_param(){
        assertThat(Calculator.multiply(2,2), equalTo(4.0));
    }

    @Test
    public void multiply_test_3_param(){
        assertThat(Calculator.multiply(2,2,2), equalTo(8.0));
    }

    @Test
    public void multiply_test_4_param(){
        assertThat(Calculator.multiply(2,2,2,2), equalTo(16.0));
    }
}
