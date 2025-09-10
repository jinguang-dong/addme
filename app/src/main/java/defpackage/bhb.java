package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhb extends bhn {
    public bdy a;
    public int b;

    public bhb(long j, bdy bdyVar) {
        super(j);
        this.a = bdyVar;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new bhb(j, this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        bhb bhbVar = (bhb) bhnVar;
        synchronized (bhd.a) {
            this.a = bhbVar.a;
            this.b = bhbVar.b;
        }
    }
}
