package defpackage;

import com.google.ar.core.ImageFormat;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class snl implements tpl {
    private final /* synthetic */ int v;
    static final tpl u = new snl(20);
    static final tpl t = new snl(19);
    static final tpl s = new snl(18);
    static final tpl r = new snl(17);
    static final tpl q = new snl(16);
    static final tpl p = new snl(15);
    static final tpl o = new snl(14);
    static final tpl n = new snl(13);
    static final tpl m = new snl(12);
    static final tpl l = new snl(11);
    static final tpl k = new snl(10);
    static final tpl j = new snl(9);
    static final tpl i = new snl(8);
    static final tpl h = new snl(7);
    static final tpl g = new snl(6);
    static final tpl f = new snl(5);
    static final tpl e = new snl(4);
    static final tpl d = new snl(3);
    static final tpl c = new snl(2);
    static final tpl b = new snl(1);
    static final tpl a = new snl(0);

    private snl(int i2) {
        this.v = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return a.aN(i2);
            case 1:
                return a.aJ(i2);
            case 2:
                return a.aO(i2);
            case 3:
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
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case ImageFormat.RGBA_FP16 /* 22 */:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case ImageFormat.YUV_420_888 /* 35 */:
                    case 36:
                    case 37:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return (i2 != 0 ? i2 != 1 ? i2 != 2 ? null : soa.BACK : soa.FRONT : soa.UNKNOWN_CAMERA_DIRECTION) != null;
            case 5:
                return ske.j(i2) != 0;
            case 6:
                if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 10 && i2 != 11) {
                    switch (i2) {
                        default:
                            switch (i2) {
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    return false;
                            }
                        case 20:
                        case 21:
                        case ImageFormat.RGBA_FP16 /* 22 */:
                            return true;
                    }
                }
                return true;
            case 7:
                return a.av(i2) != 0;
            case 8:
                return a.aN(i2);
            case 9:
                return a.aN(i2);
            case 10:
                return a.aL(i2);
            case 11:
                return a.aL(i2);
            case 12:
                return a.aI(i2);
            case 13:
                return a.aN(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.aK(i2);
            case 15:
                return a.aL(i2);
            case 16:
                return a.aJ(i2);
            case 17:
                return ske.l(i2);
            case 18:
                return a.aJ(i2);
            case 19:
                return a.aL(i2);
            default:
                return a.aK(i2);
        }
    }
}
