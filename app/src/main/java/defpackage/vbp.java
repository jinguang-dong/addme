package defpackage;

import android.net.http.UrlResponseInfo;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vbp implements vca {
    public final /* synthetic */ vbq a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vbp(vbq vbqVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = vbqVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.vca
    public final Object a() {
        if (this.d != 0) {
            UrlResponseInfo urlResponseInfo = this.b;
            vbq vbqVar = this.a;
            Object obj = this.c;
            vbt vbtVarB = vbt.b(urlResponseInfo);
            vbqVar.a.onReadCompleted(vbqVar.b, vbtVarB, (ByteBuffer) obj);
            return null;
        }
        UrlResponseInfo urlResponseInfo2 = this.b;
        vbq vbqVar2 = this.a;
        Object obj2 = this.c;
        vbt vbtVarB2 = vbt.b(urlResponseInfo2);
        vbqVar2.a.onRedirectReceived(vbqVar2.b, vbtVarB2, (String) obj2);
        return null;
    }
}
