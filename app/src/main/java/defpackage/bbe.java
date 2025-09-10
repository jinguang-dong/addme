package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbe extends bhn {
    public long a;

    public bbe(long j, long j2) {
        super(j);
        this.a = j2;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new bbe(j, this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        this.a = ((bbe) bhnVar).a;
    }
}
