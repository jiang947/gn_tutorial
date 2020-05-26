package com.jsq.bar;

import android.content.res.Resources;
import android.content.res.Resources;

import com.jsq.bar.R;

import com.jsq.foo.ReadRes;

public class ReadResWapper {

    public static int getMinScreenWidthBucket(Resources res) {
        return ReadRes.getMinScreenWidthBucket(res);
    }


    public static int getTestValue(Resources res){
        return res.getInteger(R.integer.test);
    }


}
