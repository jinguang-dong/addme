package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ukt implements Iterable, ukd {
    public final int a;
    public final int b;
    public final int c;

    public ukt(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        if (i3 > 0) {
            if (i < i2) {
                i2 -= ske.aA(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                i2 += ske.aA(i, i2, -i3);
            }
        }
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ugd iterator() {
        return new uku(this.a, this.b, this.c);
    }

    public boolean b() {
        return this.c > 0 ? this.a > this.b : this.a < this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ukt) {
            if (b() && ((ukt) obj).b()) {
                return true;
            }
            ukt uktVar = (ukt) obj;
            return this.a == uktVar.a && this.b == uktVar.b && this.c == uktVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
