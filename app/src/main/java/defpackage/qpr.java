package defpackage;

import android.graphics.Rect;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpr {
    public byte a;
    public int b;
    public Object c;

    public final qps a() {
        int i;
        Object obj;
        if (this.a != 1 || (i = this.b) == 0 || (obj = this.c) == null) {
            throw new IllegalStateException();
        }
        return new qps(i, (qpt) obj);
    }

    public final void b(boolean z) {
        this.b = true != z ? 2 : 3;
    }

    public final void c(Duration duration) {
        duration.getClass();
        this.c = duration;
    }

    public final void d(int i) {
        this.b = i;
        this.a = (byte) (this.a | 2);
    }

    public final mzv e() {
        Object obj;
        if (this.a != 1 || (obj = this.c) == null) {
            throw new IllegalStateException();
        }
        return new mzv((Rect) obj, this.b);
    }

    public final void f(int i) {
        this.b = i;
        this.a = (byte) 1;
    }
}
