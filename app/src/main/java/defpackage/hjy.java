package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjy implements AutoCloseable, owf {
    private static final paq a = new fgp(8);
    private owf b;
    private paq c;
    private owq d;
    private paq e;
    private pka f;
    private owf g;
    private paq h;
    private final Executor i;
    private final owq j;
    private final owf k;

    public hjy(Executor executor) {
        paq paqVar = a;
        this.c = paqVar;
        this.d = owp.a(nkw.PHOTO);
        this.e = paqVar;
        this.f = pka.BACK;
        this.g = new owi(Boolean.FALSE);
        this.h = paqVar;
        ovx ovxVar = new ovx(false);
        this.j = ovxVar;
        this.k = owb.a(ovxVar);
        this.i = executor;
    }

    @Override // defpackage.owf
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean dL() {
        return (Boolean) this.k.dL();
    }

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.e.close();
        paq paqVar = a;
        this.e = paqVar;
        this.c.close();
        this.c = paqVar;
        this.h.close();
        this.h = paqVar;
    }

    public final synchronized void d() {
        nkw nkwVar = (nkw) this.d.dL();
        boolean zBooleanValue = ((Boolean) this.b.dL()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) this.g.dL()).booleanValue();
        pka pkaVar = this.f;
        boolean z = false;
        if (zBooleanValue) {
            if (nkwVar == nkw.PHOTO) {
                if (pkaVar != pka.FRONT && !zBooleanValue2) {
                    zBooleanValue2 = false;
                    if (nkwVar != nkw.NIGHT_SIGHT) {
                    }
                }
                z = true;
            } else if ((nkwVar != nkw.NIGHT_SIGHT && (pkaVar == pka.FRONT || zBooleanValue2)) || nkwVar == nkw.PORTRAIT) {
                z = true;
            }
        }
        this.j.a(Boolean.valueOf(z));
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.k.dK(pauVar, executor);
    }

    public final synchronized void e(owq owqVar) {
        this.d = owqVar;
        this.e.close();
        this.e = owqVar.dK(new hib(this, 3), this.i);
    }

    public final synchronized void f(pka pkaVar) {
        this.f = pkaVar;
        d();
    }

    public final synchronized void g(owf owfVar) {
        this.g = owfVar;
        this.h.close();
        this.h = owfVar.dK(new hdg(this, 2), this.i);
    }

    public final synchronized void h(owf owfVar) {
        this.b = owfVar;
        this.c.close();
        this.c = owfVar.dK(new hib(this, 2), this.i);
    }
}
