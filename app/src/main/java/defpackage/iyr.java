package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iyr implements may {
    final /* synthetic */ iyu a;

    public iyr(iyu iyuVar) {
        this.a = iyuVar;
    }

    private final void f() {
        iyu iyuVar = this.a;
        iyuVar.r = true;
        iyuVar.u();
    }

    @Override // defpackage.may
    public final void a() {
        iyu iyuVar = this.a;
        if (iyuVar.r) {
            iyuVar.r = false;
            iyuVar.u();
        }
    }

    @Override // defpackage.may
    public final void d() {
        if (this.a.r) {
            return;
        }
        f();
    }

    @Override // defpackage.may
    public final void e() {
        f();
    }

    @Override // defpackage.may
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.may
    public final /* synthetic */ void c() {
    }
}
