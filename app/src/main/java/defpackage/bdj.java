package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bdj {
    public static final void a(bdk bdkVar, int i, Object obj) {
        bdkVar.e[(bdkVar.f - bdkVar.a[bdkVar.b - 1].c) + i] = obj;
    }

    public static final void b(bdk bdkVar, int i, Object obj, int i2, Object obj2) {
        int i3 = bdkVar.f - bdkVar.a[bdkVar.b - 1].c;
        Object[] objArr = bdkVar.e;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final void c(bdk bdkVar, Object obj, Object obj2, Object obj3) {
        int i = bdkVar.f - bdkVar.a[bdkVar.b - 1].c;
        Object[] objArr = bdkVar.e;
        objArr[i] = obj;
        objArr[i + 1] = obj2;
        objArr[i + 2] = obj3;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
