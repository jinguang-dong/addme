package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pld {
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public float f;
    public float g;
    public float h;

    public pld(int i, int i2, int i3, long j, long j2, float f, float f2, float f3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = f2;
        this.h = f3;
    }

    public final void a(pld pldVar) {
        this.a = pldVar.a;
        this.b = pldVar.b;
        this.c = pldVar.c;
        this.d = pldVar.d;
        this.e = pldVar.e;
        this.f = pldVar.f;
        this.g = pldVar.g;
        this.h = pldVar.h;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new pld(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pld)) {
            return false;
        }
        pld pldVar = (pld) obj;
        return this.a == pldVar.a && this.b == pldVar.b && this.c == pldVar.c && this.d == pldVar.d && this.e == pldVar.e && this.f == pldVar.f && this.g == pldVar.g && this.h == pldVar.h;
    }

    public pld() {
        this(0, 0, 0, 0L, 0L, 0.0f, 0.0f, 0.0f);
    }
}
