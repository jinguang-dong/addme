package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sgv extends sgm {
    public static final sgu b = new sgu();

    public sgv(sif sifVar) {
        super(sifVar);
    }

    @Deprecated
    public static sgv g(String str) {
        ske.f(!str.isEmpty(), "injected class name is empty");
        return new sgv(sjd.d(str.replace('/', '.')));
    }

    @Override // defpackage.sgm
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final sgt a(Level level) {
        boolean zE = e(level);
        sjd.n(this.a.a(), level, zE);
        return !zE ? b : new sgs(this, level);
    }
}
