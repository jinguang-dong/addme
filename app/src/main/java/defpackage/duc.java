package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duc {
    public final int a;
    public final int b;
    private final int c;
    private final int d;

    static {
        new duc(0, 0, 0, 0);
    }

    public duc(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException("Left must be less than or equal to right, left: " + i + ", right: " + i3);
        }
        if (i2 <= i4) {
            return;
        }
        throw new IllegalArgumentException("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4);
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        duc ducVar = (duc) obj;
        return this.a == ducVar.a && this.b == ducVar.b && this.c == ducVar.c && this.d == ducVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "duc { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    public duc(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
