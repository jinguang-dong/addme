package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.list.CaNf.PJGqOKsIpSdZ;
import com.google.googlex.gcam.dirtylens.PrCd.TOnSyMaYeslEl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdk {
    public final ccm a;
    public final cdo b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final chq g;
    public final cib h;
    public final long i;
    public final qqq j;

    public cdk(ccm ccmVar, cdo cdoVar, List list, int i, boolean z, int i2, chq chqVar, cib cibVar, qqq qqqVar, long j) {
        this.a = ccmVar;
        this.b = cdoVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = chqVar;
        this.h = cibVar;
        this.j = qqqVar;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdk)) {
            return false;
        }
        cdk cdkVar = (cdk) obj;
        return a.ao(this.a, cdkVar.a) && a.ao(this.b, cdkVar.b) && a.ao(this.c, cdkVar.c) && this.d == cdkVar.d && this.e == cdkVar.e && a.p(this.f, cdkVar.f) && a.ao(this.g, cdkVar.g) && this.h == cdkVar.h && a.ao(this.j, cdkVar.j) && a.q(this.i, cdkVar.i);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        chq chqVar = this.g;
        return (((((((((((((iHashCode * 31) + this.d) * 31) + a.o(this.e)) * 31) + this.f) * 31) + chqVar.hashCode()) * 31) + this.h.hashCode()) * 31) + this.j.hashCode()) * 31) + a.r(this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (a.p(i, 1) ? "Clip" : a.p(i, 2) ? "Ellipsis" : a.p(i, 5) ? "MiddleEllipsis" : a.p(i, 3) ? PJGqOKsIpSdZ.VFoULQkgthEqXK : a.p(i, 4) ? "StartEllipsis" : "Invalid"));
        sb.append(TOnSyMaYeslEl.uBQJRfhzp);
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.j);
        sb.append(", constraints=");
        sb.append((Object) cho.e(this.i));
        sb.append(')');
        return sb.toString();
    }
}
