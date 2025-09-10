package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwm {
    public int a;
    public Object b;

    public lwm() {
        this.a = 1;
    }

    public final void a(int i) {
        this.a = i;
        Object obj = this.b;
        if (obj != null) {
            int i2 = i - 1;
            if (i2 == 2) {
                ((lwo) obj).d();
            } else {
                if (i2 != 3) {
                    return;
                }
                lwo lwoVar = (lwo) obj;
                lwoVar.c.c(new lmw(obj, 14));
                lwoVar.a.b = null;
                lwoVar.d.e(true);
            }
        }
    }

    public final int b(int i) {
        int i2 = this.a - 1;
        return i2 >= 0 ? ((int[]) this.b)[i2] : i;
    }

    public final int c() {
        Object obj = this.b;
        int i = this.a - 1;
        this.a = i;
        return ((int[]) obj)[i];
    }

    public final void d() {
        this.a = 0;
    }

    public final void e(int i) {
        Object objCopyOf = this.b;
        int i2 = this.a;
        int[] iArr = (int[]) objCopyOf;
        int length = iArr.length;
        if (i2 >= length) {
            objCopyOf = Arrays.copyOf(iArr, length + length);
            objCopyOf.getClass();
            this.b = objCopyOf;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        ((int[]) objCopyOf)[i3] = i;
    }

    public lwm(byte[] bArr) {
        this.b = new int[10];
    }
}
