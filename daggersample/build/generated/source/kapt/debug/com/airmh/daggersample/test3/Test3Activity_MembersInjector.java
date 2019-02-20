// Generated by Dagger (https://google.github.io/dagger).
package com.airmh.daggersample.test3;

import android.support.v4.app.Fragment;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import javax.inject.Provider;

public final class Test3Activity_MembersInjector implements MembersInjector<Test3Activity> {
  private final Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider;

  private final Provider<DispatchingAndroidInjector<android.app.Fragment>>
      frameworkFragmentInjectorProvider;

  private final Provider<Test3InjectClass> test3InjectClassProvider;

  public Test3Activity_MembersInjector(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<Test3InjectClass> test3InjectClassProvider) {
    this.supportFragmentInjectorProvider = supportFragmentInjectorProvider;
    this.frameworkFragmentInjectorProvider = frameworkFragmentInjectorProvider;
    this.test3InjectClassProvider = test3InjectClassProvider;
  }

  public static MembersInjector<Test3Activity> create(
      Provider<DispatchingAndroidInjector<Fragment>> supportFragmentInjectorProvider,
      Provider<DispatchingAndroidInjector<android.app.Fragment>> frameworkFragmentInjectorProvider,
      Provider<Test3InjectClass> test3InjectClassProvider) {
    return new Test3Activity_MembersInjector(
        supportFragmentInjectorProvider,
        frameworkFragmentInjectorProvider,
        test3InjectClassProvider);
  }

  @Override
  public void injectMembers(Test3Activity instance) {
    DaggerAppCompatActivity_MembersInjector.injectSupportFragmentInjector(
        instance, supportFragmentInjectorProvider.get());
    DaggerAppCompatActivity_MembersInjector.injectFrameworkFragmentInjector(
        instance, frameworkFragmentInjectorProvider.get());
    injectTest3InjectClass(instance, test3InjectClassProvider.get());
  }

  public static void injectTest3InjectClass(
      Test3Activity instance, Test3InjectClass test3InjectClass) {
    instance.test3InjectClass = test3InjectClass;
  }
}
