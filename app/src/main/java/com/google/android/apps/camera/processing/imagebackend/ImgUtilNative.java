package com.google.android.apps.camera.processing.imagebackend;

import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ImgUtilNative {
    static {
        paw.a(ImgUtilNative.class, "gcastartup");
    }

    private ImgUtilNative() {
    }

    public static native float measureSharpnessOnEdgeGivenCropNative(int i, int i2, Object obj, int i3, int i4, int i5, int i6, int i7, int i8);
}
