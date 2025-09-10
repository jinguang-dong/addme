package defpackage;

import com.google.android.clockwork.common.wearable.wearmaterial.progressindicator.XlTc.IQwwK;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tpx {
    static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        ton.M(bArr);
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static void b(Object obj) {
        obj.getClass();
    }

    static void d(tqr tqrVar) {
        if (tqrVar instanceof tns) {
            throw null;
        }
    }

    static void c(Object obj) {
        if (obj == null) {
            throw new NullPointerException(IQwwK.tVcb);
        }
    }
}
