package androidx.compose.foundation;

import defpackage.a;
import defpackage.aen;
import defpackage.aez;
import defpackage.afr;
import defpackage.bad;
import defpackage.bij;
import defpackage.bql;
import defpackage.bwa;
import defpackage.cbk;
import defpackage.ocq;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CombinedClickableElement extends bwa {
    private final afr a;
    private final boolean b;
    private final cbk d;
    private final uif e;
    private final ocq f;

    public /* synthetic */ CombinedClickableElement(ocq ocqVar, afr afrVar, boolean z, cbk cbkVar, uif uifVar) {
        this.f = ocqVar;
        this.a = afrVar;
        this.b = z;
        this.d = cbkVar;
        this.e = uifVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new aez(this.e, this.f, this.a, this.b, this.d);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        bql bqlVar;
        aez aezVar = (aez) bijVar;
        if (!a.ao(null, null)) {
            bad.D(aezVar);
        }
        cbk cbkVar = this.d;
        boolean z = this.b;
        afr afrVar = this.a;
        ocq ocqVar = this.f;
        uif uifVar = this.e;
        boolean z2 = ((aen) aezVar).a;
        aezVar.z(ocqVar, afrVar, false, z, null, cbkVar, uifVar);
        if (z2 == z || (bqlVar = aezVar.f) == null) {
            return;
        }
        bqlVar.o();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return a.ao(this.f, combinedClickableElement.f) && a.ao(this.a, combinedClickableElement.a) && this.b == combinedClickableElement.b && a.ao(null, null) && a.ao(this.d, combinedClickableElement.d) && this.e == combinedClickableElement.e && a.ao(null, null);
    }

    public final int hashCode() {
        ocq ocqVar = this.f;
        int iHashCode = ocqVar != null ? ocqVar.hashCode() : 0;
        afr afrVar = this.a;
        int iHashCode2 = afrVar != null ? afrVar.hashCode() : 0;
        int i = iHashCode * 31;
        int iO = a.o(false);
        boolean z = this.b;
        cbk cbkVar = this.d;
        return ((((((((((i + iHashCode2) * 31) + iO) * 31) + a.o(z)) * 961) + (cbkVar != null ? cbkVar.a : 0)) * 31) + this.e.hashCode()) * 923521) + a.o(true);
    }
}
