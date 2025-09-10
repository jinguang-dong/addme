package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kav extends ojl {
    final /* synthetic */ szh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kav(szh szhVar) {
        super((short[]) null);
        this.a = szhVar;
    }

    @Override // defpackage.ojl
    public final void dU(poe poeVar) {
        szh szhVar = this.a;
        if (poeVar == null) {
            szhVar.a(new NullPointerException("Null metadata provided."));
        } else {
            szhVar.e(poeVar);
        }
    }
}
