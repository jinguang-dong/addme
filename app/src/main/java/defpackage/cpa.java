package defpackage;

import android.view.WindowInsets;

/* compiled from: PG */
/* loaded from: classes.dex */
class cpa extends cpe {
    final WindowInsets.Builder a;

    public cpa() {
        this.a = new WindowInsets.Builder();
    }

    @Override // defpackage.cpe
    public cpp a() {
        cpp cppVarN = cpp.n(this.a.build());
        cppVarN.b.g(null);
        return cppVarN;
    }

    @Override // defpackage.cpe
    public void b(cmh cmhVar) {
        this.a.setStableInsets(cmhVar.a());
    }

    @Override // defpackage.cpe
    public void c(cmh cmhVar) {
        this.a.setSystemWindowInsets(cmhVar.a());
    }

    public cpa(cpp cppVar) {
        WindowInsets.Builder builder;
        super(cppVar);
        WindowInsets windowInsetsE = cppVar.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.a = builder;
    }
}
