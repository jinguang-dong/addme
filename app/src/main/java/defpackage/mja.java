package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mja extends ojl {
    final /* synthetic */ mje a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mja(mje mjeVar) {
        super((short[]) null);
        this.a = mjeVar;
    }

    @Override // defpackage.ojl
    public final void a(poe poeVar) {
        mje mjeVar = this.a;
        mjeVar.t.a(poeVar);
        klu kluVar = mjeVar.I;
        if (kluVar != null) {
            kluVar.a(poeVar);
        }
        mjeVar.k.a(poeVar);
    }
}
