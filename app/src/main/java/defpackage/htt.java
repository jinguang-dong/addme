package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class htt extends ojl {
    final /* synthetic */ lau a;
    final /* synthetic */ our b;
    final /* synthetic */ int c;
    final /* synthetic */ htv d;
    final /* synthetic */ int e;
    final /* synthetic */ hui f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htt(lau lauVar, our ourVar, int i, htv htvVar, int i2, hui huiVar) {
        super((short[]) null);
        this.a = lauVar;
        this.b = ourVar;
        this.c = i;
        this.d = htvVar;
        this.e = i2;
        this.f = huiVar;
    }

    @Override // defpackage.ojl
    public final void dI() {
        this.b.close();
    }

    @Override // defpackage.ojl
    public final void dY() {
        poj pojVarR = this.a.r();
        if (pojVarR == null) {
            ((sgt) htv.a.c().M(1537)).s("Frame image is null. Not adding preview frame");
            this.b.close();
            return;
        }
        our ourVar = this.b;
        ourVar.d(pojVarR);
        int i = this.c;
        htv htvVar = this.d;
        int i2 = this.e;
        hui huiVar = this.f;
        htvVar.j.put(Integer.valueOf(i), new htx(ourVar, new hts(htvVar, i2, pojVarR, huiVar, ourVar, 0)));
        htvVar.e(i);
    }
}
