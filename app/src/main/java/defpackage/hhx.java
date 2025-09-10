package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhx extends ImageView {
    public final AccessibilityManager a;
    public final int b;
    public final int c;
    public float d;
    public float e;

    public hhx(Context context) {
        super(context);
        this.a = (AccessibilityManager) context.getSystemService("accessibility");
        this.b = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_icon_size);
        this.c = getResources().getDimensionPixelSize(R.dimen.evcomp_slider_knob_size);
    }

    public final void a(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.d = f;
        } else {
            throw new IllegalArgumentException("Illegal fraction: " + f);
        }
    }
}
