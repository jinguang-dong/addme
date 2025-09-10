package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bac {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final ues e;
    public final yq f;

    public bac(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            bad.a("Invalid start index");
        }
        this.d = new ArrayList();
        yq yqVar = new yq((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            azh azhVar = (azh) this.a.get(i3);
            yqVar.f(azhVar.c, new azd(i3, i2, azhVar.d));
            i2 += azhVar.d;
        }
        this.f = yqVar;
        this.e = new uez(new bab(this));
    }

    public final int a(azh azhVar) {
        azd azdVar = (azd) this.f.a(azhVar.c);
        if (azdVar != null) {
            return azdVar.b;
        }
        return -1;
    }

    public final int b(azh azhVar) {
        azd azdVar = (azd) this.f.a(azhVar.c);
        return azdVar != null ? azdVar.c : azhVar.d;
    }

    public final void c(azh azhVar, int i) {
        this.f.f(azhVar.c, new azd(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        yq yqVar = this.f;
        azd azdVar = (azd) yqVar.a(i);
        if (azdVar == null) {
            return false;
        }
        int i5 = azdVar.b;
        int i6 = i2 - azdVar.c;
        azdVar.c = i2;
        if (i6 == 0) {
            return true;
        }
        Object[] objArr = yqVar.c;
        long[] jArr = yqVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        azd azdVar2 = (azd) objArr[(i7 << 3) + i9];
                        if (azdVar2.b >= i5 && !a.ao(azdVar2, azdVar) && (i4 = azdVar2.b + i6) >= 0) {
                            azdVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final void e(azh azhVar) {
        this.d.add(azhVar);
    }
}
