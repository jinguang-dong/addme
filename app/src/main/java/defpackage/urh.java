package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class urh extends utw {
    private final uiu d;

    public urh(uiu uiuVar, uhf uhfVar, int i, int i2) {
        super(uhfVar, i, i2);
        this.d = uiuVar;
    }

    static /* synthetic */ Object g(urh urhVar, uqx uqxVar, uhb uhbVar) {
        Object objA = urhVar.d.a(uqxVar, uhbVar);
        return objA == uhi.a ? objA : ufg.a;
    }

    @Override // defpackage.utw
    protected Object b(uqx uqxVar, uhb uhbVar) {
        return g(this, uqxVar, uhbVar);
    }

    @Override // defpackage.utw
    protected utw c(uhf uhfVar, int i, int i2) {
        return new urh(this.d, uhfVar, i, i2);
    }

    @Override // defpackage.utw
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
