package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdg implements rch {
    private final Executor a;
    private final qas b;

    public rdg(qas qasVar, Executor executor) {
        this.b = qasVar;
        this.a = executor;
    }

    @Override // defpackage.rch
    public final /* bridge */ /* synthetic */ Object a(rcg rcgVar) throws IOException {
        if (rcgVar.b()) {
            throw new rcw("Transforms are not supported by this Opener: ".concat(String.valueOf(String.valueOf(rcgVar.e))));
        }
        if (((lat) rcgVar.a).s((Uri) rcgVar.e)) {
            throw new IOException(new IllegalArgumentException("Requested file download is already a directory."));
        }
        return new rdf(rcgVar, this.b, this.a);
    }
}
