package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evm implements evh {
    private final /* synthetic */ int a;
    private final Object b;

    public evm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new euw((Context) this.b, 5, (char[]) null) : new euw((Context) this.b, 4, (byte[]) null) : new evu((ejt) this.b) : new eur(this.b, evk.a, 2) : new eur(this.b, evlVar.a(Uri.class, InputStream.class), 2) : new euw(this.b, 2) : new eur(this.b, evlVar.a(Uri.class, AssetFileDescriptor.class), 2);
    }

    public evm(int i) {
        this.a = i;
        this.b = new ejt(500L);
    }
}
