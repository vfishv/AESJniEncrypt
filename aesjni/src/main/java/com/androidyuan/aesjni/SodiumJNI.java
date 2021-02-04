/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.androidyuan.aesjni;

public class SodiumJNI {
  public final static native int sodium_init();
  public final static native String sodium_version_string();
  public final static native void randombytes_buf(byte[] jarg1, int jarg2);
  public final static native int randombytes_random();
  public final static native int randombytes_uniform(int jarg1);
  public final static native int crypto_sign_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_sign(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_open(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_detached(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5);
  public final static native int crypto_sign_ed25519_sk_to_curve25519(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_ed25519_pk_to_curve25519(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_verify_detached(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4);
  public final static native int crypto_sign_ed25519_sk_to_seed(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_sign_ed25519_sk_to_pk(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_box_seed_keypair(byte[] jarg1, byte[] jarg2, byte[] jarg3);
  public final static native int crypto_box_keypair(byte[] jarg1, byte[] jarg2);
  public final static native int crypto_box_easy(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_open_easy(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_box_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, long jarg4, byte[] jarg5, byte[] jarg6, byte[] jarg7);
  public final static native int crypto_box_open_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, long jarg4, byte[] jarg5, byte[] jarg6, byte[] jarg7);
  public final static native int crypto_secretbox_easy(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_open_easy(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4, byte[] jarg5);
  public final static native int crypto_secretbox_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, long jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_secretbox_open_detached(byte[] jarg1, byte[] jarg2, byte[] jarg3, long jarg4, byte[] jarg5, byte[] jarg6);
  public final static native int crypto_auth(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4);
  public final static native int crypto_auth_verify(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4);
  public final static native int crypto_aead_chacha20poly1305_encrypt(byte[] jarg1, long jarg2, byte[] jarg3, long jarg4, byte[] jarg5, long jarg6, byte[] jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_aead_chacha20poly1305_decrypt(byte[] jarg1, long jarg2, byte[] jarg3, byte[] jarg4, long jarg5, byte[] jarg6, long jarg7, byte[] jarg8, byte[] jarg9);
  public final static native int crypto_pwhash_scryptsalsa208sha256(byte[] jarg1, long jarg2, String jarg3, long jarg4, byte[] jarg5, long jarg6, int jarg7);
  public final static native int crypto_pwhash_scryptsalsa208sha256_str(byte[] jarg1, String jarg2, long jarg3, long jarg4, int jarg5);
  public final static native int crypto_pwhash_scryptsalsa208sha256_str_verify(byte[] jarg1, String jarg2, long jarg3);
  public final static native int crypto_shorthash(byte[] jarg1, byte[] jarg2, long jarg3, byte[] jarg4);
  public final static native int crypto_generichash(byte[] jarg1, int jarg2, byte[] jarg3, long jarg4, byte[] jarg5, int jarg6);

        /* Load JNI library */
        static {
                try {
                    System.loadLibrary("JNIEncrypt");
                    if (sodium_init() == -1) {
                        throw new RuntimeException("Sodium could not be initialized.");
                    }
                } catch (Exception e) {
                        e.printStackTrace();
                        System.exit(1);
                }
        }

}
