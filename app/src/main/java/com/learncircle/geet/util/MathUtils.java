package com.learncircle.geet.util;

/**
 * Created by Geet on 07-10-2016.
 */
public class MathUtils {

    private MathUtils() { }

    public static float constrain(float min, float max, float v) {
        return Math.max(min, Math.min(max, v));
    }
}
