package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class exj implements eww {
    private final exi a;
    private final fan b;

    public exj(exi exiVar, fan fanVar) {
        this.a = exiVar;
        this.b = fanVar;
    }

    @Override // defpackage.eww
    public final void a(ete eteVar, Bitmap bitmap) throws IOException {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            eteVar.d(bitmap);
            throw iOException;
        }
    }

    @Override // defpackage.eww
    public final void b() {
        this.a.a();
    }
}
