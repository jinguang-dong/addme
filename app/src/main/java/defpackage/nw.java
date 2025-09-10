package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nw {
    public final int a;
    public final int b;
    public final Object c;

    public nw(int i, int i2, Object obj) {
        this.a = i;
        this.b = i2;
        this.c = obj;
    }

    public final int a(boolean z) {
        return z ? this.b : this.a;
    }

    public nw(pao paoVar, int i, int i2) {
        this.c = paoVar;
        this.b = i2;
        this.a = i;
    }

    public nw(byte[] bArr, int i, int i2) {
        this.c = bArr;
        this.a = i;
        this.b = i2;
    }
}
