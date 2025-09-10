package defpackage;

import android.graphics.Rect;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lmp implements Runnable {
    protected final Executor c;
    public final long d;
    protected final lmg e;
    protected final lss f;
    protected final int g;
    public final lly h;

    public lmp(lmg lmgVar, Executor executor, lly llyVar, int i, lss lssVar) {
        this.e = lmgVar;
        this.d = lmgVar.a.d();
        this.c = executor;
        this.h = llyVar;
        this.g = i;
        this.f = lssVar;
    }

    public static final Rect h(int i, int i2, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, i, i2);
        }
        Rect rect2 = new Rect(rect);
        if (rect.top > rect.bottom || rect.left > rect.right || rect.width() <= 0 || rect.height() <= 0) {
            return new Rect(0, 0, 0, 0);
        }
        rect2.left = Math.max(rect2.left, 0);
        rect2.top = Math.max(rect2.top, 0);
        rect2.right = Math.max(Math.min(rect2.right, i), rect2.left);
        rect2.bottom = Math.max(Math.min(rect2.bottom, i2), rect2.top);
        return (rect2.width() <= 0 || rect2.height() <= 0) ? new Rect(0, 0, 0, 0) : rect2;
    }

    public static final Rect i(poj pojVar, Rect rect) {
        return h(pojVar.c(), pojVar.b(), rect);
    }

    public final void j(long j, nw nwVar, int i) {
        this.h.k.b(new lmo(j, nwVar, i));
    }
}
