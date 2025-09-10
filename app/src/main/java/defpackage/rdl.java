package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdl implements rch {
    private boolean a = false;

    static {
        new AtomicInteger();
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, rds] */
    @Override // defpackage.rch
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final File a(rcg rcgVar) throws IOException {
        if (this.a) {
            if (rcgVar.b()) {
                throw new rcw("Short circuit would skip transforms.");
            }
            return rcgVar.b.d((Uri) rcgVar.f);
        }
        rcv rcvVar = new rcv(new rdn().a(rcgVar));
        try {
            Closeable closeable = rcvVar.a;
            if (!(closeable instanceof rcr)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileA = ((rcr) closeable).a();
            rcvVar.close();
            return fileA;
        } catch (Throwable th) {
            try {
                rcvVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void c() {
        this.a = true;
    }
}
