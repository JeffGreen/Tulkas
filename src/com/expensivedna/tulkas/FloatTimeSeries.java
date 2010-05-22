package com.expensivedna.tulkas;

import gnu.trove.TFloatArrayList;
import gnu.trove.TLongArrayList;

/**
 * @author jeffrey.n.green --AT-- gmail.com
 */
public class FloatTimeSeries {


    private TFloatArrayList values;
    private TLongArrayList times;

    /**
     * Creates a new, empty FloatTimeSeries.
     */
    public FloatTimeSeries() {
        values = new TFloatArrayList();
        times = new TLongArrayList();
    }

    /**
     * Adds the (time, value) pair to this time series.  The time parameter must be greater than or equal to the largest
     * time value previously added to this list (IE pairs must be added in chronological order).
     *
     * @param time  the time to be added.
     * @param value the value to be added.
     * @return true if the (time, value) pair was successfully added, false if not.
     */
    public boolean add(long time, float value) {
        int size = times.size();
        if (size > 0 && time > times.get(size - 1)) {
            //log warning
            return false;
        }

        times.add(time);
        values.add(value);
        return true;
    }


}
