package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecm extends dcv {
    public ecm(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
