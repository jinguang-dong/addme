package defpackage;

import android.content.Context;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nyf {
    public boolean a;
    public boolean b;
    public final float c;
    public float d;
    public int e;
    public boolean f;
    public boolean g;
    public long h;
    public int i;
    public final qaq j;
    private final View k;
    private final Vibrator l;
    private final boolean m;

    public nyf(Context context, View view) {
        qaq qaqVar = new qaq(view);
        this.a = true;
        this.b = true;
        this.d = 0.0f;
        this.e = 1;
        this.f = true;
        boolean z = false;
        this.g = false;
        this.k = view;
        this.j = qaqVar;
        this.c = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        this.l = vibrator;
        if (vibrator != null) {
            try {
                if (vibrator.areAllPrimitivesSupported(7, 1)) {
                    z = true;
                }
            } catch (RuntimeException unused) {
            }
        }
        this.m = z;
        view.setHapticFeedbackEnabled(!z);
    }

    public final void a(int i) {
        if (this.m) {
            this.k.performHapticFeedback(i, 1);
        }
    }
}
