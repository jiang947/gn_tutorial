
//tools_gn/tutorial/android/hello_jni/jni/hello_jni.h
#ifndef HELLO_JNI_JNI_HELLO_H_
#define HELLO_JNI_JNI_HELLO_H_

#include <jni.h>
#include <map>
#include <string>

#include "base/android/jni_android.h"

namespace test {
namespace {

class Hello {
    public:
    Hello();
    ~Hello();

    // base::android::ScopedJavaLocalRef<jstring> GetString(JNIEnv* env);


};


} // namespace android
} // namespace base



#endif  // HELLO_JNI_JNI_HELLO_JNI_H_