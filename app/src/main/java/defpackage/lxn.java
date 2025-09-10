package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lxn implements pdm {
    public final /* synthetic */ rwc a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lxn(Object obj, rwc rwcVar, int i) {
        this.c = i;
        this.b = obj;
        this.a = rwcVar;
    }

    @Override // defpackage.pdm
    public final /* synthetic */ String a() {
        return "";
    }

    @Override // defpackage.pdm
    public final void d(phc phcVar) {
        if (this.c == 0) {
            ((pit) this.b).m(phcVar, (peo) this.a.c());
        } else {
            int i = kur.a;
            ojl.bB(phcVar, new kuq(this.b, this.a, 0));
        }
    }
}
