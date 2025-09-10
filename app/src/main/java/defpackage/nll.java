package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.Window;
import android.view.WindowManager;
import java.util.Collections;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nll {
    public int a;
    public final Object b;
    public final Object c;

    public nll(Shader shader, ColorStateList colorStateList, int i) {
        this.c = shader;
        this.b = colorStateList;
        this.a = i;
    }

    public static final long l(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final float a() {
        return ((Window) this.b).getAttributes().screenBrightness;
    }

    public final void b() {
        rnt.s(this.a > 0);
        int i = this.a - 1;
        this.a = i;
        if (i == 0) {
            f(-1.0f);
        }
    }

    public final void c(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        f(f);
        this.a++;
    }

    public final void d(int i) {
        float fMin = (Math.min(0.6693f / Math.max(0.667f, Math.min((i / ((nmt) this.c).a) / 2.73949f, 1.0f)), 1.0f) - 0.6693f) * 3.0238888f;
        f(((1.0f - fMin) * 0.48f) + (fMin * 0.65f));
        this.a++;
    }

    public final void e() {
        f(1.0f);
        this.a++;
    }

    public final void f(float f) {
        Window window = (Window) this.b;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f;
        window.setAttributes(attributes);
    }

    public final boolean g() {
        return this.c != null;
    }

    public final boolean h() {
        Object obj;
        return this.c == null && (obj = this.b) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean i(int[] iArr) {
        if (!h()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.a) {
            return false;
        }
        this.a = colorForState;
        return true;
    }

    public final boolean j() {
        return g() || this.a != 0;
    }

    public final ku k(int i) {
        SparseArray sparseArray = (SparseArray) this.b;
        ku kuVar = (ku) sparseArray.get(i);
        if (kuVar != null) {
            return kuVar;
        }
        ku kuVar2 = new ku();
        sparseArray.put(i, kuVar2);
        return kuVar2;
    }

    public nll(Window window, nmt nmtVar) {
        this.a = 0;
        this.b = window;
        this.c = nmtVar;
    }

    public nll() {
        this.b = new SparseArray();
        this.a = 0;
        this.c = Collections.newSetFromMap(new IdentityHashMap());
    }
}
