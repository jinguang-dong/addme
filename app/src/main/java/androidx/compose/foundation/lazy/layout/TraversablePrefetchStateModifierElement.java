package androidx.compose.foundation.lazy.layout;

import defpackage.a;
import defpackage.aov;
import defpackage.apq;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TraversablePrefetchStateModifierElement extends bwa {
    private final aov a;

    public TraversablePrefetchStateModifierElement(aov aovVar) {
        this.a = aovVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new apq(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((apq) bijVar).a = this.a;
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
