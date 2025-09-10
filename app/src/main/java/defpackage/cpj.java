package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpj extends cpi {
    static {
        cpp.n(WindowInsets.CONSUMED);
    }

    public cpj(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar, windowInsets);
    }

    @Override // defpackage.cpf, defpackage.cpm
    public cmh a(int i) {
        return cmh.c(this.a.getInsets(cpn.a(i)));
    }

    @Override // defpackage.cpf, defpackage.cpm
    public cmh c(int i) {
        return cmh.c(this.a.getInsetsIgnoringVisibility(cpn.a(i)));
    }

    @Override // defpackage.cpf, defpackage.cpm
    public boolean m(int i) {
        return this.a.isVisible(cpn.a(i));
    }

    @Override // defpackage.cpf, defpackage.cpm
    public final void f(View view) {
    }
}
