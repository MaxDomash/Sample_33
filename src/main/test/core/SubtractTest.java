package core;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

public class SubtractTest {
    @Test
    public void subtract_test_instanceOf(){
        assertThat(Calculator.subtract(2,2), instanceOf(Double.class));
    }

    @Test
    public void subtract_test_2_instanceOf(){
        assertThat(Calculator.subtract(2,2), equalTo(0.0));
    }

    @Test
    public void subtract_test_3_instanceOf(){
        assertThat(Calculator.subtract(20,2,2), equalTo(16.0));
    }

    @Test
    public void subtract_test_4_instanceOf(){
        assertThat(Calculator.subtract(20,2,2,2), equalTo(14.0));
    }
}
