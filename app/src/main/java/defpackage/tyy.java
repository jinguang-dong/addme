package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tyy implements tpl {
    private final /* synthetic */ int v;
    public static final tpl u = new tyy(20);
    public static final tpl t = new tyy(19);
    public static final tpl s = new tyy(18);
    public static final tpl r = new tyy(17);
    public static final tpl q = new tyy(16);
    public static final tpl p = new tyy(15);
    public static final tpl o = new tyy(14);
    public static final tpl n = new tyy(13);
    public static final tpl m = new tyy(12);
    public static final tpl l = new tyy(11);
    public static final tpl k = new tyy(10);
    public static final tpl j = new tyy(9);
    public static final tpl i = new tyy(8);
    public static final tpl h = new tyy(7);
    public static final tpl g = new tyy(6);
    public static final tpl f = new tyy(5);
    public static final tpl e = new tyy(4);
    public static final tpl d = new tyy(3);
    public static final tpl c = new tyy(2);
    public static final tpl b = new tyy(1);
    public static final tpl a = new tyy(0);

    private tyy(int i2) {
        this.v = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        Enum r0 = null;
        switch (this.v) {
            case 0:
                return a.aP(i2);
            case 1:
                return a.aL(i2);
            case 2:
                return tzc.b(i2) != null;
            case 3:
                switch (i2) {
                    case 0:
                        r0 = tzf.NOT_SET;
                        break;
                    case 1:
                        r0 = tzf.CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 2:
                        r0 = tzf.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER;
                        break;
                    case 3:
                        r0 = tzf.LOGGER_OVERRIDE_PROVIDER;
                        break;
                    case 4:
                        r0 = tzf.LOGGER_DEFERRING_PROVIDER;
                        break;
                    case 5:
                        r0 = tzf.EVENT_OVERRIDE;
                        break;
                    case 6:
                        r0 = tzf.EVENT_DEFERRING;
                        break;
                    case 7:
                        r0 = tzf.LOG_SOURCE_MAPPED;
                        break;
                    case 8:
                        r0 = tzf.SERVER_INFRASTRUCTURE;
                        break;
                    case 9:
                        r0 = tzf.LOG_REQUEST_SETTER_WEB;
                        break;
                    case 10:
                        r0 = tzf.PRIVACY_CONTEXT_RESOLVER;
                        break;
                }
                return r0 != null;
            case 4:
                return a.aD(i2) != 0;
            case 5:
                return ujk.k(i2) != 0;
            case 6:
                return uxn.b(i2) != null;
            case 7:
                return a.aP(i2);
            case 8:
                return a.aM(i2);
            case 9:
                return a.aM(i2);
            case 10:
                return a.aL(i2);
            case 11:
                return a.aN(i2);
            case 12:
                return a.aO(i2);
            case 13:
                return a.aN(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.aP(i2);
            case 15:
                return a.aO(i2);
            case 16:
                if (i2 == 0) {
                    r0 = uzo.UNKNOWN;
                } else if (i2 == 1) {
                    r0 = uzo.CREDENTIAL_ENCRYPTED;
                } else if (i2 == 2) {
                    r0 = uzo.DEVICE_ENCRYPTED;
                }
                return r0 != null;
            case 17:
                return a.aP(i2);
            case 18:
                return a.aL(i2);
            case 19:
                return a.aJ(i2);
            default:
                return a.av(i2) != 0;
        }
    }
}
