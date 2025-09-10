package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uxa extends uxf {
    public final umb a = new umb(uxb.a, umc.a);

    public final boolean a() {
        return Math.max(this.d.b, 0) == 0;
    }

    public final Object b(uhb uhbVar) {
        Object objA;
        long j;
        uxh uxhVar;
        if (c()) {
            return ufg.a;
        }
        uml umlVarQ = ung.q(ske.aE(uhbVar));
        try {
            uwz uwzVar = new uwz(this, umlVarQ);
            while (true) {
                int andDecrement = ulz.a.getAndDecrement(this.d);
                if (andDecrement <= 1) {
                    if (andDecrement > 0) {
                        uwzVar.e(ufg.a, this.e);
                        break;
                    }
                    umb umbVar = this.b;
                    uxh uxhVar2 = (uxh) umbVar.a;
                    long jB = this.c.b();
                    uxd uxdVar = uxd.a;
                    long j2 = uxg.f;
                    long j3 = jB / j2;
                    while (true) {
                        objA = uva.a(uxhVar2, j3, uxdVar);
                        if (!uwa.a(objA)) {
                            uvb uvbVarB = uwa.b(objA);
                            while (true) {
                                uvb uvbVar = (uvb) umbVar.a;
                                uxhVar = uxhVar2;
                                j = jB;
                                if (uvbVar.b >= uvbVarB.b) {
                                    break;
                                }
                                if (uvbVarB.v()) {
                                    if (!umbVar.d(uvbVar, uvbVarB)) {
                                        if (uvbVarB.t()) {
                                            uvbVarB.q();
                                        }
                                        uxhVar2 = uxhVar;
                                        jB = j;
                                    } else if (uvbVar.t()) {
                                        uvbVar.q();
                                    }
                                }
                            }
                        } else {
                            j = jB;
                            break;
                        }
                        uxhVar2 = uxhVar;
                        jB = j;
                    }
                    uxh uxhVar3 = (uxh) uwa.b(objA);
                    int i = (int) (j % j2);
                    ocq ocqVar = uxhVar3.c;
                    if (ocqVar.x(i).d(null, uwzVar)) {
                        uwzVar.C(uxhVar3, i);
                        break;
                    }
                    if (ocqVar.x(i).d(uxg.b, uxg.c)) {
                        uwzVar.e(ufg.a, this.e);
                        break;
                    }
                    boolean z = unf.a;
                }
            }
            Object objI = umlVarQ.i();
            uhi uhiVar = uhi.a;
            if (objI == uhiVar) {
                uhbVar.getClass();
            }
            if (objI != uhiVar) {
                objI = ufg.a;
            }
            return objI != uhiVar ? ufg.a : objI;
        } catch (Throwable th) {
            umlVarQ.z();
            throw th;
        }
    }

    public final boolean c() {
        while (true) {
            ulz ulzVar = this.d;
            int i = ulzVar.b;
            if (i > 1) {
                super.e();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (ulzVar.c(1, 0)) {
                    boolean z = unf.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    public final void d() {
        while (a()) {
            umb umbVar = this.a;
            Object obj = umbVar.a;
            uwc uwcVar = uxb.a;
            if (obj != uwcVar && umbVar.d(obj, uwcVar)) {
                f();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + ung.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
