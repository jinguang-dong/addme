package androidx.wear.compose.foundation.lazy.layout;

import androidx.wear.ambient.AmbientDelegate;
import defpackage.a;
import defpackage.bij;
import defpackage.bwa;
import defpackage.dni;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TraversablePrefetchStateModifierElement extends bwa {
    private final AmbientDelegate a;

    public TraversablePrefetchStateModifierElement(AmbientDelegate ambientDelegate) {
        this.a = ambientDelegate;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dni(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((dni) bijVar).a = this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && a.ao(this.a, ((TraversablePrefetchStateModifierElement) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.a + ')';
    }
}
