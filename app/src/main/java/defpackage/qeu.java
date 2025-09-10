package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qeu {
    public final String a;
    public final qex b;
    public final int c;
    public final /* synthetic */ qay d;

    public qeu(qay qayVar, qex qexVar) {
        this.d = qayVar;
        int i = ((ByteBuffer) qayVar.a).getInt(qexVar.a);
        rnt.L(i > 0);
        rnt.M(i == 1 || i >= 8, "Box size too small");
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = ((ByteBuffer) qayVar.a).get(qexVar.a + 4 + i2);
        }
        String str = new String(bArr, StandardCharsets.US_ASCII);
        this.a = str;
        rnt.L(str.length() == 4);
        if (i == 1) {
            long j = ((ByteBuffer) qayVar.a).getLong(qexVar.a + 8);
            rnt.B(j < 2147483647L, "We don't support >2GB boxes (since we're using ByteBuffers).");
            i = (int) j;
            this.c = 16;
        } else {
            this.c = 8;
        }
        rnt.M(i <= qexVar.b, String.format(Locale.US, "Signalled box length %d does not fit length of %d", Integer.valueOf(this.c + i), Integer.valueOf(qexVar.b)));
        int i3 = qexVar.a;
        int i4 = this.c;
        this.b = new qex(i3 + i4, i - i4);
    }
}
