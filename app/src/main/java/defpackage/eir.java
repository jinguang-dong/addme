package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eir implements eis {
    public final String a;
    public final eip b;
    public final eij c;
    public final boolean d;
    public final boolean e;

    public eir(String str, eip eipVar, eij eijVar, boolean z, boolean z2) {
        this.a = str;
        this.b = eipVar;
        this.c = eijVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.eis
    public final egg a(efs efsVar, efh efhVar, ejh ejhVar) {
        return new egj(efsVar, ejhVar, this);
    }
}
