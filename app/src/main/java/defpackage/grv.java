package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grv implements grx, gru {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;

    public grv(jod jodVar, grp grpVar, Context context, int i) {
        this.a = i;
        this.b = jodVar;
        this.c = grpVar;
        this.d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    @Override // defpackage.gru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.grv.a():android.content.Intent");
    }

    @Override // defpackage.grx
    public final void b() {
        if (this.a != 0) {
            ((jod) this.b).d(a());
        } else {
            ((jod) this.d).d(a());
        }
    }

    public grv(jod jodVar, String str, rwc rwcVar, int i) {
        this.a = i;
        this.d = jodVar;
        this.b = str;
        this.c = rwcVar;
    }
}
