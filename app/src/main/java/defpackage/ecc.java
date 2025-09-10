package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecc extends dcv {
    public ecc(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
