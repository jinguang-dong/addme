package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecd extends dcv {
    public ecd(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
