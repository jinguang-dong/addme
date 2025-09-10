package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class uoz extends una {
    protected final String e() {
        uoz uozVarI;
        una unaVar = unr.a;
        uoz uozVar = uvw.a;
        if (this == uozVar) {
            return "Dispatchers.Main";
        }
        try {
            uozVarI = uozVar.i();
        } catch (UnsupportedOperationException unused) {
            uozVarI = null;
        }
        if (this == uozVarI) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract uoz i();

    @Override // defpackage.una
    public String toString() {
        String strE = e();
        if (strE != null) {
            return strE;
        }
        return ung.a(this) + "@" + ung.b(this);
    }
}
