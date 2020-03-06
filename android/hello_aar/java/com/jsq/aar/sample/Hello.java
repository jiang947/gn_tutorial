package com.jsq.aar.sample;

import org.chromium.base.annotations.JNINamespace;

import org.chromium.base.annotations.NativeMethods;


@JNINamespace("base::android")
public class Hello {

    public static String getStringFormJni(){
        return HelloJni.get().getStringFormNative();
    }


    @NativeMethods
    interface Natives {
        
        String getStringFormNative();

    }

}

