package com.google.googlex.gcam;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Tuning {
    public transient long a;

    public Tuning(long j) {
        this.a = j;
    }

    public final synchronized void a() {
        if (this.a != 0) {
            this.a = 0L;
        }
    }

    protected final void finalize() {
        a();
    }
}
