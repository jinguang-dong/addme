package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class erv implements eqi {
    private final eqi b;
    private final eqi c;

    public erv(eqi eqiVar, eqi eqiVar2) {
        this.b = eqiVar;
        this.c = eqiVar2;
    }

    @Override // defpackage.eqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // defpackage.eqi
    public final boolean equals(Object obj) {
        if (obj instanceof erv) {
            erv ervVar = (erv) obj;
            if (this.b.equals(ervVar.b) && this.c.equals(ervVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eqi
    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        eqi eqiVar = this.c;
        return "DataCacheKey{sourceKey=" + String.valueOf(this.b) + ", signature=" + String.valueOf(eqiVar) + "}";
    }
}
