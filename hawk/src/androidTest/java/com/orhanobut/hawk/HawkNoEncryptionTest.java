package com.orhanobut.hawk;

/**
 * @author Orhan Obut
 */
public class HawkNoEncryptionTest extends HawkTest {

  @Override
  public void init() {
    Hawk.init(context)
        .setEncryptionMethod(HawkBuilder.EncryptionMethod.NO_ENCRYPTION)
        .build();
  }
}
