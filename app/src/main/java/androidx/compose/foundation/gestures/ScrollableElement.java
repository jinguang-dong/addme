package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.afy;
import defpackage.agi;
import defpackage.aii;
import defpackage.ajc;
import defpackage.ajd;
import defpackage.apg;
import defpackage.bij;
import defpackage.bwa;
import defpackage.ocq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScrollableElement extends bwa {
    private final ajd a;
    private final aii b;
    private final afy d;
    private final boolean e;
    private final boolean f;
    private final apg h;
    private final ocq i = null;
    private final agi g = null;

    public ScrollableElement(ajd ajdVar, aii aiiVar, afy afyVar, boolean z, boolean z2, apg apgVar) {
        this.a = ajdVar;
        this.b = aiiVar;
        this.d = afyVar;
        this.e = z;
        this.f = z2;
        this.h = apgVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new ajc(this.a, this.d, this.h, this.b, this.e, this.f, null);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((ajc) bijVar).A(this.a, this.b, this.d, this.e, this.f, this.h, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        if (!a.ao(this.a, scrollableElement.a) || this.b != scrollableElement.b || !a.ao(this.d, scrollableElement.d) || this.e != scrollableElement.e || this.f != scrollableElement.f || !a.ao(this.h, scrollableElement.h)) {
            return false;
        }
        ocq ocqVar = scrollableElement.i;
        if (!a.ao(null, null)) {
            return false;
        }
        agi agiVar = scrollableElement.g;
        return a.ao(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        afy afyVar = this.d;
        int iHashCode2 = ((((((iHashCode * 31) + (afyVar != null ? afyVar.hashCode() : 0)) * 31) + a.o(this.e)) * 31) + a.o(this.f)) * 31;
        apg apgVar = this.h;
        return (iHashCode2 + (apgVar != null ? apgVar.hashCode() : 0)) * 961;
    }
}
