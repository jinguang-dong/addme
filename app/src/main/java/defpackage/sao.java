package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sao extends ryd {
    final saw a;
    final Object b;
    int c;

    public sao(saw sawVar, int i) {
        this.a = sawVar;
        this.b = sawVar.b[i];
        this.c = i;
    }

    private final void a() {
        int i = this.c;
        if (i != -1) {
            saw sawVar = this.a;
            if (i <= sawVar.c && a.K(this.b, sawVar.b[i])) {
                return;
            }
        }
        this.c = this.a.e(this.b);
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.c;
        if (i == -1) {
            return null;
        }
        return this.a.a[i];
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.c;
        if (i == -1) {
            this.a.n(this.b, obj);
            return null;
        }
        saw sawVar = this.a;
        Object obj2 = sawVar.a[i];
        if (a.K(obj2, obj)) {
            return obj;
        }
        sawVar.o(this.c, obj);
        return obj2;
    }
}
