package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pys implements sxi {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ tph c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ pys(pzb pzbVar, pvc pvcVar, pva pvaVar, pvp pvpVar, long j, int i) {
        this.f = i;
        this.e = pzbVar;
        this.c = pvcVar;
        this.d = pvaVar;
        this.b = pvpVar;
        this.a = j;
    }

    @Override // defpackage.sxi
    public final syu a(Object obj) {
        int i = this.f;
        if (i == 0) {
            Object obj2 = this.e;
            long j = this.a;
            Object obj3 = this.d;
            return ((pzb) this.b).n((pvl) this.c, (pul) obj3, j, (String) obj2);
        }
        if (i != 1) {
            Object obj4 = this.e;
            long j2 = this.a;
            Object obj5 = this.d;
            return ((pzb) this.b).n((pvl) this.c, (pul) obj5, j2, (String) obj4);
        }
        if (((Boolean) obj).booleanValue()) {
            return syq.a;
        }
        long j3 = this.a;
        Object obj6 = this.b;
        Object obj7 = this.d;
        return ((pzb) this.e).s((pvc) this.c, (pva) obj7, (pvp) obj6, j3);
    }

    public /* synthetic */ pys(pzb pzbVar, pvl pvlVar, pul pulVar, long j, String str, int i) {
        this.f = i;
        this.b = pzbVar;
        this.c = pvlVar;
        this.d = pulVar;
        this.a = j;
        this.e = str;
    }
}
