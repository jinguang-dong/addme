package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmb {
    private static final bmo A;
    private static final bmo B;
    public static final float[] a;
    public static final float[] b;
    public static final bmo c;
    public static final bmo d;
    public static final bmn e;
    public static final bmn f;
    public static final bmn g;
    public static final bmn h;
    public static final bmn i;
    public static final bmn j;
    public static final bmn k;
    public static final bmn l;
    public static final bmn m;
    public static final bmn n;
    public static final bmn o;
    public static final bmn p;
    public static final bmn q;
    public static final bmn r;
    public static final blz s;
    public static final blz t;
    public static final bmn u;
    public static final bmn v;
    public static final bmn w;
    public static final blz x;
    public static final blz[] y;
    private static final float[] z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        z = fArr3;
        bmo bmoVar = new bmo(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        A = bmoVar;
        bmo bmoVar2 = new bmo(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        B = bmoVar2;
        bmo bmoVar3 = new bmo(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = bmoVar3;
        bmo bmoVar4 = new bmo(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = bmoVar4;
        bmp bmpVar = bmh.a;
        bmn bmnVar = new bmn("sRGB IEC61966-2.1", fArr, bmh.d, bmoVar, 0);
        e = bmnVar;
        bmn bmnVar2 = new bmn("sRGB IEC61966-2.1 (Linear)", fArr, bmh.d, 1.0d, 0.0f, 1.0f, 1);
        f = bmnVar2;
        bmn bmnVar3 = new bmn("scRGB-nl IEC 61966-2-2:2003", fArr, bmh.d, null, new bma(1), new bma(0), -0.799f, 2.399f, bmoVar, 2);
        g = bmnVar3;
        bmn bmnVar4 = new bmn("scRGB IEC 61966-2-2:2003", fArr, bmh.d, 1.0d, -0.5f, 7.499f, 3);
        h = bmnVar4;
        bmn bmnVar5 = new bmn("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, bmh.d, new bmo(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = bmnVar5;
        bmn bmnVar6 = new bmn("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, bmh.d, new bmo(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = bmnVar6;
        bmn bmnVar7 = new bmn("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new bmp(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        k = bmnVar7;
        bmn bmnVar8 = new bmn("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, bmh.d, bmoVar, 7);
        l = bmnVar8;
        bmn bmnVar9 = new bmn("NTSC (1953)", fArr2, bmh.a, new bmo(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        m = bmnVar9;
        bmn bmnVar10 = new bmn("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, bmh.d, new bmo(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        n = bmnVar10;
        bmn bmnVar11 = new bmn("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, bmh.d, 2.2d, 0.0f, 1.0f, 10);
        o = bmnVar11;
        bmn bmnVar12 = new bmn("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, bmh.b, new bmo(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = bmnVar12;
        bmn bmnVar13 = new bmn("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, bmh.c, 1.0d, -65504.0f, 65504.0f, 12);
        q = bmnVar13;
        bmn bmnVar14 = new bmn("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, bmh.c, 1.0d, -65504.0f, 65504.0f, 13);
        r = bmnVar14;
        bmq bmqVar = new bmq();
        s = bmqVar;
        bmi bmiVar = new bmi();
        t = bmiVar;
        bmn bmnVar15 = new bmn("None", fArr, bmh.d, bmoVar2, 16);
        u = bmnVar15;
        bmn bmnVar16 = new bmn("Hybrid Log Gamma encoding", fArr3, bmh.d, null, new bma(2), new bma(3), 0.0f, 1.0f, bmoVar3, 17);
        v = bmnVar16;
        bmn bmnVar17 = new bmn("Perceptual Quantizer encoding", fArr3, bmh.d, null, new bma(4), new bma(5), 0.0f, 1.0f, bmoVar4, 18);
        w = bmnVar17;
        bmj bmjVar = new bmj();
        x = bmjVar;
        y = new blz[]{bmnVar, bmnVar2, bmnVar3, bmnVar4, bmnVar5, bmnVar6, bmnVar7, bmnVar8, bmnVar9, bmnVar10, bmnVar11, bmnVar12, bmnVar13, bmnVar14, bmqVar, bmiVar, bmnVar15, bmnVar16, bmnVar17, bmjVar};
    }

    public static final double a(bmo bmoVar, double d2) {
        double dExp;
        double d3 = bmoVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = bmoVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = Math.pow(d6, bmoVar.c);
        } else {
            dExp = Math.exp((d5 - bmoVar.f) * bmoVar.d) + bmoVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(bmo bmoVar, double d2) {
        double d3 = 1.0d / bmoVar.b;
        double d4 = 1.0d / bmoVar.c;
        double d5 = 1.0d / bmoVar.d;
        double d6 = bmoVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : bmoVar.f + (d5 * Math.log(d8 - bmoVar.e)));
    }

    public static final double c(bmo bmoVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = bmoVar.d;
        double dPow = bmoVar.b + (bmoVar.c * Math.pow(d4, d5));
        return d3 * Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (bmoVar.e + (bmoVar.f * Math.pow(d4, d5))), bmoVar.g);
    }

    public static final double d(bmo bmoVar, double d2) {
        double d3 = -bmoVar.b;
        double d4 = 1.0d / bmoVar.g;
        double d5 = -bmoVar.f;
        double d6 = 1.0d / bmoVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (bmoVar.e * Math.pow(d8, d4)), 0.0d) / (bmoVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}
