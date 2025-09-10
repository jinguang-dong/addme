package com.google.googlex.gcam.creativecamera.portraitmode;

import defpackage.tgk;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class NativePortraitSegmenterInterface implements tgk {
    private static final AtomicBoolean a = new AtomicBoolean();

    public NativePortraitSegmenterInterface() {
        if (a.compareAndSet(false, true)) {
            init();
        }
    }

    private static native void init();

    @Override // defpackage.tgk
    public native boolean dummyImageProducesReasonableMask();

    @Override // defpackage.tgk
    public native long getSegmenterHandle();

    @Override // defpackage.tgk
    public native boolean initSegmenter(long j, long j2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    @Override // defpackage.tgk
    public native void release();
}
