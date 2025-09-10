package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kxo extends ojl {
    final /* synthetic */ szh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxo(szh szhVar) {
        super((short[]) null);
        this.a = szhVar;
    }

    @Override // defpackage.ojl
    public final void dH(piw piwVar) {
        String strValueOf = piwVar != null ? String.valueOf(piwVar.a()) : "Unknown";
        sgt sgtVar = (sgt) kxp.a.c().M(3617);
        String strConcat = "Failed to receive frame metadata. Reason: ".concat(String.valueOf(strValueOf));
        sgtVar.v("%s", strConcat);
        this.a.a(new Throwable(strConcat));
    }

    @Override // defpackage.ojl
    public final void dT(pnx pnxVar) {
        pnxVar.d();
        this.a.e(pnxVar);
    }
}
