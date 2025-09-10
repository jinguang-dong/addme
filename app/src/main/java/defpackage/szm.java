package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class szm extends sys {
    final /* synthetic */ szo a;
    private final sxh b;

    public szm(szo szoVar, sxh sxhVar) {
        this.a = szoVar;
        this.b = sxhVar;
    }

    @Override // defpackage.sys
    public final /* bridge */ /* synthetic */ Object a() {
        syu syuVarA = this.b.a();
        syuVarA.getClass();
        return syuVarA;
    }

    @Override // defpackage.sys
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.sys
    public final void d(Throwable th) {
        this.a.a(th);
    }

    @Override // defpackage.sys
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.f((syu) obj);
    }

    @Override // defpackage.sys
    public final boolean g() {
        return this.a.isDone();
    }
}
