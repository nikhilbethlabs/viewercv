/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.opencv.jni;

public class opencv {

    /** adds a yuv
    	* @param idx the index in the pool that is associated with a cv::Mat
      */
    public static void addYUVtoPool(image_pool pool, byte[] data, int idx, int width, int height, boolean grey) {
        opencvJNI.addYUVtoPool(image_pool.getCPtr(pool), pool, data, idx, width, height, grey);
    }

}
