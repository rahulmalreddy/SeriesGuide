/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 1969-12-31 23:59:59 UTC)
 * on 2023-08-04 at 10:37:28 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.backend.shows.model;

/**
 * Model definition for ShowList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the shows. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShowList extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cursor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Show> shows;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCursor() {
    return cursor;
  }

  /**
   * @param cursor cursor or {@code null} for none
   */
  public ShowList setCursor(java.lang.String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Show> getShows() {
    return shows;
  }

  /**
   * @param shows shows or {@code null} for none
   */
  public ShowList setShows(java.util.List<Show> shows) {
    this.shows = shows;
    return this;
  }

  @Override
  public ShowList set(String fieldName, Object value) {
    return (ShowList) super.set(fieldName, value);
  }

  @Override
  public ShowList clone() {
    return (ShowList) super.clone();
  }

}
