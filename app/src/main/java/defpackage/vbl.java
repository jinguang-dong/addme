package defpackage;

import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vbl extends vdf {
    private static boolean b;

    private vbl(String str, Collection collection, RequestFinishedInfo.Metrics metrics, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    static void a(vbh vbhVar, String str, Collection collection, vdk vdkVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        vbhVar.a(new vbl(str, collection, new vcj(), i, urlResponseInfo, cronetException), vdkVar);
    }

    @Override // defpackage.vdf, org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        if (!b) {
            b = true;
        }
        return this.a;
    }
}
