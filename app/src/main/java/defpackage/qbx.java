package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class qbx implements sxi {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ qbx(pzb pzbVar, pvc pvcVar, int i, int i2, int i3) {
        this.e = i3;
        this.d = pzbVar;
        this.c = pvcVar;
        this.b = i;
        this.a = i2;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, sxh] */
    @Override // defpackage.sxi
    public final syu a(Object obj) {
        if (this.e != 0) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.c;
            if (!zBooleanValue) {
                qbu.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", ((pvc) obj2).d);
                return ske.M(false);
            }
            return ((pzb) this.d).p((pvc) obj2, this.b + 1, this.a);
        }
        rwc rwcVar = (rwc) obj;
        if (!rwcVar.h()) {
            return syq.a;
        }
        int i = this.a;
        int i2 = this.b;
        return qdp.e(this.d.a()).f(new qbw((qbz) this.c, i2, i, rwcVar, 0), sxo.a);
    }

    public /* synthetic */ qbx(qbz qbzVar, sxh sxhVar, int i, int i2, int i3) {
        this.e = i3;
        this.c = qbzVar;
        this.d = sxhVar;
        this.b = i;
        this.a = i2;
    }
}
