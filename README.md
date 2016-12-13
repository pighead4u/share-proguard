# 混淆分享内容

## 目录说明
* share-proguard：存放markdown文件
* app：你懂的
* proguardlib：尝试@Keep，consumerProguardFiles的地方

## 使用说明
* 用命令行：gradle assembleDebug -i打包
* 用jadx反编译apk包，查看混淆情况--https://github.com/skylot/jadx
* 推荐去查看android-sdk/tools/proguard/下的混淆文件

## @Keep说明
* 不需要配置proguard规则，因为默认的proguard-android.txt文件中就已经有了
* 直接使用，更直观的理解

## consumerProguardFiles说明
* 具体使用请查看proguardlib
* app内不用做任何改动