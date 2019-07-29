package com.codepath.apps.restclienttemplate.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Tweet {
  public String body,createdAt;
  public  long uid;
  public User user;
  public static Tweet fromJaon(JSONObject jsonObject) throws JSONException {
      Tweet tweet = new Tweet();
      tweet.body = jsonObject.getString("text");
      tweet.createdAt = jsonObject.getString("created_at");
      tweet.uid = jsonObject.getLong("id");
      tweet.user = User.fromJson(jsonObject.getJSONObject("user")) ;
      return tweet;
  }
}
