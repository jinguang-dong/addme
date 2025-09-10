package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaj implements url {
    final /* synthetic */ ado a;
    final /* synthetic */ bbo b;
    final /* synthetic */ baf c;

    public aaj(baf bafVar, ado adoVar, bbo bboVar) {
        this.c = bafVar;
        this.a = adoVar;
        this.b = bboVar;
    }

    @Override // defpackage.url
    public final /* bridge */ /* synthetic */ Object a(Object obj, uhb uhbVar) {
        boolean zBooleanValue;
        if (((Boolean) obj).booleanValue()) {
            uiu uiuVar = (uiu) this.b.a();
            ado adoVar = this.a;
            zBooleanValue = ((Boolean) uiuVar.a(adoVar.d(), adoVar.e())).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.c.b(Boolean.valueOf(zBooleanValue));
        return ufg.a;
    }
}
