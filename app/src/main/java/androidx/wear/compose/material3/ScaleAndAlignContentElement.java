package androidx.wear.compose.material3;

import defpackage.bij;
import defpackage.bwa;
import defpackage.cht;
import defpackage.dqh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScaleAndAlignContentElement extends bwa {
    private final float a = 70.0f;

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ bij a() {
        return new dqh();
    }

    @Override // defpackage.bwa
    public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        ((dqh) bijVar).a = 70.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScaleAndAlignContentElement)) {
            return false;
        }
        float f = ((ScaleAndAlignContentElement) obj).a;
        return cht.b(70.0f, 70.0f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(70.0f);
    }
}
