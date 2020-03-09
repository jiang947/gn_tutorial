package com.jsq.aar.sample;

import org.chromium.base.annotations.JNINamespace;

import org.chromium.base.annotations.NativeMethods;


@JNINamespace("test")
public class Hello {

    static {
        System.loadLibrary("hello_aar_shared_lib");
    }

    // private long mNativePtr;

    public Hello() {
        // mNativePtr = HelloJni.get().init();
    }


    public static String getStr(){
        return HelloJni.get().getString();
        // return nativeGetString();
    }

    public static native String nativeGetString();
    // public native long nativeInit();

    // static native String getString();

    @NativeMethods
    interface Natives {
        // long init();

        String getString();
    }

}
