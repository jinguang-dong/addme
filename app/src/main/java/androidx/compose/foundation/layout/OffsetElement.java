package androidx.compose.foundation.layout;

import defpackage.als;
import defpackage.bij;
import defpackage.bko;
import defpackage.bwa;
import defpackage.cht;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OffsetElement extends bwa {
    private final float a;
    private final float b;

    public OffsetElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new als(this.a, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        als alsVar = (als) bijVar;
        float f = alsVar.a;
        float f2 = this.a;
        boolean zB = cht.b(f, f2);
        float f3 = this.b;
        if (!zB || !cht.b(alsVar.b, f3) || !alsVar.c) {
            bko.v(alsVar);
        }
        alsVar.a = f2;
        alsVar.b = f3;
        alsVar.c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && cht.b(this.a, offsetElement.a) && cht.b(this.b, offsetElement.b);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + 1231;
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) cht.a(this.a)) + ", y=" + ((Object) cht.a(this.b)) + ", rtlAware=true)";
    }
}
