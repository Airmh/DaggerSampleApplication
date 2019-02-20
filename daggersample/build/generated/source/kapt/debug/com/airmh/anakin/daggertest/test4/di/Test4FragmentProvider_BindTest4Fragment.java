package com.airmh.anakin.daggertest.test4.di;

import com.airmh.anakin.daggertest.test4.Test4Fragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = Test4FragmentProvider_BindTest4Fragment.Test4FragmentSubcomponent.class)
public abstract class Test4FragmentProvider_BindTest4Fragment {
  private Test4FragmentProvider_BindTest4Fragment() {}

  @Binds
  @IntoMap
  @ClassKey(Test4Fragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      Test4FragmentSubcomponent.Builder builder);

  @Subcomponent(modules = Test4FragmentModule.class)
  public interface Test4FragmentSubcomponent extends AndroidInjector<Test4Fragment> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Test4Fragment> {}
  }
}
