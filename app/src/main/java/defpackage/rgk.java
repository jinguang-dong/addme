package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rgk implements tpl {
    private final /* synthetic */ int t;
    public static final tpl s = new rgk(18);
    public static final tpl r = new rgk(17);
    public static final tpl q = new rgk(16);
    public static final tpl p = new rgk(15);
    public static final tpl o = new rgk(14);
    public static final tpl n = new rgk(13);
    public static final tpl m = new rgk(12);
    public static final tpl l = new rgk(11);
    public static final tpl k = new rgk(10);
    public static final tpl j = new rgk(9);
    public static final tpl i = new rgk(8);
    public static final tpl h = new rgk(7);
    public static final tpl g = new rgk(6);
    public static final tpl f = new rgk(5);
    public static final tpl e = new rgk(4);
    public static final tpl d = new rgk(3);
    public static final tpl c = new rgk(2);
    public static final tpl b = new rgk(1);
    static final tpl a = new rgk(0);

    private rgk(int i2) {
        this.t = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        switch (this.t) {
            case 0:
                return a.aL(i2);
            case 1:
                return gyb.b(i2) != null;
            case 2:
                return a.aB(i2) != 0;
            case 3:
                return a.aJ(i2);
            case 4:
                return a.aB(i2) != 0;
            case 5:
                return a.aJ(i2);
            case 6:
                return soc.b(i2) != null;
            case 7:
                return a.aN(i2);
            case 8:
                return a.aD(i2) != 0;
            case 9:
                return a.aC(i2) != 0;
            case 10:
                return ssc.b(i2) != null;
            case 11:
                return a.aK(i2);
            case 12:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                        return true;
                    default:
                        return false;
                }
            case 13:
                return ske.l(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.aL(i2);
            case 15:
                return tag.b(i2) != null;
            case 16:
                return a.aD(i2) != 0;
            case 17:
                return a.aL(i2);
            default:
                return a.aN(i2);
        }
    }
}
