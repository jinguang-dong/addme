package androidx.wear.compose.foundation.rotary;

import defpackage.a;
import defpackage.afy;
import defpackage.bij;
import defpackage.bwa;
import defpackage.dnj;
import defpackage.dnq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class RotaryHandlerElement extends bwa {
    private final afy a;
    private final dnj b;

    public RotaryHandlerElement(dnj dnjVar, afy afyVar) {
        this.b = dnjVar;
        this.a = afyVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dnq(this.b, this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        dnq dnqVar = (dnq) bijVar;
        dnqVar.c = this.b;
        dnqVar.a = this.a;
        dnqVar.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RotaryHandlerElement rotaryHandlerElement = (RotaryHandlerElement) obj;
        return a.ao(this.b, rotaryHandlerElement.b) && a.ao(this.a, rotaryHandlerElement.a);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        afy afyVar = this.a;
        return ((iHashCode + (afyVar != null ? afyVar.hashCode() : 0)) * 31) + 1237;
    }
}
