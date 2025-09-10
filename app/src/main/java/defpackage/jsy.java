package defpackage;

import android.graphics.PointF;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsy {
    private PointF a;
    private PointF b;
    private PointF c;

    public final synchronized float a() {
        PointF pointF = this.a;
        if (pointF != null && this.b != null) {
            return pointF.x - this.b.x;
        }
        return 0.0f;
    }

    public final synchronized float b() {
        PointF pointF = this.a;
        if (pointF != null && this.b != null) {
            return pointF.y - this.b.y;
        }
        return 0.0f;
    }

    public final synchronized void c(MotionEvent motionEvent) {
        PointF pointF = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        PointF pointF2 = this.b;
        this.c = pointF2;
        PointF pointF3 = this.a;
        this.b = pointF3;
        this.a = pointF;
        if (pointF3 == null) {
            this.b = pointF;
        }
        if (pointF2 == null) {
            this.c = pointF;
        }
    }

    public final synchronized void d() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
