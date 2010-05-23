package com.expensivedna.tulkas.components;

/**
 * @author jeffrey.n.green --AT-- gmail.com
 */
class Legend {

    private boolean visible = true;
    private Location location;

    public static enum Location {
        NORTH, SOUTH, EAST, WEST
    }

}


//TODO do we want "floating" locations that snap in place to allow the legend to partially occlude the graph?