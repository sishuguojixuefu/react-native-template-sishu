package com.helloworld;

import com.facebook.react.ReactActivity;

import android.content.res.Configuration;
import android.content.res.Resources;

public class MainActivity extends ReactActivity {

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "HelloWorld";
  }

  // 让文字不随系统文字变化：http://t.cn/Rs26Veb
  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    if (newConfig.fontScale != 1)//非默认值
    getResources();
    super.onConfigurationChanged(newConfig);
  }
  @Override
  public Resources getResources() {
    Resources res = super.getResources();
    if (res.getConfiguration().fontScale != 1) {//非默认值
      Configuration newConfig = new Configuration();
      newConfig.setToDefaults();//设置默认
      res.updateConfiguration(newConfig, res.getDisplayMetrics());
    }
    return res;
  }
}
