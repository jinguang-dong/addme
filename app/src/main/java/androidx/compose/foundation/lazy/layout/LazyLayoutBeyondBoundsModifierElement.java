package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.aii;
import defpackage.anz;
import defpackage.bij;
import defpackage.bwa;
import defpackage.ocq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends bwa {
    private final boolean a = false;
    private final aii b;
    private final ocq d;
    private final ocq e;

    public LazyLayoutBeyondBoundsModifierElement(ocq ocqVar, ocq ocqVar2, aii aiiVar) {
        this.e = ocqVar;
        this.d = ocqVar2;
        this.b = aiiVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new anz(this.e, this.d, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        anz anzVar = (anz) bijVar;
        anzVar.d = this.e;
        anzVar.c = this.d;
        anzVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        if (!a.ao(this.e, lazyLayoutBeyondBoundsModifierElement.e) || !a.ao(this.d, lazyLayoutBeyondBoundsModifierElement.d)) {
            return false;
        }
        boolean z = lazyLayoutBeyondBoundsModifierElement.a;
        return this.b == lazyLayoutBeyondBoundsModifierElement.b;
    }

    public final int hashCode() {
        return (((((this.e.hashCode() * 31) + this.d.hashCode()) * 31) + 1237) * 31) + this.b.hashCode();
    }
}
