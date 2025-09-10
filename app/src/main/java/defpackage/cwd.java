package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwd implements und, cwf {
    public final cwc a;
    private final uhf b;

    public cwd() {
        throw null;
    }

    @Override // defpackage.cwf
    public final void a(cwh cwhVar, cwa cwaVar) {
        cwc cwcVar = this.a;
        if (cwcVar.a.compareTo(cwb.a) <= 0) {
            cwcVar.c(this);
            ujp.S(this.b, null);
        }
    }

    @Override // defpackage.und
    public final uhf c() {
        return this.b;
    }

    public cwd(cwc cwcVar, uhf uhfVar) {
        uhfVar.getClass();
        this.a = cwcVar;
        this.b = uhfVar;
        if (cwcVar.a == cwb.a) {
            ujp.S(uhfVar, null);
        }
    }
}
