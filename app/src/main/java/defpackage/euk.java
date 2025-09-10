package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class euk implements evh {
    private final /* synthetic */ int a;

    public euk(int i) {
        this.a = i;
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? new euw(evlVar.a(Uri.class, InputStream.class), 3) : new euw(evlVar.a(Uri.class, ParcelFileDescriptor.class), 3) : new euw(evlVar.a(Uri.class, AssetFileDescriptor.class), 3) : new eum() : new euw(new euj(1), 1) : new euw(new euj(0), 1);
    }
}
