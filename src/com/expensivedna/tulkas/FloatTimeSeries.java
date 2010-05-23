package com.expensivedna.tulkas;

import gnu.trove.TFloatArrayList;
import gnu.trove.TLongArrayList;
import org.apache.log4j.Logger;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jeffrey.n.green --AT-- gmail.com
 */
public class FloatTimeSeries {

    private static final Logger log = Logger.getLogger(FloatTimeSeries.class);

    private Shape marker = new Rectangle2D.Float(0, 0, 1, 1);
    private Stroke stroke = new BasicStroke(1);
    private String name;
    private boolean visible = true;

    private TFloatArrayList values;
    private TLongArrayList times;

    private List<TimeSeriesListener> listeners = new ArrayList<TimeSeriesListener>();

    /**
     * Creates a new, empty FloatTimeSeries.
     */
    public FloatTimeSeries() {
        values = new TFloatArrayList();
        times = new TLongArrayList();
    }


    /**
     * Adds the (time, value) pair to this time series.  The time parameter must be greater than or equal to the largest
     * time value previously added to this list (I.E. pairs must be added in chronological order).
     *
     * @param time  the time to be added.
     * @param value the value to be added.
     * @return true if the (time, value) pair was successfully added, false if not.
     */
    public boolean addPoint(long time, float value) {
        int size = times.size();
        if (size > 0 && time > times.get(size - 1)) {
            log.warn("Attempted to add dates out of chronological order.");
            return false;
        }

        times.add(time);
        values.add(value);
        for (TimeSeriesListener listener : listeners) listener.pointAdded(time, value, this);

        return true;
    }


    public void addListener(TimeSeriesListener listener) {
        listeners.add(listener);
    }


    public void removeListener(TimeSeriesListener listener) {
        listeners.remove(listener);
    }

    public String toString() {
        return name == null ? super.toString() : name;
    }


}
