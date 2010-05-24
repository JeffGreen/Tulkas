package com.expensivedna.tulkas.components;

import com.expensivedna.tulkas.FloatTimeSeries;
import com.expensivedna.tulkas.TimeSeriesListener;
import org.apache.log4j.Logger;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jeffrey.n.green --AT-- gmail.com
 */
public class Chart implements TimeSeriesListener {

    private static final Logger log = Logger.getLogger(Chart.class);

    private AxisDomain domainAxis;
    private AxisRange rangeAxis;

    private List<FloatTimeSeries> seriesList = new ArrayList<FloatTimeSeries>();

    private Legend legend;

    private boolean antiAlias = false;
    private Color backgroundColor = Color.WHITE;

    public Chart() {
        this.domainAxis = new AxisDomain();
        this.rangeAxis = new AxisRange();
        this.legend = new Legend();
    }


    public void addSeries(FloatTimeSeries series) {
        seriesList.add(series);
        series.addListener(this);
    }


    public void removeSeries(FloatTimeSeries series) {
        series.removeListener(this);
    }


    public void pointAdded(long time, float value, FloatTimeSeries series) {
        log.debug("point added");
    }


    public Color getBackgroundColor() {
        return backgroundColor;
    }


}
