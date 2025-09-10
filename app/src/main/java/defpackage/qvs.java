package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvs extends qvv {
    private final boolean b;

    public qvs(uyz uyzVar, boolean z) {
        super(uyzVar);
        this.b = z;
    }

    private final uyz f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.qvv
    public final long a(String str) {
        uyz uyzVarF = f();
        if (uyzVarF.equals(uyz.a)) {
            return 1000L;
        }
        return uyzVarF.c;
    }

    @Override // defpackage.qvv
    public final uyz b(Long l) {
        return this.a;
    }

    @Override // defpackage.qvv
    public final uyz c(Long l) {
        return f();
    }

    @Override // defpackage.qvv
    public final boolean d() {
        return this.b;
    }
}
