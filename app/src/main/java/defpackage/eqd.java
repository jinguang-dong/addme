package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqd implements eqh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public eqd(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqh
    public final ImageHeaderParser$ImageType a(eqc eqcVar) throws IOException {
        if (this.b != 0) {
            try {
                return eqcVar.a((InputStream) this.a);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return eqcVar.b((ByteBuffer) this.a);
        } finally {
            fak.b((ByteBuffer) this.a);
        }
    }
}
