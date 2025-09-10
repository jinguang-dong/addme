package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpi extends cph {
    private cmh d;
    private cmh g;
    private cmh h;

    public cpi(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar, windowInsets);
        this.d = null;
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.cpf, defpackage.cpm
    public cpp e(int i, int i2, int i3, int i4) {
        return cpp.n(this.a.inset(i, i2, i3, i4));
    }

    @Override // defpackage.cpm
    public cmh u() {
        if (this.g == null) {
            this.g = cmh.c(this.a.getMandatorySystemGestureInsets());
        }
        return this.g;
    }

    @Override // defpackage.cpm
    public cmh v() {
        if (this.d == null) {
            this.d = cmh.c(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override // defpackage.cpm
    public cmh w() {
        if (this.h == null) {
            this.h = cmh.c(this.a.getTappableElementInsets());
        }
        return this.h;
    }
}
