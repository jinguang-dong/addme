package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jps implements AutoCloseable {
    private final /* synthetic */ int a;

    public jps(String str, int i) {
        this.a = i;
        Trace.beginSection(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        if (i == 0 || i == 1) {
            throw null;
        }
        if (i != 2) {
            Trace.endSection();
        } else {
            Trace.endSection();
        }
    }

    public jps(String str, int i, byte[] bArr) {
        this.a = i;
        Trace.beginSection(str.length() > 127 ? String.valueOf(str.substring(0, 124)).concat("...") : str);
    }
}
