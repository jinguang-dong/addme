package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfg implements oyz {
    private final gkt a;
    private final fyw b;
    private final pbn c;

    public gfg(gkt gktVar, fyw fywVar, pbn pbnVar) {
        this.a = gktVar;
        this.b = fywVar;
        this.c = pbnVar;
    }

    @Override // defpackage.oyz
    public final oyi a(oyj oyjVar, rwc rwcVar, owq owqVar, oxp oxpVar) {
        return new gfj(oyjVar, owqVar, this.a, this.b, this.c);
    }

    @Override // defpackage.oyz
    public final oym b() {
        return oym.GLOBAL_METADATA;
    }
}
