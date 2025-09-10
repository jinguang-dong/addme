package defpackage;

import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpf extends cpm {
    final WindowInsets a;
    cmh b;
    int c;
    private cmh d;
    private cpp g;

    public cpf(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar);
        this.d = null;
        this.a = windowInsets;
    }

    static boolean n(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private cmh x(int i, boolean z) {
        cmh cmhVarB = cmh.a;
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0) {
                cmh cmhVarB2 = b(i2, z);
                cmhVarB = cmh.b(Math.max(cmhVarB.b, cmhVarB2.b), Math.max(cmhVarB.c, cmhVarB2.c), Math.max(cmhVarB.d, cmhVarB2.d), Math.max(cmhVarB.e, cmhVarB2.e));
            }
        }
        return cmhVarB;
    }

    private cmh y() {
        cpp cppVar = this.g;
        return cppVar != null ? cppVar.g() : cmh.a;
    }

    private cmh z(View view) {
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // defpackage.cpm
    public cmh a(int i) {
        return x(i, false);
    }

    protected cmh b(int i, boolean z) {
        cmh cmhVar;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    cmh cmhVarD = d();
                    cmh cmhVarY = y();
                    int i2 = cmhVarD.e;
                    int i3 = cmhVarY.e;
                    if (i2 > i3 || ((cmhVar = this.b) != null && !cmhVar.equals(cmh.a) && (i2 = this.b.e) > i3)) {
                        return cmh.b(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return v();
                    }
                    if (i == 32) {
                        return u();
                    }
                    if (i == 64) {
                        return w();
                    }
                    if (i == 128) {
                        cpp cppVar = this.g;
                        cnq cnqVarI = cppVar != null ? cppVar.i() : s();
                        if (cnqVarI != null) {
                            return cmh.b(cnqVarI.b(), cnqVarI.d(), cnqVarI.c(), cnqVarI.a());
                        }
                    }
                }
            } else {
                if (z) {
                    cmh cmhVarY2 = y();
                    cmh cmhVarO = o();
                    return cmh.b(Math.max(cmhVarY2.b, cmhVarO.b), 0, Math.max(cmhVarY2.d, cmhVarO.d), Math.max(cmhVarY2.e, cmhVarO.e));
                }
                if ((this.c & 2) == 0) {
                    cmh cmhVarD2 = d();
                    cpp cppVar2 = this.g;
                    cmh cmhVarG = cppVar2 != null ? cppVar2.g() : null;
                    int iMin = cmhVarD2.e;
                    if (cmhVarG != null) {
                        iMin = Math.min(iMin, cmhVarG.e);
                    }
                    return cmh.b(cmhVarD2.b, 0, cmhVarD2.d, iMin);
                }
            }
        } else {
            if (z) {
                return cmh.b(0, Math.max(y().c, d().c), 0, 0);
            }
            if ((this.c & 4) == 0) {
                return cmh.b(0, d().c, 0, 0);
            }
        }
        return cmh.a;
    }

    @Override // defpackage.cpm
    public cmh c(int i) {
        return x(i, true);
    }

    @Override // defpackage.cpm
    public final cmh d() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = cmh.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.cpm
    public cpp e(int i, int i2, int i3, int i4) {
        cpd cpdVar = new cpd(cpp.n(this.a));
        cpdVar.c(cpp.h(d(), i, i2, i3, i4));
        cpdVar.b(cpp.h(o(), i, i2, i3, i4));
        return cpdVar.a();
    }

    @Override // defpackage.cpm
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        cpf cpfVar = (cpf) obj;
        return Objects.equals(this.b, cpfVar.b) && n(this.c, cpfVar.c);
    }

    @Override // defpackage.cpm
    public void f(View view) {
        cmh cmhVarZ = z(view);
        if (cmhVarZ == null) {
            cmhVarZ = cmh.a;
        }
        h(cmhVarZ);
    }

    public void h(cmh cmhVar) {
        this.b = cmhVar;
    }

    @Override // defpackage.cpm
    public void i(cpp cppVar) {
        this.g = cppVar;
    }

    @Override // defpackage.cpm
    public void j(int i) {
        this.c = i;
    }

    @Override // defpackage.cpm
    public boolean k() {
        return this.a.isRound();
    }

    protected boolean l(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !b(i, false).equals(cmh.a);
    }

    @Override // defpackage.cpm
    public boolean m(int i) {
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((i & i2) != 0 && !l(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.cpm
    public void g(cmh[] cmhVarArr) {
    }
}
