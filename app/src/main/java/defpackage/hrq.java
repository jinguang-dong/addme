package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hrq {
    public RectF a;
    public RectF b;
    public long c;
    public long d;
    public Rect e;
    public byte f;
    public int g;
    private int h;
    private int i;

    public hrq() {
    }

    public final hrr a() {
        int i;
        RectF rectF;
        RectF rectF2;
        int i2;
        Rect rect;
        if (this.f != 7 || (i = this.g) == 0 || (rectF = this.a) == null || (rectF2 = this.b) == null || (i2 = this.i) == 0 || (rect = this.e) == null) {
            throw new IllegalStateException();
        }
        return new hrr(i, rectF, rectF2, i2, this.c, this.d, rect, this.h);
    }

    public final void b(int i) {
        if (i == 0) {
            throw null;
        }
        this.i = i;
    }

    public final void c(int i) {
        this.h = i;
        this.f = (byte) (this.f | 4);
    }

    public hrq(hrr hrrVar) {
        this.g = hrrVar.g;
        this.a = hrrVar.a;
        this.b = hrrVar.b;
        this.i = hrrVar.h;
        this.c = hrrVar.c;
        this.d = hrrVar.d;
        this.e = hrrVar.e;
        this.h = hrrVar.f;
        this.f = (byte) 7;
    }
}
