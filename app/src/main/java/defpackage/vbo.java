package defpackage;

import android.net.http.UrlResponseInfo;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class vbo implements vca {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ vbo(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.vca
    public final Object a() {
        if (this.c != 0) {
            return ((vbh) this.a).a.openConnection((URL) this.b);
        }
        vbt vbtVarB = vbt.b((UrlResponseInfo) this.b);
        vbq vbqVar = (vbq) this.a;
        vbqVar.a.onResponseStarted(vbqVar.b, vbtVarB);
        return null;
    }
}
