package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tct {
    public static final tct a;
    public static final tct b;
    public static final tct c;
    public static final tct d;
    public static final tct e;
    public static final tct[] f;
    private static int h;
    public final int g;
    private final String i;

    private tct() {
        this.i = "kRaw10";
        this.g = 0;
        h = 1;
    }

    public final String toString() {
        return this.i;
    }

    static {
        tct tctVar = new tct();
        a = tctVar;
        tct tctVar2 = new tct("kRaw12");
        b = tctVar2;
        tct tctVar3 = new tct(MyBPCgKwEjJI.KlnlfF);
        c = tctVar3;
        tct tctVar4 = new tct("kRawRgb16");
        d = tctVar4;
        tct tctVar5 = new tct("kRawPlanar16");
        e = tctVar5;
        f = new tct[]{tctVar, tctVar2, tctVar3, tctVar4, tctVar5};
        h = 0;
    }

    private tct(String str) {
        this.i = str;
        int i = h;
        h = i + 1;
        this.g = i;
    }
}
