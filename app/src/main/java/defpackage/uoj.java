package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uoj extends uoo {
    private final uiq a;
    private final uly f = new uly(false, umc.a);

    public uoj(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.uoo
    public final void a(Throwable th) {
        if (this.f.b()) {
            this.a.a(th);
        }
    }

    @Override // defpackage.uoo
    public final boolean b() {
        return true;
    }
}
