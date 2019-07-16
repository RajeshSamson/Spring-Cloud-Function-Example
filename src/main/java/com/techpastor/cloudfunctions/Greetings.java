package com.techpastor.cloudfunctions;

import java.util.function.Function;

public class Greetings implements Function<String, String> {

  @Override
  public String apply(String s) {
      return "Hello " + s + "!! Have a great day.";
  }
}
