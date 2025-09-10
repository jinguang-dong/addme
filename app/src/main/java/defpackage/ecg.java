package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecg extends dcv {
    public ecg(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET stop_reason=? WHERE id=?";
    }
}
