package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bba extends bhn {
    public float a;

    public bba(long j, float f) {
        super(j);
        this.a = f;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new bba(j, this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        this.a = ((bba) bhnVar).a;
    }
}
