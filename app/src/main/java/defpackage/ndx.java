package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import com.google.ar.core.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndx {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ ndx(int i, Integer num, Integer num2, Integer num3, Integer num4, int i2) {
        num3 = (i2 & 8) != 0 ? Integer.valueOf(R.dimen.freeway_animated_icon_half_size) : num3;
        int i3 = i2 & 2;
        num2 = (i2 & 4) != 0 ? null : num2;
        num = i3 != 0 ? null : num;
        num4 = (i2 & 16) != 0 ? null : num4;
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = num4;
    }

    public static final rwc a(Context context, Integer num, Integer num2) {
        int iQ;
        if (num == null) {
            return rvk.a;
        }
        Drawable drawable = context.getDrawable(num.intValue());
        AnimatedVectorDrawable animatedVectorDrawable = null;
        AnimatedVectorDrawable animatedVectorDrawable2 = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable2 != null) {
            if (num2 != null) {
                num2.intValue();
                iQ = -1;
            } else {
                iQ = qpt.Q(context, R.attr.colorSecondaryContainer, -16777216);
            }
            animatedVectorDrawable2.setTint(iQ);
            animatedVectorDrawable = animatedVectorDrawable2;
        }
        return rwc.i(animatedVectorDrawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ndx)) {
            return false;
        }
        ndx ndxVar = (ndx) obj;
        return this.a == ndxVar.a && a.ao(this.b, ndxVar.b) && a.ao(this.c, ndxVar.c) && a.ao(this.d, ndxVar.d) && a.ao(this.e, ndxVar.e);
    }

    public final int hashCode() {
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        int i = this.a;
        Integer num2 = this.c;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i2 = (i * 31) + iHashCode;
        Integer num3 = this.d;
        int iHashCode3 = ((((i2 * 31) + iHashCode2) * 31) + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "ShutterIconSet(baseIcon=" + this.a + ", enterAnimation=" + this.b + ", exitAnimation=" + this.c + ", iconHalfSize=" + this.d + ", iconTint=" + this.e + ")";
    }
}
