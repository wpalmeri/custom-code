/**
 * Copyright 2010 StackMob Inc.
 * 
 * EntryPointExtender.java
 * 
 * @author Miles O'Connell  <miles@stackmob.com>
 * 
 *         StackMob         <http://www.stackmob.com>
 * 
 */
package com.wpalmeri;

import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.jar.JarEntryObject;

import java.util.ArrayList;
import java.util.List;

//import com.dummyclient.clojure.Hello;

/**
 * @author milesoconnell
 *
 */
public class EntryPointExtender extends JarEntryObject {
  
  @Override
  public List<CustomCodeMethod> methods() {
    List<CustomCodeMethod> list = new ArrayList<CustomCodeMethod>();
    list.add(new HelloWorld());
    return list;
  }
}
