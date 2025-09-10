package androidx.compose.foundation;

import defpackage.a;
import defpackage.aew;
import defpackage.afr;
import defpackage.bij;
import defpackage.bwa;
import defpackage.cbk;
import defpackage.ocq;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClickableElement extends bwa {
    private final afr a;
    private final boolean b;
    private final boolean d;
    private final String e;
    private final cbk f;
    private final uif g;
    private final ocq h;

    public ClickableElement(ocq ocqVar, afr afrVar, boolean z, boolean z2, String str, cbk cbkVar, uif uifVar) {
        this.h = ocqVar;
        this.a = afrVar;
        this.b = z;
        this.d = z2;
        this.e = str;
        this.f = cbkVar;
        this.g = uifVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new aew(this.h, this.a, this.b, this.d, this.e, this.f, this.g);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((aew) bijVar).z(this.h, this.a, this.b, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return a.ao(this.h, clickableElement.h) && a.ao(this.a, clickableElement.a) && this.b == clickableElement.b && this.d == clickableElement.d && a.ao(this.e, clickableElement.e) && a.ao(this.f, clickableElement.f) && this.g == clickableElement.g;
    }

    public final int hashCode() {
        ocq ocqVar = this.h;
        int iHashCode = ocqVar != null ? ocqVar.hashCode() : 0;
        afr afrVar = this.a;
        int iHashCode2 = afrVar != null ? afrVar.hashCode() : 0;
        int i = iHashCode * 31;
        boolean z = this.b;
        boolean z2 = this.d;
        String str = this.e;
        int iO = (((((((i + iHashCode2) * 31) + a.o(z)) * 31) + a.o(z2)) * 31) + (str != null ? str.hashCode() : 0)) * 31;
        cbk cbkVar = this.f;
        return ((iO + (cbkVar != null ? cbkVar.a : 0)) * 31) + this.g.hashCode();
    }
}
