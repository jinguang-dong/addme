package androidx.wear.compose.foundation.lazy;

import androidx.wear.ambient.AmbientModeSupport;
import defpackage.a;
import defpackage.aii;
import defpackage.bad;
import defpackage.bij;
import defpackage.bwa;
import defpackage.dkr;
import defpackage.uif;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LazyLayoutSemanticsModifierElement extends bwa {
    private final uif a;
    private final aii b;
    private final boolean d;
    private final boolean e = false;
    private final AmbientModeSupport.AmbientController f;

    public LazyLayoutSemanticsModifierElement(uif uifVar, AmbientModeSupport.AmbientController ambientController, aii aiiVar, boolean z) {
        this.a = uifVar;
        this.f = ambientController;
        this.b = aiiVar;
        this.d = z;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dkr(this.a, this.f, this.b, this.d);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        dkr dkrVar = (dkr) bijVar;
        dkrVar.a = this.a;
        dkrVar.d = this.f;
        aii aiiVar = dkrVar.b;
        aii aiiVar2 = this.b;
        if (aiiVar != aiiVar2) {
            dkrVar.b = aiiVar2;
            bad.D(dkrVar);
        }
        boolean z = this.d;
        if (dkrVar.c == z) {
            return;
        }
        dkrVar.c = z;
        dkrVar.c();
        bad.D(dkrVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifierElement)) {
            return false;
        }
        LazyLayoutSemanticsModifierElement lazyLayoutSemanticsModifierElement = (LazyLayoutSemanticsModifierElement) obj;
        if (this.a != lazyLayoutSemanticsModifierElement.a || !a.ao(this.f, lazyLayoutSemanticsModifierElement.f) || this.b != lazyLayoutSemanticsModifierElement.b || this.d != lazyLayoutSemanticsModifierElement.d) {
            return false;
        }
        boolean z = lazyLayoutSemanticsModifierElement.e;
        return true;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.f.hashCode()) * 31) + this.b.hashCode()) * 31) + a.o(this.d)) * 31) + a.o(false);
    }
}
