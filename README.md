#Android MultiDex Plugin Demo


## Overview
This a demo for using Google's multidex plugin to make your application over 65k methods.
Official Document: <https://developer.android.com/tools/building/multidex.html>


## Describe
1. Add multidex dependencie
```
buildscript {
...
    dependencies {
        classpath 'com.android.tools.build:gradle:1.0.0'
    }
}
```

2.  Make multiDexEnabled veriable is true into defaultConfig
```
defaultConfig {
...
        multiDexEnabled true
    }
```

3. Override attachBaseContext method in your Application
```
@Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
``` 


## Notice
1. Using 1.0 version of Android Studio above.
2. Make sure your gradle build tool is 1.0.0 version.
```
com.android.tools.build:gradle:1.0.0
```
3. Make sure your gradle version above 2.2.1.


---
Follow [@讨厌茄子的老科特](http://weibo.com/wodis) on Weibo