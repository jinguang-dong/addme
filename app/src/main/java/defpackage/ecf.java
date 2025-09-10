package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ecf extends dcv {
    public ecf(dco dcoVar) {
        super(dcoVar);
    }

    @Override // defpackage.dcv
    public final String c() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
