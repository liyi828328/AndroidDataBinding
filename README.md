# Android DataBinding

本项目主要是帮助了解使用Android DataBinding双向绑定框架，这个框架给我们带来了很大的方便性，省去了Activity中findVieById，减少代码耦合性，是项目使用MVVM的理想助手。

# 环境
1.环境AS要求版本在1.3以上，这个基本都满足了。
2.在项目build.gradle中配置
	
    android {
        ....
        dataBinding {
            enabled = true
        }
    }

3.layout方式变更

    <?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:android="http://schemas.android.com/apk/res/android">
       <data>
           <variable name="user" type="com.example.User"/>
       </data>
       <LinearLayout
           android:orientation="vertical"
           android:layout_width="match_parent"
           android:layout_height="match_parent">
           
           <TextView android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="@{user.firstName}"/>
           
           <TextView android:layout_width="wrap_content"
               android:layout_height="wrap_content"
               android:text="@{user.lastName}"/>
       </LinearLayout>
    </layout>

# 本项目内容

## 基本对象使用
主要介绍view中基绑定对象的基本用法，具体参考下面代码：

	perseverance.li.databinding.LoginActivity.java

## 如何加载图片
主要介绍记载本地资源图片，加载网络图片的使用方式，具体参考下面代码：

	perseverance.li.databinding.LoginActivity.java

## 使用在ListView中
主要介绍RecyclerView结合DataBinding的使用方法，具体参考下面代码：

	perseverance.li.databinding.ImageViewActivity.java

## List Map 数据类型自动转换 等
主要介绍使用List Map等数据类型，具体参考下面代码：

	perseverance.li.databinding.OtherActivity.java
    
# 更具体的代码介绍
本文最终介绍会发布到本人微信公众号，请关注公众号“谋略刻印”。
