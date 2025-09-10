package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class het implements uiq {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    private final /* synthetic */ int c;

    public /* synthetic */ het(long j, long j2, int i) {
        this.c = i;
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        if (this.c != 0) {
            bvo bvoVar = (bvo) obj;
            bvoVar.getClass();
            byi.am(bvoVar, this.a, 0.0f, 0L, null, 11, 62);
            byi.am(bvoVar, this.b, 0.0f, 0L, null, 4, 62);
            return ufg.a;
        }
        ddo ddoVar = (ddo) obj;
        ddw ddwVarA = ddoVar.a("UPDATE shots SET most_recent_event_millis = ? WHERE shot_id = ?");
        long j = this.a;
        long j2 = this.b;
        try {
            ddwVarA.e(1, j);
            ddwVarA.e(2, j2);
            ddwVarA.j();
            return Integer.valueOf(cgh.x(ddoVar));
        } finally {
            ddwVarA.close();
        }
    }
}
