package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class etb implements erx, erw {
    public final ery a;
    public final erw b;
    public volatile Object c;
    public volatile erv d;
    private volatile int e;
    private volatile eru f;
    private volatile tdy g;

    public etb(ery eryVar, erw erwVar) {
        this.a = eryVar;
        this.b = erwVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.erx
    public final void a() {
        tdy tdyVar = this.g;
        if (tdyVar != null) {
            tdyVar.b.dE();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.erw
    public final void b(eqi eqiVar, Exception exc, eqv eqvVar, int i) {
        this.b.b(eqiVar, exc, eqvVar, this.g.b.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [eqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [eqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [eqv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eqi, java.lang.Object] */
    @Override // defpackage.erx
    public final boolean c() throws Throwable {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                double d = fas.a;
                SystemClock.elapsedRealtimeNanos();
                try {
                    ery eryVar = this.a;
                    eqx eqxVarA = eryVar.c.b().a(obj);
                    Object objA = eqxVarA.a();
                    eqa eqaVarG = ((ejt) eryVar.c.b().g).g(objA.getClass());
                    if (eqaVarG == null) {
                        throw new epg(objA.getClass());
                    }
                    tdy tdyVar = new tdy(eqaVarG, objA, eryVar.h);
                    erv ervVar = new erv(this.g.c, eryVar.m);
                    ett ettVarC = eryVar.c();
                    ettVarC.b(ervVar, tdyVar);
                    if (ettVarC.a(ervVar) == null) {
                        try {
                            this.b.d(this.g.c, eqxVarA.a(), this.g.b, this.g.b.g(), this.g.c);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            if (!z) {
                                this.g.b.d();
                            }
                            throw th;
                        }
                    }
                    this.d = ervVar;
                    this.f = new eru(Collections.singletonList(this.g.c), eryVar, this);
                    this.g.b.d();
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f != null && this.f.c()) {
            return true;
        }
        this.f = null;
        this.g = null;
        while (!z2) {
            int i = this.e;
            ery eryVar2 = this.a;
            if (i >= eryVar2.e().size()) {
                break;
            }
            List listE = eryVar2.e();
            int i2 = this.e;
            this.e = i2 + 1;
            this.g = (tdy) listE.get(i2);
            if (this.g != null && (eryVar2.o.c(this.g.b.g()) || eryVar2.g(this.g.b.a()))) {
                this.g.b.f(eryVar2.n, new eta(this, this.g));
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [eqv, java.lang.Object] */
    @Override // defpackage.erw
    public final void d(eqi eqiVar, Object obj, eqv eqvVar, int i, eqi eqiVar2) {
        this.b.d(eqiVar, obj, eqvVar, this.g.b.g(), eqiVar);
    }

    final boolean e(tdy tdyVar) {
        tdy tdyVar2 = this.g;
        return tdyVar2 != null && tdyVar2 == tdyVar;
    }
}
