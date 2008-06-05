/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.maps.client.impl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.maps.client.geocode.GeocodeCache;
import com.google.gwt.maps.jsio.client.Global;
import com.google.gwt.maps.jsio.client.Imported;
import com.google.gwt.maps.jsio.client.JSWrapper;

/**
 * 
 */
@Global("$wnd.GGeocodeCache.prototype")
public interface GeocodeCachePrototype extends JSWrapper<GeocodeCachePrototype> {

  GeocodeCachePrototype impl = GWT.create(GeocodeCachePrototype.class);

  @Imported
  JavaScriptObject get(GeocodeCache instance, String address);

  @Imported
  boolean isCachable(GeocodeCache instance, JavaScriptObject reply);

  @Imported
  void put(GeocodeCache instance, String address, JavaScriptObject reply);

  @Imported
  void reset(GeocodeCache instance);

  @Imported
  String toCanonical(GeocodeCache instance, String address);
}