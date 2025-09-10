package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lqp implements owq, paq {
    private static final paq a = new fgp(13);
    private final Executor b;
    private final lrc c;
    private final owq d;
    private final owf e;
    private owf f;
    private paq g;
    private owf h;
    private paq i;
    private owf j;
    private paq k;
    private paq l;
    private boolean m;

    public lqp(lrc lrcVar, Executor executor) {
        ovx ovxVar = new ovx(ixq.INACTIVE);
        this.d = ovxVar;
        this.e = owb.a(ovxVar);
        this.f = owp.a(nkw.UNINITIALIZED);
        paq paqVar = a;
        this.g = paqVar;
        this.h = new ovx(false);
        this.i = paqVar;
        this.j = new ovx(false);
        this.k = paqVar;
        this.l = paqVar;
        this.m = false;
        this.c = lrcVar;
        this.b = executor;
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public void close() {
        this.i.close();
        paq paqVar = a;
        this.i = paqVar;
        this.g.close();
        this.g = paqVar;
        this.k.close();
        this.k = paqVar;
        this.l.close();
        this.l = paqVar;
    }

    protected synchronized ixq d() {
        nkw nkwVar = (nkw) this.f.dL();
        boolean z = false;
        if (((lww) this.c).a && nkwVar == nkw.PHOTO) {
            z = true;
        }
        boolean zBooleanValue = ((Boolean) this.h.dL()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.j.dL()).booleanValue();
        if (z && this.m && zBooleanValue2 && zBooleanValue) {
            return ixq.NIGHT_SIGHT;
        }
        return ixq.INACTIVE;
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.e.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (ixq) this.e.dL();
    }

    public final synchronized void e(owf owfVar) {
        this.f = owfVar;
        this.g.close();
        this.g = owfVar.dK(new lqn(this, 9), this.b);
    }

    public final synchronized void f(owf owfVar) {
        this.j = owfVar;
        this.k.close();
        this.k = owfVar.dK(new lqn(this, 10), this.b);
    }

    public final synchronized void g(owf owfVar) {
        this.h = owfVar;
        this.i.close();
        this.i = owfVar.dK(new lqn(this, 8), this.b);
    }

    public final synchronized void h(boolean z) {
        this.m = z;
        j();
    }

    @Override // defpackage.pau
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(ixq ixqVar) {
        this.d.a(ixqVar);
    }

    public final synchronized void j() {
        this.d.a(d());
    }

    public final synchronized void k() {
        this.l.close();
        this.l = this.e.dK(new knl(2), this.b);
    }
}
