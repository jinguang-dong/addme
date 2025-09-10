package androidx.compose.foundation.gestures;

import defpackage.a;
import defpackage.add;
import defpackage.ahs;
import defpackage.aii;
import defpackage.bij;
import defpackage.bwa;
import defpackage.got;
import defpackage.ocq;
import defpackage.uiq;
import defpackage.uiv;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class DraggableElement extends bwa {
    private static final uiq a = new add(7);
    private final aii b;
    private final boolean d;
    private final boolean e;
    private final uiv f;
    private final uiv g;
    private final got h;
    private final ocq i;

    public DraggableElement(got gotVar, aii aiiVar, boolean z, ocq ocqVar, boolean z2, uiv uivVar, uiv uivVar2) {
        this.h = gotVar;
        this.b = aiiVar;
        this.d = z;
        this.i = ocqVar;
        this.e = z2;
        this.f = uivVar;
        this.g = uivVar2;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new ahs(this.h, a, this.b, this.d, this.i, this.e, this.f, this.g);
    }

    @Override // defpackage.bwa
    public final /* synthetic */ void b(bij bijVar) {
        boolean z;
        boolean z2;
        ahs ahsVar = (ahs) bijVar;
        uiq uiqVar = a;
        got gotVar = ahsVar.l;
        got gotVar2 = this.h;
        if (a.ao(gotVar, gotVar2)) {
            z = false;
        } else {
            ahsVar.l = gotVar2;
            z = true;
        }
        aii aiiVar = this.b;
        if (ahsVar.h != aiiVar) {
            ahsVar.h = aiiVar;
            z2 = true;
        } else {
            z2 = z;
        }
        uiv uivVar = this.g;
        uiv uivVar2 = this.f;
        boolean z3 = this.e;
        ocq ocqVar = this.i;
        boolean z4 = this.d;
        ahsVar.j = uivVar2;
        ahsVar.k = uivVar;
        ahsVar.i = z3;
        ahsVar.z(uiqVar, z4, ocqVar, aiiVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return a.ao(this.h, draggableElement.h) && this.b == draggableElement.b && this.d == draggableElement.d && a.ao(this.i, draggableElement.i) && this.e == draggableElement.e && a.ao(this.f, draggableElement.f) && a.ao(this.g, draggableElement.g);
    }

    public final int hashCode() {
        int iHashCode = (this.h.hashCode() * 31) + this.b.hashCode();
        ocq ocqVar = this.i;
        return (((((((((((iHashCode * 31) + a.o(this.d)) * 31) + (ocqVar != null ? ocqVar.hashCode() : 0)) * 31) + a.o(this.e)) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + a.o(false);
    }
}
