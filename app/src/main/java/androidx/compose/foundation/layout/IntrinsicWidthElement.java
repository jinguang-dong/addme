package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.alq;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class IntrinsicWidthElement extends bwa {
    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alq();
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        alq alqVar = (alq) bijVar;
        alqVar.b = 2;
        alqVar.a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null) != null;
    }

    public final int hashCode() {
        a.aQ(2);
        return 1293;
    }
}
