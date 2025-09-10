package defpackage;

import androidx.wear.ambient.AmbientMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rpa {
    public int a;
    public boolean b;
    public final Object c;

    public rpa(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }

    final boolean a(AmbientMode.AmbientController ambientController) {
        return ambientController != null && ((WeakReference) this.c).get() == ambientController;
    }

    public rpa(int i, AmbientMode.AmbientController ambientController) {
        this.c = new WeakReference(ambientController);
        this.a = i;
    }
}
