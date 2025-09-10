package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prw extends swn {
    Object a;

    public prw(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.swn
    public final boolean a(Throwable th) {
        return super.a(th);
    }

    @Override // defpackage.swn
    protected final void d() {
        this.a = null;
    }

    @Override // defpackage.swn
    public final boolean e(Object obj) {
        return super.e(obj);
    }

    @Override // defpackage.swn
    public final String ez() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }
}
