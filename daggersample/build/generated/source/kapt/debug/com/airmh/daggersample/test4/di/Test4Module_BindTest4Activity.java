package com.airmh.daggersample.test4.di;

import com.airmh.anakin.daggertest.test4.di.Test4ActivityModule;
import com.airmh.anakin.daggertest.test4.di.Test4FragmentProvider;
import com.airmh.daggersample.test4.Test4Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = Test4Module_BindTest4Activity.Test4ActivitySubcomponent.class)
public abstract class Test4Module_BindTest4Activity {
  private Test4Module_BindTest4Activity() {}

  @Binds
  @IntoMap
  @ClassKey(Test4Activity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Test4ActivitySubcomponent.Builder builder);

  @Subcomponent(modules = {Test4ActivityModule.class, Test4FragmentProvider.class})
  public interface Test4ActivitySubcomponent extends AndroidInjector<Test4Activity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Test4Activity> {}
  }
}
