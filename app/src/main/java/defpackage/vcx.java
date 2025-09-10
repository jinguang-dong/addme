package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcx implements vdb {
    public final /* synthetic */ vcy a;
    public final /* synthetic */ UrlResponseInfo b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vcx(vcy vcyVar, UrlResponseInfo urlResponseInfo, Object obj, int i) {
        this.d = i;
        this.a = vcyVar;
        this.b = urlResponseInfo;
        this.c = obj;
    }

    @Override // defpackage.vdb
    public final void a() {
        if (this.d == 0) {
            vcy vcyVar = this.a;
            Object obj = this.c;
            vcyVar.a.onRedirectReceived(vcyVar.d, this.b, (String) obj);
            return;
        }
        vcy vcyVar2 = this.a;
        vda vdaVar = vcyVar2.d;
        if (vdaVar.g.compareAndSet(5, 4)) {
            Object obj2 = this.c;
            vcyVar2.a.onReadCompleted(vdaVar, this.b, (ByteBuffer) obj2);
        }
    }
}
