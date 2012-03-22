package com.wpalmeri;

import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.rest.ProcessedAPIRequest;
import com.stackmob.core.rest.ResponseToProcess;
import com.stackmob.sdkapi.SDKServiceProvider;
import org.jboss.netty.handler.codec.http.HttpResponseStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This CustomCodeMethod returns a null list of params.
 * @author milesoconnell
 */
public class HelloWorld implements CustomCodeMethod {

  @Override
  public String getMethodName() {
    return "hello_world";
  }

  @Override
  public List<String> getParams() {
    return null;
  }

  @Override
  public ResponseToProcess execute(ProcessedAPIRequest request, SDKServiceProvider provider) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("text", "Hello, World!");
    return new ResponseToProcess(HttpResponseStatus.OK.getCode(), map);
  }
}
