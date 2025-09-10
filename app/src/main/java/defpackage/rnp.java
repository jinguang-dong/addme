package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnp implements rnr {
    private final rnr a;
    private final float b;

    public rnp(float f, rnr rnrVar) {
        while (rnrVar instanceof rnp) {
            rnrVar = ((rnp) rnrVar).a;
            f += ((rnp) rnrVar).b;
        }
        this.a = rnrVar;
        this.b = f;
    }

    @Override // defpackage.rnr
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnp)) {
            return false;
        }
        rnp rnpVar = (rnp) obj;
        return this.a.equals(rnpVar.a) && this.b == rnpVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
