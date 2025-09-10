package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import j$.util.DesugarArrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmt {
    public final float a;

    public nmt(float f, byte[] bArr) {
        this.a = f;
    }

    public final float a(float f) {
        return f * this.a;
    }

    public final boolean b(lno[] lnoVarArr, Rect rect) {
        int i = 0;
        if (lnoVarArr != null && rect != null) {
            int i2 = 0;
            for (Rect rect2 : (Rect[]) DesugarArrays.stream(lnoVarArr).map(new gbm(4)).toArray(new gud(i))) {
                if ((rect2.width() / rect.width()) * (rect2.height() / rect.height()) > this.a) {
                    i2++;
                }
            }
            if (i2 > 0) {
                return true;
            }
        }
        return false;
    }

    public nmt(lww lwwVar) {
        this.a = lwwVar.c;
    }

    public nmt(Window window) {
        WindowManager windowManager = (WindowManager) window.getContext().getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.a = displayMetrics.xdpi * displayMetrics.ydpi;
    }

    public nmt(float f) {
        a.I(f > 0.0f);
        this.a = f;
    }
}
