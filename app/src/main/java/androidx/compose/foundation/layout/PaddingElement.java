package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.alu;
import defpackage.amo;
import defpackage.bij;
import defpackage.bwa;
import defpackage.cht;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class PaddingElement extends bwa {
    private final float a;
    private final float b;
    private final float d;
    private final float e;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.e = f4;
        if (!((f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3))) || !(f4 >= 0.0f || Float.isNaN(f4))) {
            amo.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alu(this.a, this.b, this.d, this.e);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        alu aluVar = (alu) bijVar;
        aluVar.a = this.a;
        aluVar.b = this.b;
        aluVar.c = this.d;
        aluVar.d = this.e;
        aluVar.e = true;
    }

    public final boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && cht.b(this.a, paddingElement.a) && cht.b(this.b, paddingElement.b) && cht.b(this.d, paddingElement.d) && cht.b(this.e, paddingElement.e);
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + a.o(true);
    }
}
