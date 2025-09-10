package defpackage;

import android.content.pm.PackageInfo;
import android.os.UserManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwk {
    public final long a;
    public final luj b;
    public final luj c;
    private final UserManager d;
    private final lwm e;
    private final uem f;
    private final hbj g;

    public lwk(UserManager userManager, hbj hbjVar, luj lujVar, luj lujVar2, lwm lwmVar, uem uemVar, PackageInfo packageInfo) {
        this.d = userManager;
        this.g = hbjVar;
        this.b = lujVar;
        this.c = lujVar2;
        this.e = lwmVar;
        this.f = uemVar;
        this.a = packageInfo.getLongVersionCode();
    }

    public final void a() {
        int i;
        int i2 = this.e.a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0 || i3 == 3) {
            lwf lwfVar = (lwf) this.f.a();
            if (((Integer) lwfVar.x.b(luf.aE)).intValue() > uac.b()) {
                ((sgt) lwf.a.c().M(4469)).u("Attempted HAL update for more than %d times. Skipping update.", uac.b());
                lwfVar.d();
                i = 4;
            } else {
                ske.W(ske.Q(new kbs(lwfVar, 2), lwfVar.h), new lwd(lwfVar, 0), lwfVar.k);
                i = 2;
            }
            lwm lwmVar = lwfVar.m;
            if (i != lwmVar.a) {
                lwmVar.a(i);
            }
        }
    }

    public final boolean b() {
        return this.d.isSystemUser() && this.g.p(gzo.bp) && !uac.a.fr().b();
    }
}
