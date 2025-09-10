package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface mhq {
    public static final Map b;

    static {
        sbr sbrVar = new sbr();
        sbrVar.f(0, mhp.NORMAL);
        sbrVar.f(1, mhp.HEAT_LIGHT);
        sbrVar.f(2, mhp.HEAT_MODERATE);
        sbrVar.f(3, mhp.HEAT_SEVERE);
        sbrVar.f(4, mhp.HEAT_CRITICAL);
        sbrVar.f(5, mhp.HEAT_EMERGENCY);
        sbrVar.f(6, mhp.HEAT_SHUTDOWN);
        b = sbrVar.b();
    }

    mhp a();

    paq d(mho mhoVar);
}
