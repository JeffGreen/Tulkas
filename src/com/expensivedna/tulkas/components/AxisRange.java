package com.expensivedna.tulkas.components;

import java.text.NumberFormat;

/**
 * The range (Y) axis.
 *
 * @author jeffrey.n.green --AT-- gmail.com
 * @see AxisDomain
 */
class AxisRange {

    private boolean visible = true;
    private boolean autoAdjust = true;
    private float max, min;
    private NumberFormat textFormat = NumberFormat.getInstance();

}
