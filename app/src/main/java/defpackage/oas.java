package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class oas extends obd {
    final /* synthetic */ oau a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oas(oau oauVar, oar oarVar) {
        super(oarVar);
        this.a = oauVar;
    }

    @Override // defpackage.obd
    public final void a() {
        oak.a();
        oau oauVar = this.a;
        if (oauVar.D()) {
            oauVar.q("Inactivity, disconnecting from device AnalyticsService");
            oauVar.b();
        }
    }
}
