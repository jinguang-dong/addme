package defpackage;

import android.graphics.Color;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum fkn {
    POSITION_GOOD_COLOR(new float[]{1.0f, 1.0f, 1.0f}),
    POSITION_BAD_COLOR(new float[]{0.8980392f, 0.08627451f, 0.1254902f});

    public final float[] c;

    fkn(float[] fArr) {
        this.c = fArr;
    }

    public static int a(float f) {
        float[] fArr = POSITION_GOOD_COLOR.c;
        float[] fArr2 = POSITION_BAD_COLOR.c;
        float fS = a.S(f - 1.0f);
        float f2 = 1.0f - fS;
        return Color.rgb((fArr[0] * fS) + (fArr2[0] * f2), (fArr[1] * fS) + (fArr2[1] * f2), (fArr[2] * fS) + (fArr2[2] * f2));
    }
}
