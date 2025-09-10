package androidx.compose.foundation;

import defpackage.a;
import defpackage.afy;
import defpackage.agb;
import defpackage.bij;
import defpackage.buo;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverscrollModifierElement extends bwa {
    private final afy a;

    public OverscrollModifierElement(afy afyVar) {
        this.a = afyVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        afy afyVar = this.a;
        return new agb(afyVar != null ? afyVar.d() : null);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        afy afyVar = this.a;
        agb agbVar = (agb) bijVar;
        buo buoVarD = afyVar != null ? afyVar.d() : null;
        buo buoVar = agbVar.a;
        if (buoVar != null) {
            agbVar.L(buoVar);
        }
        agbVar.a = buoVarD;
        agbVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && a.ao(this.a, ((OverscrollModifierElement) obj).a);
    }

    public final int hashCode() {
        afy afyVar = this.a;
        if (afyVar != null) {
            return afyVar.hashCode();
        }
        return 0;
    }
}
