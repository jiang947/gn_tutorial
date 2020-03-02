
#include "hello.h"

#include "base/android/jni_android.h"
#include "base/android/jni_string.h"
#include "base/android/scoped_java_ref.h"

using base::android::ConvertUTF8ToJavaString;
using base::android::ScopedJavaLocalRef;

namespace base {
namespace android {

Hello::Hello() {

}

Hello::~Hello(){

}

ScopedJavaLocalRef<jstring> Hello::getStringFormNative(
    JNIEnv* env) {
  return ConvertUTF8ToJavaString(env, "test");
}

// static jlong JNI_Hello_Init(JNIEnv* env) {
//     return 0;
// }

} // android
} // base


