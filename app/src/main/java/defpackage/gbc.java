package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbc {
    final int a;
    final int b;

    gbc() {
        this.a = 255;
        this.b = 0;
    }

    public final float a(int i) {
        return i / this.a;
    }

    public final int b(int i, float f, boolean z) {
        float fExp;
        float f2 = this.a;
        float f3 = this.b;
        float f4 = f2 - f3;
        int iRound = (int) (Math.round(((((i - f3) / f4) * 12.0f <= 1.0f ? ((float) Math.sqrt(r3)) * 0.5f : (((float) Math.log(r3 - 0.28466892f)) * 0.17883277f) + 0.5599107f) * 65535.0f) + 0.0f) - (f * 65535.0f));
        double d = iRound;
        if ((d > 65535.0d ? 1.0d : d < 0.0d ? 0.0d : (d + 0.0d) / 65535.0d) < (true != z ? 0.0f : 0.3f)) {
            return i;
        }
        float f5 = (iRound + 0.0f) / 65535.0f;
        if (f5 <= 0.5f) {
            float f6 = f5 / 0.5f;
            fExp = f6 * f6;
        } else {
            fExp = ((float) Math.exp((f5 - 0.5599107f) / 0.17883277f)) + 0.28466892f;
        }
        return Math.round(f3 + (f4 * (fExp / 12.0f)));
    }

    public gbc(Context context) {
        this.a = (int) (ezh.e(context, "config_screenBrightnessSettingMaximumFloat", 1.0f) * 255.0f);
        this.b = (int) (ezh.e(context, "config_screenBrightnessSettingMinimumFloat", 0.0f) * 255.0f);
    }
}
