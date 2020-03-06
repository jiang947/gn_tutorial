package com.jsq.jni.sample;

import org.chromium.base.annotations.JNINamespace;
import org.chromium.base.annotations.NativeMethods;


@JNINamespace("test")
public class Hello {

    static {
        System.loadLibrary("hello_jni_lib");
    }

    private long mNativePtr;

    public Hello() {
        mNativePtr = HelloJni.get().init();
    }


    public static String getString(){
        return HelloJni.get().getString();
    }

    // public static native String nativeGetString();
    // public native long nativeInit();


    @NativeMethods
    interface Natives {
        long init();

        String getString();
    }

}

