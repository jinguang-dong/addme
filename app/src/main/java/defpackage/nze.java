package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nze implements oaa {
    public static final /* synthetic */ int a = 0;
    private static final scn b = scn.H("http", "https");
    private final CronetEngine c;
    private final Executor d;
    private final boolean e;

    public nze(CronetEngine cronetEngine, Executor executor, boolean z) {
        this.c = cronetEngine;
        this.d = executor;
        this.e = z;
    }

    @Override // defpackage.oaa
    public final Set a() {
        return b;
    }

    @Override // defpackage.oaa
    public final obu b(String str) {
        szh szhVar = new szh();
        return new obu(this.c.newUrlRequestBuilder(str, new nzc(szhVar, this.e), this.d), szhVar);
    }
}
