package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlm {
    public final tym a;
    private final dme b;
    private final boolean c;
    private final ebn d;

    public dlm(ebn ebnVar, dme dmeVar, tym tymVar, boolean z) {
        this.d = ebnVar;
        this.b = dmeVar;
        this.a = tymVar;
        this.c = z;
    }

    public final int a(Object obj) {
        return this.a.b(obj);
    }

    public final int b() {
        return ((ogk) this.d.b).a;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uiq] */
    public final Object c(int i) {
        nw nwVarN = ((ogk) this.d.b).n(i);
        return ((tdy) nwVarN.c).a.a(Integer.valueOf(i - nwVarN.a));
    }

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, uiq] */
    public final Object d(int i) {
        tym tymVar = this.a;
        int i2 = i - tymVar.a;
        Object obj = null;
        if (i2 >= 0) {
            Object[] objArr = (Object[]) tymVar.c;
            if (i2 <= rnt.aj(objArr)) {
                obj = objArr[i2];
            }
        }
        if (obj != null) {
            return obj;
        }
        nw nwVarN = ((ogk) this.d.b).n(i);
        return ((tdy) nwVarN.c).c.a(Integer.valueOf(i - nwVarN.a));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, uiw] */
    public final void e(int i, Object obj, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(1552893017);
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.B(this) ? 128 : 256;
        }
        if (aycVarC.H((i3 & ScriptIntrinsicBLAS.NON_UNIT) != 130, i3 & 1)) {
            boolean z = this.c;
            boolean zC = aycVarC.C(z) | ((i3 & 14) == 4);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zC || objR == ayb.a) {
                objR = new rar(i, this.b, z);
                aygVar.ac(objR);
            }
            nw nwVarN = ((ogk) this.d.b).n(i);
            ((tdy) nwVarN.c).b.e((rar) objR, Integer.valueOf(i - nwVarN.a), aycVarC, 0);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dll(this, i, obj, i2, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dlm) {
            return a.ao(this.d, ((dlm) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
