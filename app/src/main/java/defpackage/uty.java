package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uty extends utx {
    public uty(urk urkVar, uhf uhfVar, int i, int i2) {
        super(urkVar, uhfVar, i, i2);
    }

    @Override // defpackage.utw
    protected final utw c(uhf uhfVar, int i, int i2) {
        return new uty(this.d, uhfVar, i, i2);
    }

    @Override // defpackage.utw
    public final urk f() {
        return this.d;
    }

    @Override // defpackage.utx
    public final Object g(url urlVar, uhb uhbVar) {
        Object objGc = this.d.gc(urlVar, uhbVar);
        return objGc == uhi.a ? objGc : ufg.a;
    }

    public /* synthetic */ uty(urk urkVar, int i) {
        super(urkVar, uhg.a, 0, i);
    }
}
