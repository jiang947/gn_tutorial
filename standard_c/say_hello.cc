// Copyright 2013 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// 相对路径，相对于BUILD.gn的路径
#include "hello.h"

int main() {
#if defined(TWO_PEOPLE)
  Hello("Bill", "Joy");
#else
  Hello("everyone");
#endif
  return 0;
}
