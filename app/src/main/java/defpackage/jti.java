package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jti implements owf, paq {
    public final ovx a;
    public final Executor b;
    public owf c;
    public owf d;
    public paq e;
    public paq f;
    public boolean g;

    public jti() {
        out outVar = out.b;
        this.g = false;
        this.a = new ovx(true);
        this.b = outVar;
    }

    public final void a(owf owfVar) {
        this.b.execute(new img(this, owfVar, 14));
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.b.execute(new juc(this, 1));
    }

    public final void d() {
        if (this.g) {
            return;
        }
        owf owfVar = this.c;
        boolean z = false;
        boolean z2 = owfVar == null || ((Boolean) owfVar.dL()).booleanValue();
        owf owfVar2 = this.d;
        boolean z3 = owfVar2 == null || ((Boolean) owfVar2.dL()).booleanValue();
        ovx ovxVar = this.a;
        if (z2 && z3) {
            z = true;
        }
        ovxVar.a(Boolean.valueOf(z));
    }

    @Override // defpackage.owf
    public final paq dK(pau pauVar, Executor executor) {
        return this.a.dK(pauVar, executor);
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return (Boolean) this.a.d;
    }

    public final boolean e() {
        d();
        return ((Boolean) this.a.d).booleanValue();
    }
}
