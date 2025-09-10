package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.SHXc;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ujv extends ujg implements uld {
    public ujv() {
        super(ujg.d, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujv) {
            ujv ujvVar = (ujv) obj;
            return e().equals(ujvVar.e()) && this.f.equals(ujvVar.f) && this.g.equals(ujvVar.g) && a.ao(this.e, ujvVar.e);
        }
        if (obj instanceof uld) {
            return obj.equals(c());
        }
        return false;
    }

    protected final uld h() {
        ukw ukwVarC = c();
        if (ukwVarC != this) {
            return (uld) ukwVarC;
        }
        throw new uie();
    }

    public final int hashCode() {
        return (((e().hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public ujv(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }

    public final String toString() {
        ukw ukwVarC = c();
        if (ukwVarC != this) {
            return ukwVarC.toString();
        }
        return SHXc.bkXiGzieRyz + this.f + " (Kotlin reflection is not available)";
    }
}
