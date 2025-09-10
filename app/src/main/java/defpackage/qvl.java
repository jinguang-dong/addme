package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qvl {
    public final float a;
    public final Object b;

    public qvl(float f, seo seoVar) {
        this.a = f;
        this.b = seoVar;
    }

    public qvl(Random random, float f) {
        boolean z = false;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        }
        rnt.B(z, "Sampling rate should be a floating number >= 0 and <= 1.");
        this.a = f;
        this.b = random;
    }
}
