package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lei implements ler {
    static final Integer a = Integer.MIN_VALUE;
    public static final Range b = new Range(Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final owq c = new ovx(b);
    public final hbj d;
    private final owq e;

    public lei(hbj hbjVar, owq owqVar, owf owfVar, pjp pjpVar, fqg fqgVar) {
        this.d = hbjVar;
        this.e = owqVar;
        fqgVar.b.d(owfVar.dK(new leg(this, pjpVar, 2), sxo.a));
    }

    @Override // defpackage.ler
    public final owf a() {
        return this.c;
    }

    @Override // defpackage.ler
    public final synchronized void b(boolean z) {
        owq owqVar = this.e;
        leo leoVar = new leo((lep) owqVar.dL());
        leoVar.b(z);
        owqVar.a(leoVar.a());
    }

    @Override // defpackage.ler
    public final synchronized void c(int i) {
        owq owqVar = this.e;
        leo leoVar = new leo((lep) owqVar.dL());
        leoVar.c(i);
        owqVar.a(leoVar.a());
    }
}
