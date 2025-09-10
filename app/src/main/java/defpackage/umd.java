package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class umd extends uov implements uol, uhb, und, unj {
    public final uhf a;

    public umd(uhf uhfVar, boolean z) {
        super(z);
        I((uol) uhfVar.get(uol.c));
        this.a = uhfVar.plus(this);
    }

    @Override // defpackage.und
    public final uhf c() {
        return this.a;
    }

    protected void f(Object obj) {
        a(obj);
    }

    @Override // defpackage.uov
    protected final String fR() {
        return String.valueOf(ung.a(this)).concat(" was cancelled");
    }

    @Override // defpackage.uov
    public String fS() {
        String str = null;
        if (unf.a) {
            uhf uhfVar = this.a;
            unb unbVar = (unb) uhfVar.get(unb.b);
            if (unbVar != null) {
                unc uncVar = (unc) uhfVar.get(unc.b);
                str = (uncVar != null ? uncVar.a : "coroutine") + "#" + unbVar.a;
            }
        }
        if (str == null) {
            return ung.a(this);
        }
        return "\"" + str + "\":" + ung.a(this);
    }

    @Override // defpackage.uov
    protected final void fV(Object obj) {
        if (!(obj instanceof umt)) {
            fU(obj);
        } else {
            umt umtVar = (umt) obj;
            fT(umtVar.b, umtVar.c.a());
        }
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        Object objD = D(ung.o(obj));
        if (objD == uow.b) {
            return;
        }
        f(objD);
    }

    @Override // defpackage.uov
    public final void g(Throwable th) {
        ujo.d(this.a, th);
    }

    @Override // defpackage.unj
    public final Object k(uhb uhbVar) {
        return z(uhbVar);
    }

    @Override // defpackage.unj
    public final uwt l() {
        return Q();
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.a;
    }

    protected void fU(Object obj) {
    }

    protected void fT(Throwable th, boolean z) {
    }
}
