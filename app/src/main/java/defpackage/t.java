package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class t extends n {
    private static final long serialVersionUID = 1405488568664762222L;

    public t(o oVar, o oVar2) {
        super(oVar, oVar2);
    }

    @Override // defpackage.o
    public final boolean a(q qVar) {
        return this.a.a(qVar) || this.b.a(qVar);
    }

    public final String toString() {
        o oVar = this.b;
        return this.a.toString() + " or " + oVar.toString();
    }
}
