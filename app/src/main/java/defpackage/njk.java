package defpackage;

import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njk implements njj {
    private final String a;

    public njk(String str) {
        this.a = str;
    }

    @Override // defpackage.njj
    public final void a(String str) {
        Trace.beginSection(this.a + ":" + str);
    }

    @Override // defpackage.njj
    public final void b() {
        Trace.endSection();
    }
}
