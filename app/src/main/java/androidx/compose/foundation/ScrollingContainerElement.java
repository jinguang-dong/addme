package androidx.compose.foundation;

import defpackage.a;
import defpackage.afy;
import defpackage.agd;
import defpackage.aii;
import defpackage.ajd;
import defpackage.apg;
import defpackage.bij;
import defpackage.bwa;
import defpackage.ocq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ScrollingContainerElement extends bwa {
    private final ajd a;
    private final aii b;
    private final boolean d;
    private final afy e;
    private final apg f;
    private final ocq g;

    public ScrollingContainerElement(ajd ajdVar, aii aiiVar, boolean z, apg apgVar, ocq ocqVar, afy afyVar) {
        this.a = ajdVar;
        this.b = aiiVar;
        this.d = z;
        this.f = apgVar;
        this.g = ocqVar;
        this.e = afyVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new agd(this.a, this.b, this.d, this.f, this.g, this.e);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((agd) bijVar).d(this.a, this.b, this.e, this.d, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ScrollingContainerElement scrollingContainerElement = (ScrollingContainerElement) obj;
            return a.ao(this.a, scrollingContainerElement.a) && this.b == scrollingContainerElement.b && this.d == scrollingContainerElement.d && a.ao(this.f, scrollingContainerElement.f) && a.ao(this.g, scrollingContainerElement.g) && a.ao(null, null) && a.ao(this.e, scrollingContainerElement.e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        apg apgVar = this.f;
        int iHashCode2 = apgVar != null ? apgVar.hashCode() : 0;
        int iO = ((((((((((iHashCode * 31) + a.o(this.d)) * 31) + a.o(false)) * 31) + iHashCode2) * 31) + this.g.hashCode()) * 961) + a.o(false)) * 31;
        afy afyVar = this.e;
        return iO + (afyVar != null ? afyVar.hashCode() : 0);
    }
}
