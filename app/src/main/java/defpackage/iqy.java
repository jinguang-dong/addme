package defpackage;

import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iqy {
    public final Optional a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final szh f;
    public final szh g;
    public final boolean h;
    public final sbp i;

    public iqy() {
        throw null;
    }

    public static iqx a() {
        iqx iqxVar = new iqx((byte[]) null);
        iqxVar.c = new szh();
        iqxVar.d = new szh();
        iqxVar.f(false);
        iqxVar.a = Optional.empty();
        iqxVar.c(Optional.empty());
        iqxVar.b = Optional.empty();
        iqxVar.d(Optional.empty());
        int i = sbp.d;
        iqxVar.b(sex.a);
        iqxVar.e(false);
        return iqxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof iqy) {
            iqy iqyVar = (iqy) obj;
            if (this.a.equals(iqyVar.a) && this.b.equals(iqyVar.b) && this.c.equals(iqyVar.c) && this.d.equals(iqyVar.d) && this.e == iqyVar.e && this.f.equals(iqyVar.f) && this.g.equals(iqyVar.g) && this.h == iqyVar.h && ujp.aH(this.i, iqyVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003);
    }

    public iqy(Optional optional, Optional optional2, Optional optional3, Optional optional4, boolean z, szh szhVar, szh szhVar2, boolean z2, sbp sbpVar) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = z;
        this.f = szhVar;
        this.g = szhVar2;
        this.h = z2;
        this.i = sbpVar;
    }

    public final String toString() {
        sbp sbpVar = this.i;
        szh szhVar = this.g;
        szh szhVar2 = this.f;
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(optional3);
        String strValueOf3 = String.valueOf(optional2);
        String strValueOf4 = String.valueOf(optional);
        String strValueOf5 = String.valueOf(szhVar2);
        String strValueOf6 = String.valueOf(szhVar);
        String strValueOf7 = String.valueOf(sbpVar);
        StringBuilder sb = new StringBuilder("{");
        sb.append(strValueOf);
        String str = zflNUOOzDfM.cZkWqylmFdqz;
        sb.append(str);
        sb.append(strValueOf2);
        sb.append(str);
        sb.append(strValueOf3);
        sb.append(str);
        sb.append(strValueOf4);
        sb.append(str);
        sb.append(this.e);
        sb.append(str);
        sb.append(strValueOf5);
        sb.append(str);
        sb.append(strValueOf6);
        sb.append(str);
        sb.append(this.h);
        sb.append(str);
        sb.append(strValueOf7);
        sb.append("}");
        return sb.toString();
    }
}
