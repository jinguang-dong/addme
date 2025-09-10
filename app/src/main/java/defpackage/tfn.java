package defpackage;

import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfn {
    public final sbp a;
    public final Optional b;
    public final Optional c;
    public final int d;

    public tfn() {
        throw null;
    }

    public static tfm a() {
        tfm tfmVar = new tfm((byte[]) null);
        int i = sbp.d;
        tfmVar.b(sex.a);
        tfmVar.a = 1;
        return tfmVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tfn) {
            tfn tfnVar = (tfn) obj;
            if (ujp.aH(this.a, tfnVar.a) && this.b.equals(tfnVar.b) && this.c.equals(tfnVar.c)) {
                int i = this.d;
                int i2 = tfnVar.d;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        int i = this.d;
        a.aF(i);
        return i ^ (iHashCode * 1000003);
    }

    public tfn(sbp sbpVar, Optional optional, Optional optional2, int i) {
        this.a = sbpVar;
        this.b = optional;
        this.c = optional2;
        this.d = i;
    }

    public final String toString() {
        int i = this.d;
        Optional optional = this.c;
        Optional optional2 = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(optional2) + ", " + String.valueOf(optional) + ", " + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "HALF_BODY" : "FULL_BODY" : TOnSyMaYeslEl.pIkOyhlHoH : "NO_PERSON" : "UNKNOWN") + "}";
    }
}
