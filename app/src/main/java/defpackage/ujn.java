package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ujn extends ujg implements ujm, ukz {
    private final int a;
    private final int b;

    public ujn(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.b = 0;
    }

    @Override // defpackage.ujm
    public final int cT() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ujn)) {
            if (obj instanceof ukz) {
                return obj.equals(c());
            }
            return false;
        }
        ujn ujnVar = (ujn) obj;
        if (this.f.equals(ujnVar.f) && this.g.equals(ujnVar.g)) {
            int i = ujnVar.b;
            if (this.a == ujnVar.a && a.ao(this.e, ujnVar.e) && a.ao(e(), ujnVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ujg
    protected final void g() {
        int i = ukb.a;
    }

    public final int hashCode() {
        return (((e() == null ? 0 : e().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        ukw ukwVarC = c();
        if (ukwVarC != this) {
            return ukwVarC.toString();
        }
        String str = this.f;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : a.bw(str, "function ", " (Kotlin reflection is not available)");
    }

    public ujn(int i, Class cls, String str, String str2, int i2) {
        this(i, d, cls, str, str2, i2);
    }
}
