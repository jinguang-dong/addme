package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmn implements may {
    final /* synthetic */ jmo a;

    public jmn(jmo jmoVar) {
        this.a = jmoVar;
    }

    @Override // defpackage.may
    public final void a() {
        jmo jmoVar = this.a;
        if (jmoVar.b.compareAndSet(true, false)) {
            jmoVar.d = jmoVar.a();
        }
    }

    @Override // defpackage.may
    public final void c() {
        this.a.b.set(true);
    }

    @Override // defpackage.may
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void e() {
    }
}
