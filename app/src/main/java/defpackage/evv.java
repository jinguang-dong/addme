package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evv implements evh {
    private final Context a;
    private final Class b;

    public evv(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.evh
    public final evg b(evl evlVar) {
        Class cls = this.b;
        return new evx(this.a, evlVar.a(File.class, cls), evlVar.a(Uri.class, cls), cls);
    }
}
