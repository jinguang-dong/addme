package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ffr implements fes {
    private final owf a;
    private final owq b = new ovx(15);

    public ffr(luj lujVar) {
        this.a = lujVar.a(luf.u);
    }

    @Override // defpackage.fes
    public final owf a() {
        return this.a;
    }

    @Override // defpackage.fes
    public final owq b() {
        return this.b;
    }

    @Override // defpackage.fes
    public final boolean c() {
        try {
            return nvj.a != null;
        } catch (NoSuchFieldError unused) {
            return false;
        }
    }
}
