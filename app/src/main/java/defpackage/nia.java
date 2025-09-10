package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nia {
    public static final long a = chp.C(16);
    public static final float b = 1.0f;
    public static final float c = 100.0f;
    public static final float d = 12.0f;
    public static final float e = 8.0f;
    public static final float f = 37.0f;
    public static final float g = 10.0f;
    public static final float h = 8.0f;

    public static final float a(ayc aycVar) {
        int i = ((Configuration) aycVar.e(AndroidCompositionLocals_androidKt.a)).smallestScreenWidthDp;
        if (i >= 400) {
            return 48.0f;
        }
        return i >= 360 ? 45.0f : 40.0f;
    }

    public static final float b(ayc aycVar) {
        if (((Configuration) aycVar.e(AndroidCompositionLocals_androidKt.a)).smallestScreenWidthDp > 400) {
            return 288.0f;
        }
        float fA = a(aycVar);
        float f2 = h;
        return ((r0 - (fA + fA)) - (f2 + f2)) - 10.0f;
    }
}
