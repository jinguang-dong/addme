package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boj extends byi implements Iterable, ukd {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final List j;

    public boj(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        super((char[]) null);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = f6;
        this.h = f7;
        this.i = list;
        this.j = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof boj)) {
            boj bojVar = (boj) obj;
            return a.ao(this.a, bojVar.a) && this.b == bojVar.b && this.c == bojVar.c && this.d == bojVar.d && this.e == bojVar.e && this.f == bojVar.f && this.g == bojVar.g && this.h == bojVar.h && a.ao(this.i, bojVar.i) && a.ao(this.j, bojVar.j);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + this.i.hashCode()) * 31) + this.j.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new boi(this, 0);
    }

    public boj() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, bok.a, ufw.a);
    }
}
