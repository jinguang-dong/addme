package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbc extends bhn {
    public int a;

    public bbc(long j, int i) {
        super(j);
        this.a = i;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new bbc(j, this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        this.a = ((bbc) bhnVar).a;
    }
}
