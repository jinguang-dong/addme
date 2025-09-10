package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cpl extends cpk {
    static final cpp d = cpp.n(WindowInsets.CONSUMED);

    public cpl(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar, windowInsets);
    }

    @Override // defpackage.cpj, defpackage.cpf, defpackage.cpm
    public cmh a(int i) {
        return cmh.c(this.a.getInsets(cpo.a(i)));
    }

    @Override // defpackage.cpj, defpackage.cpf, defpackage.cpm
    public cmh c(int i) {
        return cmh.c(this.a.getInsetsIgnoringVisibility(cpo.a(i)));
    }

    @Override // defpackage.cpj, defpackage.cpf, defpackage.cpm
    public boolean m(int i) {
        return this.a.isVisible(cpo.a(i));
    }
}
