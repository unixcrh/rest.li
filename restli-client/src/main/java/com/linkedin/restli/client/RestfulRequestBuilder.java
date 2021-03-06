/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 *
 */
package com.linkedin.restli.client;

import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.common.ResourceSpec;

/**
 * @author adubman
 *
 */
public abstract class RestfulRequestBuilder<K, V extends RecordTemplate, R extends Request<?>> extends
    AbstractRequestBuilder<K, V, R>
{

  protected RestfulRequestBuilder(String baseURITemplate, ResourceSpec resourceSpec)
  {
    super(baseURITemplate, resourceSpec);
  }

  /**
   * Note that this method overrides the value at the given key, rather than adds to the
   * collection of values for it.
   */
  public RestfulRequestBuilder<K, V, R> param(String key, Object value)
  {
    super.addParam(key, value);
    return this;
  }

  /**
   * Note that this method overrides the value at the given key, rather than adds to the
   * collection of values for it.
   */
  public RestfulRequestBuilder<K, V, R> reqParam(String key, Object value)
  {
    addReqParam(key, value);
    return this;
  }

}
