package com.google.android.libraries.microvideo.xmp.nativemotionphotos;

import defpackage.sjd;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeMotionPhotoProcessor {
    public static final /* synthetic */ int a = 0;

    static {
        sjd.d("NativeMotionPhotoProc");
        System.loadLibrary("native");
    }

    private NativeMotionPhotoProcessor() {
    }

    public static native byte[] encodeVideoMetadata(byte[] bArr);
}
