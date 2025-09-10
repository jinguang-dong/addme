package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmf {
    public static final yq a;

    static {
        float[] fArr = bmb.a;
        bmn bmnVar = bmb.e;
        int i = bmnVar.c;
        bmc bmcVar = new bmc(bmnVar);
        bmn bmnVar2 = bmb.e;
        int i2 = bmnVar2.c;
        blz blzVar = bmb.x;
        int i3 = i2 | (blzVar.c << 6);
        bme bmeVar = new bme(bmnVar2, blzVar, 0);
        blz blzVar2 = bmb.x;
        int i4 = blzVar2.c;
        bmn bmnVar3 = bmb.e;
        int i5 = i4 | (bmnVar3.c << 6);
        bme bmeVar2 = new bme(blzVar2, bmnVar3, 0);
        yq yqVar = yr.a;
        yq yqVar2 = new yq((byte[]) null);
        yqVar2.f(i | (i << 6), bmcVar);
        yqVar2.f(i3, bmeVar);
        yqVar2.f(i5, bmeVar2);
        a = yqVar2;
    }
}
