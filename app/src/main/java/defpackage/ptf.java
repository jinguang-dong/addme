package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ptf implements Comparator {
    private final /* synthetic */ int a;

    public /* synthetic */ ptf(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return Boolean.compare(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
            if (i == 2) {
                return qsp.B((pvl) obj).compareTo(qsp.B((pvl) obj2));
            }
            if (i == 3) {
                return qsp.B(((qao) obj).a).compareTo(qsp.B(((qao) obj2).a));
            }
            if (i == 4) {
                return qsp.B((pvp) obj).compareTo(qsp.B((pvp) obj2));
            }
            if (i != 5) {
                return ((Float) obj).compareTo((Float) obj2);
            }
            Object obj3 = ((qaq) obj).a;
            throw null;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        bArr.getClass();
        bArr2.getClass();
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i2 = 0; i2 < length; i2++) {
            byte b = bArr[i2];
            byte b2 = bArr2[i2];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }
}
