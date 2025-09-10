package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aac {
    public static final Object a = new Object();

    public static final Object a(aab aabVar, int i) {
        Object obj;
        int iA = aae.a(aabVar.b, aabVar.d, i);
        if (iA < 0 || (obj = aabVar.c[iA]) == a) {
            return null;
        }
        return obj;
    }

    public static final void b(aab aabVar) {
        int i = aabVar.d;
        int[] iArr = aabVar.b;
        Object[] objArr = aabVar.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        aabVar.a = false;
        aabVar.d = i2;
    }
}
