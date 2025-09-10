package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uub extends utx {
    public final uiv e;

    public uub(uiv uivVar, urk urkVar, uhf uhfVar, int i, int i2) {
        super(urkVar, uhfVar, i, i2);
        this.e = uivVar;
    }

    @Override // defpackage.utw
    protected final utw c(uhf uhfVar, int i, int i2) {
        return new uub(this.e, this.d, uhfVar, i, i2);
    }

    @Override // defpackage.utx
    public final Object g(url urlVar, uhb uhbVar) throws Throwable {
        boolean z = unf.a;
        Object objI = ung.i(new utu(this, urlVar, (uhb) null, 2), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    public /* synthetic */ uub(uiv uivVar, urk urkVar) {
        this(uivVar, urkVar, uhg.a, -2, 1);
    }
}
