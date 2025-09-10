package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class leh implements leq {
    static final Long a = Long.MIN_VALUE;
    public static final Range b = new Range(Long.MIN_VALUE, Long.MIN_VALUE);
    public final owq c = new ovx(b);
    public final hbj d;
    private final owq e;

    public leh(hbj hbjVar, owq owqVar, owf owfVar, pjp pjpVar, fqg fqgVar) {
        this.d = hbjVar;
        this.e = owqVar;
        fqgVar.b.d(owfVar.dK(new leg(this, pjpVar, 0), sxo.a));
    }

    @Override // defpackage.leq
    public final owf a() {
        return this.c;
    }

    @Override // defpackage.leq
    public final synchronized void b(boolean z) {
        owq owqVar = this.e;
        lkt lktVar = new lkt((lej) owqVar.dL());
        lktVar.f(z);
        owqVar.a(lktVar.d());
    }

    @Override // defpackage.leq
    public final synchronized void c(long j) {
        owq owqVar = this.e;
        lkt lktVar = new lkt((lej) owqVar.dL());
        lktVar.e(j);
        owqVar.a(lktVar.d());
    }
}
