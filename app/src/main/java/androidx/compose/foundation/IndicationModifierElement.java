package androidx.compose.foundation;

import defpackage.a;
import defpackage.afq;
import defpackage.afr;
import defpackage.bij;
import defpackage.buo;
import defpackage.bwa;
import defpackage.ocq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IndicationModifierElement extends bwa {
    private final afr a;
    private final ocq b;

    public IndicationModifierElement(ocq ocqVar, afr afrVar) {
        this.b = ocqVar;
        this.a = afrVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new afq(this.a.b(this.b));
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        afq afqVar = (afq) bijVar;
        buo buoVarB = this.a.b(this.b);
        afqVar.L(afqVar.a);
        afqVar.a = buoVarB;
        afqVar.M(buoVarB);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return a.ao(this.b, indicationModifierElement.b) && a.ao(this.a, indicationModifierElement.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
