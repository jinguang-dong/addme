package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrc {
    public static final nqx a;
    private static final sbv c;
    private static final sbv d;
    public int b = nrd.a.h;

    static {
        tpc tpcVarM = nqx.a.m();
        int i = nrd.WCA_202402_00.h;
        if (!tpcVarM.b.C()) {
            tpcVarM.o();
        }
        ((nqx) tpcVarM.b).b = i;
        a = (nqx) tpcVarM.l();
        sbr sbrVar = new sbr();
        sbrVar.f(nkw.PHOTO, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.PORTRAIT, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.VIDEO, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.TIME_LAPSE, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.SLOW_MOTION, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.AMBER, Integer.valueOf(nrd.a.h));
        sbrVar.f(nkw.NIGHT_SIGHT, Integer.valueOf(nrd.a.h));
        c = sbrVar.b();
        sbr sbrVar2 = new sbr();
        sbrVar2.f(ltw.OFF, Integer.valueOf(nrd.a.h));
        sbrVar2.f(ltw.THREE, Integer.valueOf(nrd.a.h));
        sbrVar2.f(ltw.TEN, Integer.valueOf(nrd.a.h));
        sbrVar2.f(ltw.FIVE, Integer.valueOf(nrd.WCA_202402_00.h));
        d = sbrVar2.b();
    }

    public final int a(nkw nkwVar) {
        sbv sbvVar = c;
        if (!sbvVar.containsKey(nkwVar)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) sbvVar.get(nkwVar);
        num.getClass();
        return num.intValue();
    }

    public final boolean b() {
        sbv sbvVar = d;
        ltw ltwVar = ltw.FIVE;
        if (!sbvVar.containsKey(ltwVar)) {
            return false;
        }
        int i = this.b;
        Integer num = (Integer) sbvVar.get(ltwVar);
        num.getClass();
        return i >= num.intValue();
    }
}
