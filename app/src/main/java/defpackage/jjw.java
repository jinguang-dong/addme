package defpackage;

import android.content.Context;
import com.google.ar.core.R;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjw {
    private static final Duration a = Duration.ofSeconds(3);
    private final nan b;
    private final imi c;

    public jjw(Context context, imi imiVar) {
        this.c = imiVar;
        nao naoVar = new nao();
        naoVar.e = context.getString(R.string.reset_dual_exposure_notification);
        naoVar.h = context;
        naoVar.j = 8;
        naoVar.a = false;
        naoVar.b = (int) a.toMillis();
        this.b = naoVar.a();
    }

    public final paq a() {
        return this.c.a(this.b);
    }
}
