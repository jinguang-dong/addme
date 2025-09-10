package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecq extends dcv {
    public ecq(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
