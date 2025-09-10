package defpackage;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngn implements paq {
    public final Surface a;
    public final boolean b;
    public final nps c;
    public final Consumer d;
    public final boolean e;
    public final int f;
    public final int g;
    public final Rect h;
    private final Size i;

    public ngn(Surface surface, boolean z, nps npsVar, Size size, Consumer consumer) {
        this.a = surface;
        this.b = z;
        this.c = npsVar;
        this.i = size;
        this.d = consumer;
        this.e = surface.isValid();
        this.f = size.getWidth();
        this.g = size.getHeight();
        this.h = new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
        this.a.release();
    }

    public final String toString() {
        return "VFSurface({size=" + this.i + ",mirror=" + this.b + ",surface=" + this.a + ")";
    }
}
