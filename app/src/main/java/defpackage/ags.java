package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ags implements ajd {
    public final uiq a;
    public final azr c;
    public final azr d;
    public final azr e;
    public final aim b = new agr(this);
    public final byz f = new byz(null, null, null, null);

    public ags(uiq uiqVar) {
        this.a = uiqVar;
        bap bapVar = bap.c;
        this.c = new azz(false, bapVar);
        this.d = new azz(false, bapVar);
        this.e = new azz(false, bapVar);
    }

    @Override // defpackage.ajd
    public final float a(float f) {
        return ((Number) this.a.a(Float.valueOf(f))).floatValue();
    }

    @Override // defpackage.ajd
    public final Object b(afs afsVar, uiu uiuVar, uhb uhbVar) throws Throwable {
        Object objI = ung.i(new agq(this, afsVar, uiuVar, (uhb) null, 0), uhbVar);
        return objI == uhi.a ? objI : ufg.a;
    }

    @Override // defpackage.ajd
    public final /* synthetic */ boolean c() {
        return true;
    }

    @Override // defpackage.ajd
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // defpackage.ajd
    public final boolean e() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
