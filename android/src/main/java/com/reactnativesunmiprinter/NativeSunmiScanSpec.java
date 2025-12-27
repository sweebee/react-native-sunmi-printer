package com.reactnativesunmiprinter;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

public abstract class NativeSunmiScanSpec extends ReactContextBaseJavaModule {
  public NativeSunmiScanSpec(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @NonNull
  @Override
  public abstract String getName();

  public abstract void scan(Promise promise);
}
