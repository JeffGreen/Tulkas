package com.expensivedna.tulkas;

/**
 * @author jeffrey.n.green --AT-- gmail.com
 */
public interface TimeSeriesListener {

    public void pointAdded(long time, float value, FloatTimeSeries series);

}
