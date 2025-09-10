package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdx extends ojl {
    final /* synthetic */ String a;
    final /* synthetic */ pec b;
    final /* synthetic */ pdk c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdx(String str, pec pecVar, pdk pdkVar) {
        super((short[]) null);
        this.a = str;
        this.b = pecVar;
        this.c = pdkVar;
        this.d = str.isEmpty() ? ojl.bJ(pecVar.getClass()) : str;
    }

    @Override // defpackage.ojl
    public final String bD() {
        return this.d;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.b.a(this.c);
    }

    @Override // defpackage.ojl
    public final void dY() {
        this.b.a(this.c);
    }
}
