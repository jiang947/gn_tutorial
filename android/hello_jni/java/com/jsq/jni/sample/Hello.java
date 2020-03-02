package com.jsq.jni.sample;

import org.chromium.base.annotations.JNINamespace;

import org.chromium.base.annotations.NativeMethods;


@JNINamespace("base::android")
public class Hello {

    long mNativeHelloObject;

    public Hello(){
        mNativeHelloObject = HelloJni.get().init();
    }

    public String getStringFormJni(){
        return HelloJni.get().getStringFormNative(mNativeHelloObject);
    }


    @NativeMethods
    interface Natives {
        
        long init();

        String getStringFormNative(long nativeHelloObject);

    }

}

