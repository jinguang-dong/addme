package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ebz extends dcv {
    public ebz(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
