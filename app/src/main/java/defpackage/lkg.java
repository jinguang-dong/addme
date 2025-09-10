package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lkg implements gwy {
    private final owq a;

    public lkg(owq owqVar) {
        this.a = owqVar;
    }

    @Override // defpackage.gwy
    public final void a(int i) {
        owq owqVar = this.a;
        if (((lkk) owqVar.dL()).equals(lkk.AUTO)) {
            return;
        }
        lkk lkkVar = i == 0 ? lkk.ULTRAWIDE : i == 1 ? lkk.WIDE : i == 2 ? lkk.TELE : null;
        if (lkkVar != null) {
            owqVar.a(lkkVar);
        }
    }
}
