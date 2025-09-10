package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpg extends cpf {
    private cmh d;

    public cpg(cpp cppVar, WindowInsets windowInsets) {
        super(cppVar, windowInsets);
        this.d = null;
    }

    @Override // defpackage.cpm
    public final cmh o() {
        if (this.d == null) {
            WindowInsets windowInsets = this.a;
            this.d = cmh.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.d;
    }

    @Override // defpackage.cpm
    public cpp p() {
        return cpp.n(this.a.consumeStableInsets());
    }

    @Override // defpackage.cpm
    public cpp q() {
        return cpp.n(this.a.consumeSystemWindowInsets());
    }

    @Override // defpackage.cpm
    public boolean r() {
        return this.a.isConsumed();
    }
}
