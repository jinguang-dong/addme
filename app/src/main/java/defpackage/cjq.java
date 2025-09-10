package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjq extends cjn {
    private boolean as;
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public cjm d = this.K;
    public int ar = 0;

    public cjq() {
        this.S.clear();
        this.S.add(this.d);
        int length = this.R.length;
        for (int i = 0; i < 6; i++) {
            this.R[i] = this.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cjm K(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.ar
            if (r3 != 0) goto L1b
            goto L18
        L14:
            int r3 = r2.ar
            if (r3 != r0) goto L1b
        L18:
            cjm r2 = r2.d
            return r2
        L1b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjq.K(int):cjm");
    }

    @Override // defpackage.cjn
    public final void R(boolean z) {
        if (this.U == null) {
            return;
        }
        int iO = cjf.o(this.d);
        if (this.ar == 1) {
            this.Z = iO;
            this.aa = 0;
            x(this.U.h());
            C(0);
            return;
        }
        this.Z = 0;
        this.aa = iO;
        C(this.U.j());
        x(0);
    }

    public final void a(int i) {
        this.d.e(i);
        this.as = true;
    }

    @Override // defpackage.cjn
    public final void b(cjf cjfVar, boolean z) {
        cjn cjnVar = this.U;
        if (cjnVar == null) {
            return;
        }
        Object objK = cjnVar.K(2);
        Object objK2 = cjnVar.K(4);
        cjn cjnVar2 = this.U;
        boolean z2 = cjnVar2 != null && cjnVar2.aq[0] == 2;
        if (this.ar == 0) {
            objK = cjnVar.K(3);
            objK2 = cjnVar.K(5);
            z2 = cjnVar2 != null && cjnVar2.aq[1] == 2;
        }
        if (this.as) {
            cjm cjmVar = this.d;
            if (cjmVar.c) {
                cji cjiVarB = cjfVar.b(cjmVar);
                cjfVar.f(cjiVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        cjfVar.g(cjfVar.b(objK2), cjiVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    cji cjiVarB2 = cjfVar.b(objK2);
                    cjfVar.g(cjiVarB, cjfVar.b(objK), 0, 5);
                    cjfVar.g(cjiVarB2, cjiVarB, 0, 5);
                }
                this.as = false;
                return;
            }
        }
        if (this.b != -1) {
            cji cjiVarB3 = cjfVar.b(this.d);
            cjfVar.m(cjiVarB3, cjfVar.b(objK), this.b, 8);
            if (z2) {
                cjfVar.g(cjfVar.b(objK2), cjiVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            cji cjiVarB4 = cjfVar.b(this.d);
            cji cjiVarB5 = cjfVar.b(objK2);
            cjfVar.m(cjiVarB4, cjiVarB5, -this.c, 8);
            if (z2) {
                cjfVar.g(cjiVarB4, cjfVar.b(objK), 0, 5);
                cjfVar.g(cjiVarB5, cjiVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            cji cjiVarB6 = cjfVar.b(this.d);
            cji cjiVarB7 = cjfVar.b(objK2);
            float f = this.a;
            cje cjeVarA = cjfVar.a();
            cjeVarA.e.g(cjiVarB6, -1.0f);
            cjeVarA.e.g(cjiVarB7, f);
            cjfVar.e(cjeVarA);
        }
    }

    public final void c(int i) {
        if (this.ar == i) {
            return;
        }
        this.ar = i;
        ArrayList arrayList = this.S;
        arrayList.clear();
        if (this.ar == 1) {
            this.d = this.J;
        } else {
            this.d = this.K;
        }
        arrayList.add(this.d);
        cjm[] cjmVarArr = this.R;
        int length = cjmVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            cjmVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.cjn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cjn
    public final boolean e() {
        return this.as;
    }

    @Override // defpackage.cjn
    public final boolean f() {
        return this.as;
    }
}
