package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class san extends ryd {
    final Object a;
    int b;
    final /* synthetic */ saw c;

    public san(saw sawVar, int i) {
        this.c = sawVar;
        this.a = sawVar.a[i];
        this.b = i;
    }

    final void a() {
        int i = this.b;
        if (i != -1) {
            saw sawVar = this.c;
            if (i <= sawVar.c && a.K(sawVar.a[i], this.a)) {
                return;
            }
        }
        this.b = this.c.b(this.a);
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object getValue() {
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return this.c.b[i];
    }

    @Override // defpackage.ryd, java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        int i = this.b;
        if (i == -1) {
            this.c.put(this.a, obj);
            return null;
        }
        saw sawVar = this.c;
        Object obj2 = sawVar.b[i];
        if (a.K(obj2, obj)) {
            return obj;
        }
        sawVar.l(this.b, obj, false);
        return obj2;
    }
}
