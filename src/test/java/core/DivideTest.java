package core;

import core.Calculator;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.instanceOf;

public class DivideTest {

    @Test
    public void divide_test_instanceOf(){
        assertThat(Calculator.devide(2,2), instanceOf(Double.class));
    }

    @Test
    public void divide_test_2_param(){
        assertThat(Calculator.devide(2,10), closeTo(1.0,0.9));
    }

    @Test
    public void divide_test_3_param(){
        assertThat(Calculator.devide(200,2, 20), closeTo(5,0.9));
    }

    @Test
    public void divide_test_4_param(){
        assertThat(Calculator.devide(249,2,1,100), closeTo(2,0.9));
    }
}
