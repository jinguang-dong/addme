package defpackage;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amt {
    public final qzx a;
    public final byz b;
    public final ocq c;
    private final ank d;

    public amt(ank ankVar, ocq ocqVar, byz byzVar, qzx qzxVar) {
        this.d = ankVar;
        this.c = ocqVar;
        this.b = byzVar;
        this.a = qzxVar;
    }

    public final int a(Object obj) {
        return this.a.c(obj);
    }

    public final int b() {
        return ((apg) this.c.a).a;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, uiq] */
    public final Object c(int i) {
        ant antVarA = ((apg) this.c.a).a(i);
        return ((byz) antVarA.c).a.a(Integer.valueOf(i - antVarA.a));
    }

    public final Object d(int i) {
        qzx qzxVar = this.a;
        int i2 = i - qzxVar.a;
        Object obj = null;
        if (i2 >= 0) {
            Object[] objArr = (Object[]) qzxVar.c;
            if (i2 < objArr.length) {
                obj = objArr[i2];
            }
        }
        if (obj != null) {
            return obj;
        }
        ant antVarA = ((apg) this.c.a).a(i);
        int i3 = antVarA.a;
        Object obj2 = antVarA.c;
        return new anr(i);
    }

    public final void e(int i, Object obj, ayc aycVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        ayc aycVarC = aycVar.c(-462424778);
        if (i4 == 0) {
            i3 = (true != aycVarC.z(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != aycVarC.D(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != aycVarC.B(this) ? 128 : 256;
        }
        if (aycVarC.H((i3 & 147) != 146, i3 & 1)) {
            byi.ao(obj, i, this.d.j, bdq.k(-824725566, new ams(this, i), aycVarC), aycVarC, ((i3 << 3) & ScriptIntrinsicBLAS.TRANSPOSE) | ((i3 >> 3) & 14) | 3072);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new dll(this, i, obj, i2, 1);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof amt) {
            return a.ao(this.c, ((amt) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
