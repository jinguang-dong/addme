package defpackage;

import com.google.vr.ndk.base.GvrApi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txi {
    private final long a;

    public txi(long j) {
        this.a = j;
    }

    public final boolean a(txh txhVar) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.a, txhVar.c);
    }
}
