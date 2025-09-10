package defpackage;

import androidx.wear.ambient.AmbientMode;
import androidx.wear.ambient.AmbientModeSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlk {
    public final dmn a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final byz f;

    public dlk(alv alvVar, chq chqVar, cib cibVar, byz byzVar, dmn dmnVar) {
        this.f = byzVar;
        this.a = dmnVar;
        this.b = chqVar.mo0do(alvVar.c(cibVar));
        this.c = chqVar.mo0do(alvVar.b(cibVar));
        alw alwVar = (alw) alvVar;
        this.d = chqVar.mo0do(alwVar.a);
        this.e = chqVar.mo0do(alwVar.b);
    }

    public static final boolean b(dlr dlrVar, long j) {
        return dlrVar.d + dlrVar.b() > 0 && dlrVar.d < cho.a(j);
    }

    public static final void c(int i, long j, dls dlsVar, ufu ufuVar, int i2, int i3) {
        dlr dlrVar = (dlr) ufuVar.c();
        int iB = dlrVar.d + dlrVar.b();
        int i4 = iB + i;
        for (int i5 = dlrVar.a + 1; i4 < i2 && i5 <= i3; i5++) {
            dlr dlrVarD = AmbientModeSupport.AmbientCallback.d(dlsVar, i5, i4, cho.a(j));
            int iB2 = dlrVarD.b() + i;
            ufuVar.add(dlrVarD);
            i4 += iB2;
        }
    }

    public static final void d(int i, dls dlsVar, long j, ufu ufuVar, int i2, int i3) {
        dlr dlrVar = (dlr) ufuVar.a();
        int iB = dlrVar.d - i;
        int i4 = dlrVar.a;
        while (true) {
            i4--;
            if (iB < i2 || i4 < i3) {
                return;
            }
            dlr dlrVarE = AmbientModeSupport.AmbientCallback.e(dlsVar, i4, iB, cho.a(j));
            ufuVar.addFirst(dlrVarE);
            iB -= dlrVarE.b() + i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ufu ufuVar, int i, long j) {
        int i2;
        int i3;
        int iB = this.d;
        int i4 = ufuVar.c;
        int i5 = 0;
        while (i5 < i4) {
            dlr dlrVar = (dlr) ufuVar.get(i5);
            if (i5 == 0) {
                i3 = iB - i;
                i2 = 0;
            } else {
                i2 = i5;
                i3 = iB;
            }
            dlrVar.h = AmbientMode.AmbientCallback.d(i3, dlrVar.o, cho.a(j));
            dlrVar.d = iB;
            iB += dlrVar.b() + i;
            i5 = i2 + 1;
        }
    }
}
