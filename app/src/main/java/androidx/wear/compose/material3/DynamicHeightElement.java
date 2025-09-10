package androidx.wear.compose.material3;

import defpackage.bij;
import defpackage.bwa;
import defpackage.doy;
import defpackage.uif;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DynamicHeightElement extends bwa {
    private final uiq a;
    private final uif b;

    public DynamicHeightElement(uiq uiqVar, uif uifVar) {
        this.a = uiqVar;
        this.b = uifVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new doy(this.a, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        doy doyVar = (doy) bijVar;
        doyVar.b = this.b;
        doyVar.a = this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DynamicHeightElement)) {
            return false;
        }
        DynamicHeightElement dynamicHeightElement = (DynamicHeightElement) obj;
        return this.b == dynamicHeightElement.b && this.a == dynamicHeightElement.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
