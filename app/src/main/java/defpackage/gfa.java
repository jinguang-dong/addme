package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfa implements oyz {
    private final /* synthetic */ int a;

    public gfa(int i) {
        this.a = i;
    }

    @Override // defpackage.oyz
    public final oyi a(oyj oyjVar, rwc rwcVar, owq owqVar, oxp oxpVar) {
        return this.a != 0 ? new gex(oyjVar, rwcVar, owqVar, oxpVar) : new gfb(oyjVar, rwcVar, owqVar, oxpVar);
    }

    @Override // defpackage.oyz
    public final oym b() {
        return this.a != 0 ? oym.FRAME_METADATA : oym.FRAME_METADATA;
    }
}
