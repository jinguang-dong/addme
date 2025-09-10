package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class czv {
    public float i;
    public float a = -1.0f;
    public float b = -1.0f;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public final czw j = new czw();

    public final void a(ViewGroup.LayoutParams layoutParams, int i, int i2) {
        czw czwVar = this.j;
        czwVar.width = layoutParams.width;
        czwVar.height = layoutParams.height;
        boolean z = false;
        boolean z2 = (czwVar.b || czwVar.width == 0) && this.a < 0.0f;
        if ((czwVar.a || czwVar.height == 0) && this.b < 0.0f) {
            z = true;
        }
        float f = this.a;
        if (f >= 0.0f) {
            layoutParams.width = Math.round(i * f);
        }
        float f2 = this.b;
        if (f2 >= 0.0f) {
            layoutParams.height = Math.round(i2 * f2);
        }
        if (this.i >= 0.0f) {
            if (z2) {
                layoutParams.width = Math.round(layoutParams.height * this.i);
                czwVar.b = true;
            }
            if (z) {
                layoutParams.height = Math.round(layoutParams.width / this.i);
                czwVar.a = true;
            }
        }
    }

    public final void b(ViewGroup.LayoutParams layoutParams) {
        czw czwVar = this.j;
        if (!czwVar.b) {
            layoutParams.width = czwVar.width;
        }
        if (!czwVar.a) {
            layoutParams.height = czwVar.height;
        }
        czwVar.b = false;
        czwVar.a = false;
    }

    public final String toString() {
        return String.format("PercentLayoutInformation width: %f height %f, margins (%f, %f,  %f, %f, %f, %f)", Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
