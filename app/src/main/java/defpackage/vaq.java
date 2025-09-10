package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vaq {
    public static final /* synthetic */ int a = 0;

    static {
        ukc.Q("0123456789abcdef");
    }

    public static final boolean a(vam vamVar, int i, byte[] bArr, int i2) {
        vamVar.getClass();
        bArr.getClass();
        byte[] bArr2 = vamVar.a;
        int i3 = vamVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                vamVar = vamVar.f;
                vamVar.getClass();
                byte[] bArr3 = vamVar.a;
                int i5 = vamVar.b;
                i3 = vamVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
