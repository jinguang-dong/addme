package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nvd implements tpl {
    private final /* synthetic */ int v;
    public static final tpl u = new nvd(20);
    public static final tpl t = new nvd(19);
    public static final tpl s = new nvd(18);
    public static final tpl r = new nvd(17);
    public static final tpl q = new nvd(16);
    public static final tpl p = new nvd(15);
    public static final tpl o = new nvd(14);
    public static final tpl n = new nvd(13);
    public static final tpl m = new nvd(12);
    public static final tpl l = new nvd(11);
    public static final tpl k = new nvd(10);
    public static final tpl j = new nvd(9);
    public static final tpl i = new nvd(8);
    public static final tpl h = new nvd(7);
    public static final tpl g = new nvd(6);
    public static final tpl f = new nvd(5);
    public static final tpl e = new nvd(4);
    public static final tpl d = new nvd(3);
    public static final tpl c = new nvd(2);
    public static final tpl b = new nvd(1);
    static final tpl a = new nvd(0);

    private nvd(int i2) {
        this.v = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return nwj.d(i2) != 0;
            case 1:
                return a.al(i2) != 0;
            case 2:
                return prh.b(i2) != 0;
            case 3:
                return a.aJ(i2);
            case 4:
                return a.aK(i2);
            case 5:
                return a.aK(i2);
            case 6:
                return a.aL(i2);
            case 7:
                return a.aK(i2);
            case 8:
                return pux.b(i2) != null;
            case 9:
                return a.aK(i2);
            case 10:
                return a.aK(i2);
            case 11:
                return a.aK(i2);
            case 12:
                return a.aL(i2);
            case 13:
                return a.aK(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.aK(i2);
            case 15:
                return a.aL(i2);
            case 16:
                return a.aL(i2);
            case 17:
                return pvk.b(i2) != null;
            case 18:
                return qsp.w(i2) != 0;
            case 19:
                return a.aL(i2);
            default:
                return a.aM(i2);
        }
    }
}
