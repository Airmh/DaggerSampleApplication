// Generated by Dagger (https://google.github.io/dagger).
package com.airmh.daggersample.test2.di;

import com.airmh.daggersample.test2.Test2InjectClass;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class Test2SubModule_CreateTestClassFactory implements Factory<Test2InjectClass> {
  private final Test2SubModule module;

  public Test2SubModule_CreateTestClassFactory(Test2SubModule module) {
    this.module = module;
  }

  @Override
  public Test2InjectClass get() {
    return provideInstance(module);
  }

  public static Test2InjectClass provideInstance(Test2SubModule module) {
    return proxyCreateTestClass(module);
  }

  public static Test2SubModule_CreateTestClassFactory create(Test2SubModule module) {
    return new Test2SubModule_CreateTestClassFactory(module);
  }

  public static Test2InjectClass proxyCreateTestClass(Test2SubModule instance) {
    return Preconditions.checkNotNull(
        instance.createTestClass(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
