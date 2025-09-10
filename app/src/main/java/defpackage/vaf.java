package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vaf implements Serializable, Comparable {
    public static final vaf a = new vaf(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public vaf(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final vaf d(String str) {
        vaf vafVar = new vaf(ukc.Q(str));
        vafVar.d = str;
        return vafVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.bv(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        vaf vafVar = new vaf(bArr);
        Field declaredField = vaf.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, vafVar.b);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int b() {
        return this.b.length;
    }

    public String c() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = var.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        vaf vafVar = (vaf) obj;
        vafVar.getClass();
        int iB = b();
        int iB2 = vafVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = vafVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iB == iB2) {
            return 0;
        }
        return iB >= iB2 ? 1 : -1;
    }

    public boolean e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ukc.U(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vaf) {
            vaf vafVar = (vaf) obj;
            int iB = vafVar.b();
            byte[] bArr = this.b;
            int length = bArr.length;
            return iB == length && vafVar.e(0, bArr, 0, length);
        }
        return false;
    }

    public byte[] f() {
        return this.b;
    }

    public boolean g(vaf vafVar, int i) {
        return vafVar.e(0, this.b, 0, i);
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
      0x0087: PHI (r4v12 int) = (r4v9 int), (r4v13 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
      0x008a: PHI (r4v10 int) = (r4v9 int), (r4v13 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
      0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vaf.toString():java.lang.String");
    }
}
