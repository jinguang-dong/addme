package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kly {
    public Rect a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public PointF f;
    public PointF g;
    public PointF h;
    public PointF i;
    public PointF j;
    public PointF k;
    public byte l;

    public final void a(int i) {
        this.b = i;
        this.l = (byte) (this.l | 1);
    }

    public final void b(boolean z) {
        this.e = z;
        this.l = (byte) (this.l | 8);
    }

    public final void c(int i) {
        this.d = i;
        this.l = (byte) (this.l | 4);
    }

    public final void d(int i) {
        this.c = i;
        this.l = (byte) (this.l | 2);
    }
}
