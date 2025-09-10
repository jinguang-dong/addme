package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class qhv implements qhg, qhh {
    public final qfq a;
    public final qhf[] b;
    public final qhi c;
    private final int d;

    protected qhv(qhi qhiVar, qfq qfqVar, int i, int i2) {
        rnt.B(i2 >= (qfqVar.b() * i) * 8, "row stride that is shorter than row data size");
        this.c = qhiVar;
        this.a = qfqVar;
        this.d = i2;
        int[] iArr = {i * 8, i2};
        this.b = new qhf[i];
        for (int i3 = 0; i3 < i; i3++) {
            this.b[i3] = new qhf(this.c, i3 * 8, iArr);
        }
    }

    @Override // defpackage.qhg
    public final int a() {
        return ((this.d * this.a.a()) + 7) / 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhv)) {
            return false;
        }
        qhv qhvVar = (qhv) obj;
        return this.b.length == qhvVar.b.length && this.d == qhvVar.d && this.a.equals(qhvVar.a) && this.c.equals(qhvVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.length) * 31) + this.d) * 31) + this.c.hashCode();
    }

    protected qhv(qhi qhiVar, qfq qfqVar, int i) {
        this(qhiVar, qfqVar, i, i * 8 * qfqVar.b());
    }
}
