package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mip implements owy {
    final /* synthetic */ miq a;

    public mip(miq miqVar) {
        this.a = miqVar;
    }

    @Override // defpackage.owy
    public final void a(Exception exc) {
        this.a.b.set(false);
    }

    @Override // defpackage.owy
    public final void b() {
        this.a.b.set(true);
    }

    @Override // defpackage.owy
    public final void c() {
        this.a.b.set(false);
    }
}
