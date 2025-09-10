package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkg {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public rkg(Context context) {
        boolean zI = rnt.i(context, R.attr.elevationOverlayEnabled, false);
        int iQ = qpt.Q(context, R.attr.elevationOverlayColor, 0);
        int iQ2 = qpt.Q(context, R.attr.elevationOverlayAccentColor, 0);
        int iQ3 = qpt.Q(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zI;
        this.d = iQ;
        this.e = iQ2;
        this.b = iQ3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        float fMin = (this.f <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iR = qpt.R(cmg.e(i, 255), this.d, fMin);
        if (fMin > 0.0f && (i2 = this.e) != 0) {
            iR = cmg.d(cmg.e(i2, c), iR);
        }
        return cmg.e(iR, iAlpha);
    }

    public final int b(int i, float f) {
        return (this.a && cmg.e(i, 255) == this.b) ? a(i, f) : i;
    }
}
