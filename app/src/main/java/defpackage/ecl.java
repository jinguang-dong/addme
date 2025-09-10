package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecl extends dcv {
    public ecl(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET state=? WHERE id=?";
    }
}
