package com.avsystem.scex.compiler

import scala.reflect.internal.util.BatchSourceFile

/**
 * Created: 28-10-2014
 * Author: ghik
 */
class ScexSourceFile(name: String, contents: String, val shared: Boolean)
  extends BatchSourceFile(name, contents)
