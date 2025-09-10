package defpackage;

import android.graphics.PointF;
import android.view.WindowInsetsAnimation;
import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sgh {
    public Object a;

    public sgh() {
    }

    public final void a(Object obj, Object obj2) {
        if (this.a != obj) {
            throw new ConcurrentModificationException();
        }
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.AutoCloseable, java.lang.Object] */
    public final synchronized AutoCloseable b(AutoCloseable autoCloseable) {
        ?? r0;
        r0 = this.a;
        this.a = autoCloseable;
        return r0;
    }

    public final AutoCloseable c() {
        return b(null);
    }

    public final void d() {
        AutoCloseable autoCloseableC = c();
        if (autoCloseableC != null) {
            ((pkf) autoCloseableC).l();
        }
    }

    public final void e() {
        this.a = new PointF(-1.0f, -1.0f);
    }

    public final boolean f(PointF pointF) {
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            return false;
        }
        if (Math.abs(pointF.x - ((PointF) this.a).x) <= 0.005f && Math.abs(pointF.y - ((PointF) this.a).y) <= 0.005f) {
            return false;
        }
        this.a = pointF;
        return true;
    }

    public final float g() {
        return ((WindowInsetsAnimation) ((ocq) this.a).a).getInterpolatedFraction();
    }

    public final int h() {
        return ((WindowInsetsAnimation) ((ocq) this.a).a).getTypeMask();
    }

    public final long i() {
        return ((WindowInsetsAnimation) ((ocq) this.a).a).getDurationMillis();
    }

    public sgh(ofc ofcVar) {
        this.a = ofcVar;
    }

    public sgh(byte[] bArr, char[] cArr) {
        this.a = null;
    }

    public sgh(WindowInsetsAnimation windowInsetsAnimation) {
        this.a = new ocq(new WindowInsetsAnimation(0, null, 0L));
        this.a = new ocq(windowInsetsAnimation);
    }

    public sgh(short[] sArr) {
        this.a = new PointF(-1.0f, -1.0f);
    }
}
