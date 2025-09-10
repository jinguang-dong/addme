package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.are;
import defpackage.bad;
import defpackage.bij;
import defpackage.bko;
import defpackage.bkx;
import defpackage.bwa;
import defpackage.cdo;
import defpackage.qqq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends bwa {
    private final String a;
    private final cdo b;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final bkx h;
    private final qqq i;

    public TextStringSimpleElement(String str, cdo cdoVar, qqq qqqVar, int i, boolean z, int i2, int i3, bkx bkxVar) {
        this.a = str;
        this.b = cdoVar;
        this.i = qqqVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = bkxVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new are(this.a, this.b, this.i, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        are areVar = (are) bijVar;
        bkx bkxVar = areVar.g;
        bkx bkxVar2 = this.h;
        boolean zAo = a.ao(bkxVar2, bkxVar);
        areVar.g = bkxVar2;
        boolean z = false;
        boolean z2 = true;
        boolean z3 = (zAo && this.b.u(areVar.b)) ? false : true;
        String str = this.a;
        if (!a.ao(areVar.a, str)) {
            areVar.a = str;
            areVar.k();
            z = true;
        }
        cdo cdoVar = this.b;
        int i = this.g;
        int i2 = this.f;
        boolean z4 = this.e;
        qqq qqqVar = this.i;
        int i3 = this.d;
        boolean z5 = !areVar.b.v(cdoVar);
        areVar.b = cdoVar;
        if (areVar.f != i) {
            areVar.f = i;
            z5 = true;
        }
        if (areVar.e != i2) {
            areVar.e = i2;
            z5 = true;
        }
        if (areVar.d != z4) {
            areVar.d = z4;
            z5 = true;
        }
        if (!a.ao(areVar.j, qqqVar)) {
            areVar.j = qqqVar;
            z5 = true;
        }
        if (a.p(areVar.c, i3)) {
            z2 = z5;
        } else {
            areVar.c = i3;
        }
        if (z || z2) {
            areVar.h().f(areVar.a, areVar.b, areVar.j, areVar.c, areVar.d, areVar.e);
        }
        if (areVar.w) {
            if (z || (z3 && areVar.h != null)) {
                bad.D(areVar);
            }
            if (z || z2) {
                bko.u(areVar);
                bko.x(areVar);
            }
            if (z3) {
                bko.x(areVar);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return a.ao(this.h, textStringSimpleElement.h) && a.ao(this.a, textStringSimpleElement.a) && a.ao(this.b, textStringSimpleElement.b) && a.ao(this.i, textStringSimpleElement.i) && a.p(this.d, textStringSimpleElement.d) && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.i.hashCode();
        bkx bkxVar = this.h;
        return (((((((((iHashCode * 31) + this.d) * 31) + a.o(this.e)) * 31) + this.f) * 31) + this.g) * 31) + (bkxVar != null ? bkxVar.hashCode() : 0);
    }
}
