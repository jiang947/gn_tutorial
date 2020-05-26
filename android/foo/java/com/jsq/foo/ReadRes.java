package com.jsq.foo;

import android.content.res.Resources;
import com.jsq.foo.res.R;

public class ReadRes {

    public static int getMinScreenWidthBucket(Resources res) {
        return res.getInteger(R.integer.min_screen_width_bucket);
    }
}
