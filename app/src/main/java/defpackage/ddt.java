package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddt implements dfg {
    final /* synthetic */ ddu a;

    public ddt(ddu dduVar) {
        this.a = dduVar;
    }

    @Override // defpackage.dfg
    public final String b() {
        return this.a.g;
    }

    @Override // defpackage.dfg
    public final void h(dff dffVar) {
        ddu dduVar = this.a;
        int length = dduVar.a.length;
        for (int i = 1; i < length; i++) {
            int i2 = dduVar.a[i];
            if (i2 == 1) {
                dffVar.e(i, dduVar.b[i]);
            } else if (i2 == 2) {
                dffVar.d(i, dduVar.c[i]);
            } else if (i2 == 3) {
                String str = dduVar.d[i];
                str.getClass();
                dffVar.g(i, str);
            } else if (i2 == 4) {
                byte[] bArr = dduVar.e[i];
                bArr.getClass();
                dffVar.c(i, bArr);
            } else if (i2 == 5) {
                dffVar.f(i);
            }
        }
    }
}
