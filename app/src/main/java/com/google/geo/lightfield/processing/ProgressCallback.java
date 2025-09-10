package com.google.geo.lightfield.processing;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface ProgressCallback {
    void setProgress(float f);

    void setRange(float f, float f2);

    boolean wasCancelled();
}
