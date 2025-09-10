package androidx.compose.foundation.layout;

import defpackage.amg;
import defpackage.bij;
import defpackage.bwa;
import defpackage.cht;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UnspecifiedConstraintsElement extends bwa {
    private final float a;
    private final float b;

    public UnspecifiedConstraintsElement(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new amg(this.a, this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        amg amgVar = (amg) bijVar;
        amgVar.a = this.a;
        amgVar.b = this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return cht.b(this.a, unspecifiedConstraintsElement.a) && cht.b(this.b, unspecifiedConstraintsElement.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }
}
