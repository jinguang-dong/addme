package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjk extends cjr {
    public int a = 0;
    public boolean b = true;
    public int c = 0;
    boolean d = false;

    public final int a() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e4 A[PHI: r14
      0x00e4: PHI (r14v8 boolean) = (r14v2 boolean), (r14v9 boolean) binds: [B:74:0x00df, B:76:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    @Override // defpackage.cjn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.cjf r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjk.b(cjf, boolean):void");
    }

    public final boolean c() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.as;
            if (i4 >= i) {
                break;
            }
            cjn cjnVar = this.ar[i4];
            if ((this.b || cjnVar.d()) && ((((i2 = this.a) == 0 || i2 == 1) && !cjnVar.e()) || (((i3 = this.a) == 2 || i3 == 3) && !cjnVar.f()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.as; i5++) {
            cjn cjnVar2 = this.ar[i5];
            if (this.b || cjnVar2.d()) {
                if (!z2) {
                    int i6 = this.a;
                    if (i6 == 0) {
                        iMax = cjnVar2.K(2).a();
                    } else if (i6 == 1) {
                        iMax = cjnVar2.K(4).a();
                    } else if (i6 == 2) {
                        iMax = cjnVar2.K(3).a();
                    } else if (i6 == 3) {
                        iMax = cjnVar2.K(5).a();
                    }
                }
                int i7 = this.a;
                if (i7 == 0) {
                    iMax = Math.min(iMax, cjnVar2.K(2).a());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, cjnVar2.K(4).a());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, cjnVar2.K(3).a());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, cjnVar2.K(5).a());
                }
                z2 = true;
            }
        }
        int i8 = iMax + this.c;
        int i9 = this.a;
        if (i9 == 0 || i9 == 1) {
            v(i8, i8);
        } else {
            w(i8, i8);
        }
        this.d = true;
        return true;
    }

    @Override // defpackage.cjn
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cjn
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.cjn
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.cjn
    public final String toString() {
        String strConcat = "[Barrier] " + this.ai + " {";
        for (int i = 0; i < this.as; i++) {
            cjn cjnVar = this.ar[i];
            if (i > 0) {
                strConcat = strConcat.concat(", ");
            }
            strConcat = strConcat.concat(String.valueOf(cjnVar.ai));
        }
        return strConcat.concat("}");
    }
}
