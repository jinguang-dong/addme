package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecn extends dcv {
    public ecn(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
