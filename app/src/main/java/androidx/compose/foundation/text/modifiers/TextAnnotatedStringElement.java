package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.aqw;
import defpackage.arb;
import defpackage.bij;
import defpackage.bkx;
import defpackage.bwa;
import defpackage.ccm;
import defpackage.cdo;
import defpackage.qqq;
import defpackage.uiq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TextAnnotatedStringElement extends bwa {
    private final ccm a;
    private final cdo b;
    private final uiq d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final List i;
    private final uiq j;
    private final aqw k = null;
    private final bkx l;
    private final uiq m;
    private final qqq n;

    public TextAnnotatedStringElement(ccm ccmVar, cdo cdoVar, qqq qqqVar, uiq uiqVar, int i, boolean z, int i2, int i3, List list, uiq uiqVar2, bkx bkxVar, uiq uiqVar3) {
        this.a = ccmVar;
        this.b = cdoVar;
        this.n = qqqVar;
        this.d = uiqVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = list;
        this.j = uiqVar2;
        this.l = bkxVar;
        this.m = uiqVar3;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new arb(this.a, this.b, this.n, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null, this.l, this.m);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        arb arbVar = (arb) bijVar;
        bkx bkxVar = this.l;
        cdo cdoVar = this.b;
        arbVar.l(arbVar.r(bkxVar, cdoVar), arbVar.t(this.a), arbVar.u(cdoVar, this.i, this.h, this.g, this.f, this.n, this.e), arbVar.q(this.d, this.j, null, this.m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        if (!a.ao(this.l, textAnnotatedStringElement.l) || !a.ao(this.a, textAnnotatedStringElement.a) || !a.ao(this.b, textAnnotatedStringElement.b) || !a.ao(this.i, textAnnotatedStringElement.i) || !a.ao(this.n, textAnnotatedStringElement.n) || this.d != textAnnotatedStringElement.d || this.m != textAnnotatedStringElement.m || !a.p(this.e, textAnnotatedStringElement.e) || this.f != textAnnotatedStringElement.f || this.g != textAnnotatedStringElement.g || this.h != textAnnotatedStringElement.h || this.j != textAnnotatedStringElement.j) {
            return false;
        }
        aqw aqwVar = textAnnotatedStringElement.k;
        return a.ao(null, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        uiq uiqVar = this.d;
        int iHashCode2 = ((((((((((iHashCode * 31) + (uiqVar != null ? uiqVar.hashCode() : 0)) * 31) + this.e) * 31) + a.o(this.f)) * 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        uiq uiqVar2 = this.j;
        int iHashCode4 = iHashCode3 + (uiqVar2 != null ? uiqVar2.hashCode() : 0);
        bkx bkxVar = this.l;
        int iHashCode5 = ((iHashCode4 * 961) + (bkxVar != null ? bkxVar.hashCode() : 0)) * 31;
        uiq uiqVar3 = this.m;
        return iHashCode5 + (uiqVar3 != null ? uiqVar3.hashCode() : 0);
    }
}
