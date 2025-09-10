package com.google.acmi.gldebug;

import defpackage.paw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GLDebug {
    public static final /* synthetic */ int a = 0;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface OnGLDebugMessageJNIListener {
    }

    static {
        paw.a(GLDebug.class, "gldebug");
    }

    public static native void nativeEnableGLDebugInfos(OnGLDebugMessageJNIListener onGLDebugMessageJNIListener);
}
