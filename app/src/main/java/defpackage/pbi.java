package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbi implements pbp {
    private final int b;
    private final String c;

    public pbi(int i, String str) {
        rnt.M(!str.isEmpty(), "Empty msg.");
        this.b = i;
        this.c = str;
        Trace.beginAsyncSection(str, i);
    }

    @Override // defpackage.pbp
    public final void a() {
        Trace.endAsyncSection(this.c, this.b);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        ojl.bF(this);
    }
}
