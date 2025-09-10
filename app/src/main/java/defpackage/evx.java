package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class evx implements evg {
    private final Context a;
    private final evg b;
    private final evg c;
    private final Class d;

    public evx(Context context, evg evgVar, evg evgVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = evgVar;
        this.c = evgVar2;
        this.d = cls;
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return eoy.a((Uri) obj);
    }

    @Override // defpackage.evg
    public final /* bridge */ /* synthetic */ tdy b(Object obj, int i, int i2, eqm eqmVar) {
        Uri uri = (Uri) obj;
        return new tdy(new fai(uri), new evw(this.a, this.b, this.c, uri, i, i2, eqmVar, this.d));
    }
}
