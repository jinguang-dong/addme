package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ldv implements iac {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ldv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.iac
    public final void f(iby ibyVar, int i, long j, poe poeVar) {
        if (this.b != 0) {
            ((ldh) this.a).f(ibyVar, i, j, poeVar);
        } else {
            ((ldx) this.a).f(ibyVar, i, j, poeVar);
        }
    }
}
