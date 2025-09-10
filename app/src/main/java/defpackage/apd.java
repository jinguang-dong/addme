package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd implements bfx, bfs {
    public final zw a;
    private final bfx b;
    private final bfs c;

    public apd(bfx bfxVar, Map map, bfs bfsVar) {
        this.b = new bfy(map, new np(bfxVar, 18));
        this.c = bfsVar;
        int i = zx.a;
        this.a = new zw((byte[]) null);
    }

    @Override // defpackage.bfx
    public final Object a(String str) {
        return this.b.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    @Override // defpackage.bfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            r15 = this;
            zw r0 = r15.a
            java.lang.Object[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L47
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L42
            int r7 = r4 - r2
            r8 = r3
        L20:
            int r9 = ~r7
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            if (r8 >= r9) goto L40
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r5
            r13 = 128(0x80, double:6.3E-322)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 >= 0) goto L3c
            int r9 = r4 << 3
            int r9 = r9 + r8
            r9 = r1[r9]
            bfs r11 = r15.c
            r11.d(r9)
        L3c:
            long r5 = r5 >> r10
            int r8 = r8 + 1
            goto L20
        L40:
            if (r9 != r10) goto L47
        L42:
            if (r4 == r2) goto L47
            int r4 = r4 + 1
            goto Ld
        L47:
            bfx r15 = r15.b
            java.util.Map r15 = r15.b()
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apd.b():java.util.Map");
    }

    @Override // defpackage.bfs
    public final void c(Object obj, uiu uiuVar, ayc aycVar, int i) {
        int i2;
        int i3 = i & 6;
        ayc aycVarC = aycVar.c(-858296452);
        if (i3 == 0) {
            i2 = (true != aycVarC.D(obj) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != aycVarC.D(uiuVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != aycVarC.D(this) ? 128 : 256;
        }
        if (aycVarC.H((i2 & 147) != 146, i2 & 1)) {
            this.c.c(obj, uiuVar, aycVarC, i2 & 126);
            boolean zD = aycVarC.D(this) | aycVarC.D(obj);
            ayg aygVar = (ayg) aycVarC;
            Object objR = aygVar.R();
            if (zD || objR == ayb.a) {
                objR = new adp(this, obj, 6);
                aygVar.ac(objR);
            }
            azb.c(obj, (uiq) objR, aycVarC);
        } else {
            aycVarC.r();
        }
        bai baiVarI = aycVarC.I();
        if (baiVarI != null) {
            baiVarI.d = new apc(this, obj, uiuVar, i, 0);
        }
    }

    @Override // defpackage.bfs
    public final void d(Object obj) {
        throw null;
    }

    @Override // defpackage.bfx
    public final boolean e(Object obj) {
        return this.b.e(obj);
    }

    @Override // defpackage.bfx
    public final nki f(String str, uif uifVar) {
        return this.b.f(str, uifVar);
    }
}
