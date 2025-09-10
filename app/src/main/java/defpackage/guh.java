package defpackage;

import android.util.Range;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guh {
    public static final Range a = Range.create(Double.valueOf(-20.0d), Double.valueOf(30.0d));
    public final gvb b;
    public rwc c;
    public rwc d;
    private final gva e;
    private final gva f;
    private final gub g;
    private final boolean h;
    private rwc i;
    private boolean j;
    private final nmt k;

    public guh(gub gubVar, hbj hbjVar) {
        guf gufVar = new guf(this, 1);
        this.e = gufVar;
        guf gufVar2 = new guf(this, 0);
        this.f = gufVar2;
        rvk rvkVar = rvk.a;
        this.c = rvkVar;
        this.i = rvkVar;
        this.d = rvkVar;
        this.j = false;
        this.g = gubVar;
        this.h = hbjVar.p(gyp.d);
        this.k = new nmt(0.015f, null);
        this.b = new gvb(gufVar, gufVar2, 1000L);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, jrg] */
    final synchronized void a(float f, float f2, long j) {
        lnl lnlVarB;
        if (this.h) {
            rwc rwcVarA = this.g.a();
            if (rwcVarA.h() && (lnlVarB = ((hpa) ((got) rwcVarA.c()).a).b()) != null) {
                this.j = this.k.b(lnlVarB.r, lnlVarB.p);
                if (this.i.h()) {
                    this.d = rwc.j(Float.valueOf(((got) rwcVarA.c()).c.a((lnl) this.i.c(), lnlVarB)));
                }
                this.i = rwc.j(lnlVarB);
                this.c = rwc.j(new gug(f, f2, this.j));
                gvb gvbVar = this.b;
                boolean zC = gvbVar.c();
                gvbVar.b(j);
                if (gvbVar.c() != zC) {
                    gvbVar.c();
                }
            }
        }
    }

    public final synchronized void b() {
        this.c = rvk.a;
        this.b.a();
    }
}
