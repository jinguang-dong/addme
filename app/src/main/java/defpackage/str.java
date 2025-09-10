package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class str implements tpl {
    private final /* synthetic */ int v;
    public static final tpl u = new str(20);
    public static final tpl t = new str(19);
    public static final tpl s = new str(18);
    public static final tpl r = new str(17);
    public static final tpl q = new str(16);
    public static final tpl p = new str(15);
    public static final tpl o = new str(14);
    public static final tpl n = new str(13);
    static final tpl m = new str(12);
    static final tpl l = new str(11);
    static final tpl k = new str(10);
    static final tpl j = new str(9);
    static final tpl i = new str(8);
    static final tpl h = new str(7);
    static final tpl g = new str(6);
    static final tpl f = new str(5);
    static final tpl e = new str(4);
    static final tpl d = new str(3);
    static final tpl c = new str(2);
    static final tpl b = new str(1);
    static final tpl a = new str(0);

    private str(int i2) {
        this.v = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        Enum r0 = null;
        switch (this.v) {
            case 0:
                break;
            case 1:
                if (a.av(i2) != 0) {
                }
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                switch (i2) {
                    case 0:
                        r0 = sty.UNKNOWN;
                        break;
                    case 1:
                        r0 = sty.SLOWEST;
                        break;
                    case 2:
                        r0 = sty.SLOW;
                        break;
                    case 3:
                        r0 = sty.LITTLE_FAST;
                        break;
                    case 4:
                        r0 = sty.FAST;
                        break;
                    case 5:
                        r0 = sty.FASTEST;
                        break;
                    case 6:
                        r0 = sty.AUTO;
                        break;
                }
                if (r0 != null) {
                }
                break;
            case 6:
                if (a.aB(i2) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                if (i2 == 0) {
                    r0 = sui.NO_STABILIZATION;
                } else if (i2 == 1) {
                    r0 = sui.STEADY_FACE;
                } else if (i2 == 2) {
                    r0 = sui.STANDARD;
                } else if (i2 == 3) {
                    r0 = sui.d;
                } else if (i2 == 4) {
                    r0 = sui.LOCKED;
                } else if (i2 == 5) {
                    r0 = sui.ACTIVE;
                }
                if (r0 != null) {
                }
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                break;
            case 15:
                break;
            case 16:
                if (a.aA(i2) != 0) {
                }
                break;
            case 17:
                if (rkf.u(i2) != 0) {
                }
                break;
            case 18:
                if (sla.j(i2) != 0) {
                }
                break;
            case 19:
                if (a.aA(i2) != 0) {
                }
                break;
            default:
                if (sla.j(i2) != 0) {
                }
                break;
        }
        return true;
    }
}
