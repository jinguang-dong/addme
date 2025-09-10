package androidx.compose.foundation.layout;

import defpackage.alr;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class LayoutWeightElement extends bwa {
    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alr();
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        alr alrVar = (alr) bijVar;
        alrVar.a = 1.0f;
        alrVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null) != null;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + 1231;
    }
}
