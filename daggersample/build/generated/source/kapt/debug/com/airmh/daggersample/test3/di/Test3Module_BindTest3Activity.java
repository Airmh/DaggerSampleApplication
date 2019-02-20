package com.airmh.daggersample.test3.di;

import com.airmh.daggersample.test3.Test3Activity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = Test3Module_BindTest3Activity.Test3ActivitySubcomponent.class)
public abstract class Test3Module_BindTest3Activity {
  private Test3Module_BindTest3Activity() {}

  @Binds
  @IntoMap
  @ClassKey(Test3Activity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Test3ActivitySubcomponent.Builder builder);

  @Subcomponent(modules = Test3InjectorModule.class)
  public interface Test3ActivitySubcomponent extends AndroidInjector<Test3Activity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Test3Activity> {}
  }
}
