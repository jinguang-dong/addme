package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dmm extends bij implements buu {
    public dmn a;

    public dmm(dmn dmnVar) {
        this.a = dmnVar;
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        List list = this.a.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            dml dmlVar = (dml) list.get(i);
            bmz bmzVar = dmlVar.f;
            if (bmzVar != null) {
                long j = dmlVar.e;
                int iA = chy.a(j);
                int iB = chy.b(j);
                float fA = iA - chy.a(bmzVar.j);
                float fB = iB - chy.b(r5);
                bvoVar.o().c.i(fA, fB);
                float f = -fA;
                float f2 = -fB;
                try {
                    byi.G(bvoVar, bmzVar);
                } finally {
                    bvoVar.o().c.i(f, f2);
                }
            }
        }
        bvoVar.p();
    }

    @Override // defpackage.bij
    public final void cW() {
        this.a.e = this;
    }

    @Override // defpackage.bij
    public final void cZ() {
        this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmm) && a.ao(this.a, ((dmm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.a + ')';
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
