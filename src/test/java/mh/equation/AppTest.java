package mh.equation;

import net.objecthunter.exp4j.ExpressionBuilder;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;

public class AppTest  {

    //2i+1,2i+2
    //0:23:07.860
    @Test
    public void testEquastion() throws Exception {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for(int i=0; i<1_000_000_000; i++){
            double result = new ExpressionBuilder("e^(log(sin(pi)))").build().evaluate();
            //System.out.println(result);
        }

        stopWatch.stop();

        System.out.println(stopWatch);
    }

    @Test
    public void testI() throws Exception {

        double result = new ExpressionBuilder("sqrt(-1)").build().evaluate();

        System.out.println(result);

    }

}
