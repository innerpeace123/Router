# Router
在清单文件中注册host和scheme实现页面间的跳转和传参


通过在清单文件注册host和scheme
  <intent-filter>
                <data android:host="@string/app_main2activity_host"
                      android:scheme="@string/app_scheme"/>
                <action android:name="android.intent.action.VIEW"/>
                <category android:name="android.intent.category.BROWSABLE"/>
                <category android:name="android.intent.category.DEFAULT"/>
            </intent-filter>
  
 通过类似于网址的url进行页面间的跳转实现页面的解耦，如通过MainActivity跳转到Main2Activity，只需通过MyRoute：//mainhost可进行跳转
 如果想要传参可通过MyRoute://mainhost?age=10。
 如果想要获取参数可通过
 
    Uri data = getIntent().getData();
        if (data != null) {
            String age = data.getQueryParameter("age");
            button.setText(age);
        }
        
        此版本只封装了静态注册的路由，后续版本会封装动态注册的路由
