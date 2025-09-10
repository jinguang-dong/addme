package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uxf {
    private final umb a;
    public final umb b;
    public final uma c;
    public final ulz d;
    public final uiv e;
    private final uma f;

    public uxf() {
        umc umcVar = umc.a;
        this.f = new uma(0L, umcVar);
        this.c = new uma(0L, umcVar);
        uxh uxhVar = new uxh(0L, null, 2);
        this.a = new umb(uxhVar, umcVar);
        this.b = new umb(uxhVar, umcVar);
        this.d = new ulz(1, umcVar);
        this.e = new uxc(this, 0);
    }

    public final void e() {
        ulz ulzVar;
        int i;
        do {
            ulzVar = this.d;
            i = ulzVar.b;
            if (i <= 1) {
                return;
            }
        } while (!ulzVar.c(i, 1));
    }

    public final void f() {
        Object objA;
        long j;
        uxh uxhVar;
        while (true) {
            int andIncrement = ulz.a.getAndIncrement(this.d);
            if (andIncrement > 0) {
                e();
                throw new IllegalStateException("The number of released permits cannot be greater than 1");
            }
            if (andIncrement >= 0) {
                return;
            }
            umb umbVar = this.a;
            uxh uxhVar2 = (uxh) umbVar.a;
            long jB = this.f.b();
            long j2 = uxg.f;
            long j3 = jB / j2;
            uxe uxeVar = uxe.a;
            while (true) {
                objA = uva.a(uxhVar2, j3, uxeVar);
                if (uwa.a(objA)) {
                    j = jB;
                    break;
                }
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
                uxhVar2 = uxhVar;
                jB = j;
            }
            uxh uxhVar3 = (uxh) uwa.b(objA);
            uxhVar3.p();
            if (uxhVar3.b <= j3) {
                int i = (int) (j % j2);
                ocq ocqVar = uxhVar3.c;
                uwc uwcVar = uxg.b;
                Object objA2 = ocqVar.x(i).a(uwcVar);
                if (objA2 == null) {
                    int i2 = uxg.a;
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (ocqVar.x(i).a == uxg.c) {
                            return;
                        }
                    }
                    if (!ocqVar.x(i).d(uwcVar, uxg.d)) {
                        return;
                    }
                } else if (objA2 == uxg.e) {
                    continue;
                } else if (objA2 instanceof umk) {
                    umk umkVar = (umk) objA2;
                    Object objH = umkVar.h(ufg.a, this.e);
                    if (objH != null) {
                        umkVar.c(objH);
                        return;
                    }
                } else {
                    if (!(objA2 instanceof uwx)) {
                        Objects.toString(objA2);
                        throw new IllegalStateException("unexpected: ".concat(objA2.toString()));
                    }
                    if (((uwx) objA2).g(this, ufg.a)) {
                        return;
                    }
                }
            }
        }
    }
}
