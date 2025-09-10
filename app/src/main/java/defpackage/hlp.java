package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hlp extends ojl {
    final /* synthetic */ pdk a;
    final /* synthetic */ hlv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hlp(pdk pdkVar, hlv hlvVar) {
        super((short[]) null);
        this.a = pdkVar;
        this.b = hlvVar;
    }

    @Override // defpackage.ojl
    public final void dU(poe poeVar) {
        pdo pdoVarB = this.a.b();
        if (pdoVarB == null || poeVar == null) {
            return;
        }
        this.b.a(pdoVarB.b, poeVar);
    }
}
