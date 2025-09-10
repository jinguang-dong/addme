package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bbg extends bhn {
    public Object a;

    public bbg(long j, Object obj) {
        super(j);
        this.a = obj;
    }

    @Override // defpackage.bhn
    public final /* bridge */ /* synthetic */ bhn a(long j) {
        return new bbg(bgr.b().v(), this.a);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        this.a = ((bbg) bhnVar).a;
    }
}
