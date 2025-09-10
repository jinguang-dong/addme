package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class exb implements eqc {
    @Override // defpackage.eqc
    public final ImageHeaderParser$ImageType a(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.eqc
    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.eqc
    public final int c(InputStream inputStream, etl etlVar) throws Throwable {
        cue cueVar = new cue(inputStream);
        cuc cucVarA = cueVar.a("Orientation");
        int iA = 1;
        if (cucVarA != null) {
            try {
                iA = cucVarA.a(cueVar.j);
            } catch (NumberFormatException unused) {
            }
        }
        if (iA == 0) {
            return -1;
        }
        return iA;
    }

    @Override // defpackage.eqc
    public final int d(ByteBuffer byteBuffer, etl etlVar) {
        int i = fak.a;
        return c(new faj(byteBuffer), etlVar);
    }
}
