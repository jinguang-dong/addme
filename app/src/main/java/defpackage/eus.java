package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eus implements evh {
    private final /* synthetic */ int a;
    private final Object b;

    public eus(int i, byte[] bArr) {
        this.a = i;
        this.b = new eoz();
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.a;
        if (i == 0) {
            return new euw(this.b, 0);
        }
        if (i == 1) {
            return new evk(1);
        }
        Object obj = this.b;
        if (i != 2) {
            return new eur((Context) obj, evlVar.a(Integer.class, InputStream.class), 3);
        }
        return new eur((Context) obj, evlVar.a(Integer.class, AssetFileDescriptor.class), 3);
    }

    public eus(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
