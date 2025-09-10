package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dzy implements eab {
    public final eap a;

    public dzy(eap eapVar) {
        this.a = eapVar;
    }

    @Override // defpackage.eab
    public final urk a(dvv dvvVar) {
        dvvVar.getClass();
        return new urf(new aie(this, (uhb) null, 5));
    }

    @Override // defpackage.eab
    public final boolean c(ebx ebxVar) {
        return b(ebxVar) && e(this.a.b());
    }

    public abstract int d();

    public boolean e(Object obj) {
        throw null;
    }
}
