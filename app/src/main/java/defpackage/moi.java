package defpackage;

import android.content.res.Resources;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class moi implements fqa {
    public static final sgv a = sgv.g("moi");
    public final Resources b;
    public boolean c;
    public final hbw d;
    private final Consumer e;
    private final mof f;

    public moi(Consumer consumer, hbw hbwVar, Resources resources, luj lujVar, out outVar, hbj hbjVar, fdq fdqVar, mof mofVar) {
        this.e = consumer;
        this.d = hbwVar;
        this.b = resources;
        this.f = mofVar;
        if (hbjVar.p(gzo.bn)) {
            fdqVar.j().d(lujVar.a(luf.aN).dK(new leg(this, hbwVar, 8, null), outVar));
        }
    }

    @Override // defpackage.fqa
    public final void a() {
        this.e.d(new jko(this, 5));
        fqb fqbVarL = this.d.l();
        if (fqbVarL == null || fqbVarL.a() == null) {
            this.f.a();
        } else {
            this.f.b(fqbVarL.a().c());
        }
    }
}
