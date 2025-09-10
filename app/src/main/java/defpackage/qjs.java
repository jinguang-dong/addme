package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjs {
    public static final qmu a = qmu.a(33321, 36756, 33325, 33326, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 36757, 33327, 33328, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 34837, 36221, 36239, 36215, 36233, 36209, 36227, 32856, 35907, 36759, 32855, 32854, 32857, 34842, 34836, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
    public static final qmu b;
    public final int c;

    static {
        qmu.a(33321, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 36194, 32856, 35907, 32855, 32854, 32857, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        b = qmu.a(33321, 36756, 33325, 33323, 36757, 33327, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 32856, 35907, 36759, 32855, 32854, 32857, 34842);
    }

    private qjs(int i) {
        rnt.B(a.b(i), a.bv(i, "Not a valid GL sized format: "));
        this.c = i;
    }

    public static qjs d(qhv qhvVar) {
        qhi qhiVar = qhvVar.c;
        int length = qhvVar.b.length;
        return length != 1 ? length != 2 ? length != 3 ? new qjs(32856) : new qjs(32849) : new qjs(33323) : new qjs(33321);
    }

    public final int a() {
        int i = this.c;
        if (i == 32849) {
            return 6407;
        }
        if (i == 33321) {
            return 6403;
        }
        if (i == 33323) {
            return 33319;
        }
        switch (i) {
            case 32854:
            case 32855:
            case 32856:
            case 32857:
                return 6408;
            default:
                throw new IllegalStateException("Cannot extract structure from GLFormat!");
        }
    }

    public final int b() {
        int i = this.c;
        if (i == 32849 || i == 33321 || i == 33323) {
            return 5121;
        }
        switch (i) {
            case 32854:
            case 32855:
            case 32856:
                return 5121;
            case 32857:
                return 33640;
            default:
                throw new IllegalStateException("Cannot extract type from GLFormat!");
        }
    }

    public final boolean c() {
        return b.b(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjs) && this.c == ((qjs) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "GLFormat[" + this.c + "]";
    }
}
