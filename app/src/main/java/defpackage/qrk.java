package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qrk implements rww {
    private final Context a;

    public qrk(Context context) {
        this.a = context;
    }

    @Override // defpackage.rww
    public final /* bridge */ /* synthetic */ Object fr() {
        Context context = this.a;
        return prt.f(context) ? rvk.a : rwc.j(new File(context.getFilesDir(), "primes/crash"));
    }
}
