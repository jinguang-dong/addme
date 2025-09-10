package androidx.compose.foundation.layout;

import defpackage.a;
import defpackage.alk;
import defpackage.bij;
import defpackage.bwa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class FillElement extends bwa {
    private final float a = 1.0f;
    private final int b;

    public FillElement(int i) {
        this.b = i;
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new alk(this.b);
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        alk alkVar = (alk) bijVar;
        alkVar.b = this.b;
        alkVar.a = 1.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.b != fillElement.b) {
            return false;
        }
        float f = fillElement.a;
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        a.aQ(i);
        return (i * 31) + Float.floatToIntBits(1.0f);
    }
}
