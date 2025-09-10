package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kwy extends ojl {
    final /* synthetic */ pdk a;
    final /* synthetic */ szh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwy(pdk pdkVar, szh szhVar) {
        super((short[]) null);
        this.a = pdkVar;
        this.b = szhVar;
    }

    @Override // defpackage.ojl
    public final void dU(poe poeVar) {
        if (poeVar != null) {
            this.b.e(poeVar);
        } else {
            ((sgt) kwz.a.c().M(3557)).v("Failed to get metadata for frame %s", this.a);
            this.b.a(new pco());
        }
    }
}
