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
 * on 2023-08-04 at 10:37:20 UTC 
 * Modify at your own risk.
 */

package com.uwetrottmann.seriesguide.backend.episodes.model;

/**
 * Model definition for SgCloudEpisodeList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the episodes. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SgCloudEpisodeList extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cursor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SgCloudEpisode> episodes;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer showTmdbId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCursor() {
    return cursor;
  }

  /**
   * @param cursor cursor or {@code null} for none
   */
  public SgCloudEpisodeList setCursor(java.lang.String cursor) {
    this.cursor = cursor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SgCloudEpisode> getEpisodes() {
    return episodes;
  }

  /**
   * @param episodes episodes or {@code null} for none
   */
  public SgCloudEpisodeList setEpisodes(java.util.List<SgCloudEpisode> episodes) {
    this.episodes = episodes;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getShowTmdbId() {
    return showTmdbId;
  }

  /**
   * @param showTmdbId showTmdbId or {@code null} for none
   */
  public SgCloudEpisodeList setShowTmdbId(java.lang.Integer showTmdbId) {
    this.showTmdbId = showTmdbId;
    return this;
  }

  @Override
  public SgCloudEpisodeList set(String fieldName, Object value) {
    return (SgCloudEpisodeList) super.set(fieldName, value);
  }

  @Override
  public SgCloudEpisodeList clone() {
    return (SgCloudEpisodeList) super.clone();
  }

}