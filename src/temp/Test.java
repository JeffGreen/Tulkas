package temp;

import com.expensivedna.tulkas.FloatTimeSeries;
import com.expensivedna.tulkas.components.Chart;

public class Test {

    public static void main(String[] args) {
        FloatTimeSeries series1 = new FloatTimeSeries();
        FloatTimeSeries series2 = new FloatTimeSeries();

        series1.addPoint(0, .5f);
        series2.addPoint(0, -.5f);
        for (int i = 1; i < 1000; i++) {
            series1.addPoint(i * 1000, series1.getValue(series1.size() - 1) * (float) Math.random());
            series2.addPoint(i * 1000, series1.getValue(series1.size() - 1) * (float) Math.random());
        }

        Chart chart = new Chart();


    }

}