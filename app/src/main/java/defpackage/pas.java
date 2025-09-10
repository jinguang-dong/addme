package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pas implements Serializable {
    public final int a;
    public final int b;
    private volatile pas c;

    public pas(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public static pas f(Rect rect) {
        return new pas(rect.width(), rect.height());
    }

    public static pas g(Size size) {
        return new pas(size.getWidth(), size.getHeight());
    }

    public final float a() {
        return this.a / this.b;
    }

    public final long b() {
        return this.a * this.b;
    }

    public final Size c() {
        return new Size(this.a, this.b);
    }

    public final pas d() {
        return i() ? this : h();
    }

    public final pas e() {
        return j() ? this : h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            pas pasVar = (pas) obj;
            if (this.a == pasVar.a && this.b == pasVar.b) {
                return true;
            }
        }
        return false;
    }

    public final pas h() {
        pas pasVar = this.c;
        if (pasVar != null) {
            return pasVar;
        }
        pas pasVar2 = new pas(this.b, this.a, this);
        this.c = pasVar2;
        return pasVar2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final boolean i() {
        return this.a >= this.b;
    }

    public final boolean j() {
        return this.b >= this.a;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }

    private pas(int i, int i2, pas pasVar) {
        this.a = i;
        this.b = i2;
        this.c = pasVar;
    }
}
