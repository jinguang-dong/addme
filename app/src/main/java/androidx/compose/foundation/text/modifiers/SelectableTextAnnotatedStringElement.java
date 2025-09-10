package androidx.compose.foundation.text.modifiers;

import defpackage.a;
import defpackage.aqm;
import defpackage.aqv;
import defpackage.aqw;
import defpackage.arb;
import defpackage.bij;
import defpackage.bko;
import defpackage.bkx;
import defpackage.bwa;
import defpackage.ccm;
import defpackage.cdo;
import defpackage.qqq;
import defpackage.uiq;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SelectableTextAnnotatedStringElement extends bwa {
    private final ccm a;
    private final cdo b;
    private final uiq d;
    private final int e;
    private final boolean f;
    private final int g;
    private final int h;
    private final List i;
    private final uiq j;
    private final aqw k;
    private final bkx l;
    private final aqm m = null;
    private final qqq n;

    public SelectableTextAnnotatedStringElement(ccm ccmVar, cdo cdoVar, qqq qqqVar, uiq uiqVar, int i, boolean z, int i2, int i3, List list, uiq uiqVar2, aqw aqwVar, bkx bkxVar) {
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
        this.k = aqwVar;
        this.l = bkxVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new aqv(this.a, this.b, this.n, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        aqv aqvVar = (aqv) bijVar;
        arb arbVar = aqvVar.b;
        bkx bkxVar = this.l;
        cdo cdoVar = this.b;
        uiq uiqVar = this.d;
        uiq uiqVar2 = this.j;
        aqw aqwVar = this.k;
        arbVar.l(arbVar.r(bkxVar, cdoVar), arbVar.t(this.a), arbVar.u(cdoVar, this.i, this.h, this.g, this.f, this.n, this.e), arbVar.q(uiqVar, uiqVar2, aqwVar, null));
        aqvVar.a = aqwVar;
        bko.u(aqvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        if (!a.ao(this.l, selectableTextAnnotatedStringElement.l) || !a.ao(this.a, selectableTextAnnotatedStringElement.a) || !a.ao(this.b, selectableTextAnnotatedStringElement.b) || !a.ao(this.i, selectableTextAnnotatedStringElement.i) || !a.ao(this.n, selectableTextAnnotatedStringElement.n)) {
            return false;
        }
        aqm aqmVar = selectableTextAnnotatedStringElement.m;
        return a.ao(null, null) && this.d == selectableTextAnnotatedStringElement.d && a.p(this.e, selectableTextAnnotatedStringElement.e) && this.f == selectableTextAnnotatedStringElement.f && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.j == selectableTextAnnotatedStringElement.j && a.ao(this.k, selectableTextAnnotatedStringElement.k);
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.n.hashCode();
        uiq uiqVar = this.d;
        int iHashCode2 = ((((((((((iHashCode * 31) + (uiqVar != null ? uiqVar.hashCode() : 0)) * 31) + this.e) * 31) + a.o(this.f)) * 31) + this.g) * 31) + this.h) * 31;
        List list = this.i;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        uiq uiqVar2 = this.j;
        int iHashCode4 = ((iHashCode3 + (uiqVar2 != null ? uiqVar2.hashCode() : 0)) * 31) + this.k.hashCode();
        bkx bkxVar = this.l;
        return (iHashCode4 * 961) + (bkxVar != null ? bkxVar.hashCode() : 0);
    }
}
