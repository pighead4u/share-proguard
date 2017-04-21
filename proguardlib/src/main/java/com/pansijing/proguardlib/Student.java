package com.pansijing.proguardlib;

import android.support.annotation.Keep;

/**
 * @author: zhuhuanhuan
 * @time: 2016/12/12-上午9:28.
 * @email: zhuhuanhuan@hotmail.com
 * @desc: 测试保留类名--大家可以对比去掉@Keep后的混淆情况
 */
@Keep
public final class Student {

    public String name;

    public String email;

    public int age;

    public int grade;
}
