package androidx.compose.foundation.layout;

import defpackage.alt;
import defpackage.bij;
import defpackage.bko;
import defpackage.bwa;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetPxElement extends bwa {
    private final uiq a;

    public OffsetPxElement(uiq uiqVar) {
        this.a = uiqVar;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alt(this.a);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        alt altVar = (alt) bijVar;
        uiq uiqVar = altVar.a;
        uiq uiqVar2 = this.a;
        if (uiqVar != uiqVar2 || !altVar.b) {
            bko.v(altVar);
        }
        altVar.a = uiqVar2;
        altVar.b = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.a == offsetPxElement.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.a + ", rtlAware=true)";
    }
}
