package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oxm {
    public final oxe a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public oxm(oxe oxeVar, int i, int i2, int i3, int i4) {
        this.a = oxeVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final String toString() {
        return "encoder=" + this.a.toString() + ", sampling rate=" + this.c + ", capture sample rate=" + this.d + ", bit rate=" + this.b + ", channels=" + this.e;
    }
}
