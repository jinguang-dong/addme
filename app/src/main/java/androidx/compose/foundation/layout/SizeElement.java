package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.ame;
import defpackage.bij;
import defpackage.bwa;
import defpackage.cht;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SizeElement extends bwa {
    private final float a;
    private final float b;
    private final float d;
    private final float e;
    private final boolean f;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new ame(this.a, this.b, this.d, this.e, this.f);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ame ameVar = (ame) bijVar;
        ameVar.a = this.a;
        ameVar.b = this.b;
        ameVar.c = this.d;
        ameVar.d = this.e;
        ameVar.e = this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return cht.b(this.a, sizeElement.a) && cht.b(this.b, sizeElement.b) && cht.b(this.d, sizeElement.d) && cht.b(this.e, sizeElement.e) && this.f == sizeElement.f;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + a.o(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SizeElement(float f, float f2, float f3, float f4, boolean z, int i) {
        f4 = (i & 8) != 0 ? Float.NaN : f4;
        f3 = (i & 4) != 0 ? Float.NaN : f3;
        this(1 == (i & 1) ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, f3, f4, z);
    }
}
