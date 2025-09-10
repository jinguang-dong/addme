package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class urj implements urk {
    public final uiq a;
    public final uiu b;
    private final urk c;

    public urj(urk urkVar, uiq uiqVar, uiu uiuVar) {
        this.c = urkVar;
        this.a = uiqVar;
        this.b = uiuVar;
    }

    @Override // defpackage.urk
    public final Object gc(url urlVar, uhb uhbVar) {
        uka ukaVar = new uka();
        ukaVar.a = uum.a;
        Object objGc = this.c.gc(new urx(this, ukaVar, urlVar, 1), uhbVar);
        return objGc == uhi.a ? objGc : ufg.a;
    }
}
