
#include "hello.h"

#include "gn_tutorial/android/hello_aar/hello_jni_header/Hello_jni.h"

#include "base/android/jni_android.h"
#include "base/android/jni_string.h"
#include "base/android/scoped_java_ref.h"

using base::android::ConvertUTF8ToJavaString;
using base::android::ScopedJavaLocalRef;
using base::android::JavaParamRef;

namespace test {
namespace {

Hello::Hello() {

}

Hello::~Hello(){

}




// static jlong JNI_AwContents_Init(JNIEnv* env, jlong browser_context_pointer) {

} // end namespace 

// static jlong JNI_Hello_Init(JNIEnv* env){
//   return 0;
// }

static ScopedJavaLocalRef<jstring> JNI_Hello_GetString(JNIEnv* env) {
  return ConvertUTF8ToJavaString(env, "test");
}


} // namespace test




// ScopedJavaLocalRef<jstring> GetString(JNIEnv* env, const JavaParamRef<jobject>& obj) {
//   return ConvertUTF8ToJavaString(env, "test");
// }



