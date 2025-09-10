package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ukv extends ukt implements uks {
    public static final ukv d = new ukv(1, 0);

    public ukv(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.ukt, defpackage.uks
    public final boolean b() {
        return this.a > this.b;
    }

    public final Integer c() {
        return Integer.valueOf(this.b);
    }

    public final Integer d() {
        return Integer.valueOf(this.a);
    }

    @Override // defpackage.ukt
    public final boolean equals(Object obj) {
        if (obj instanceof ukv) {
            if (b() && ((ukv) obj).b()) {
                return true;
            }
            ukv ukvVar = (ukv) obj;
            return this.a == ukvVar.a && this.b == ukvVar.b;
        }
        return false;
    }

    @Override // defpackage.ukt
    public final int hashCode() {
        if (b()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.ukt
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
