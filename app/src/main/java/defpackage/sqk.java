package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class sqk implements tpl {
    private final /* synthetic */ int v;
    static final tpl u = new sqk(20);
    static final tpl t = new sqk(19);
    static final tpl s = new sqk(18);
    static final tpl r = new sqk(17);
    static final tpl q = new sqk(16);
    static final tpl p = new sqk(15);
    static final tpl o = new sqk(14);
    static final tpl n = new sqk(13);
    static final tpl m = new sqk(12);
    static final tpl l = new sqk(11);
    static final tpl k = new sqk(10);
    static final tpl j = new sqk(9);
    static final tpl i = new sqk(8);
    static final tpl h = new sqk(7);
    static final tpl g = new sqk(6);
    static final tpl f = new sqk(5);
    static final tpl e = new sqk(4);
    static final tpl d = new sqk(3);
    static final tpl c = new sqk(2);
    static final tpl b = new sqk(1);
    static final tpl a = new sqk(0);

    private sqk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.tpl
    public final boolean a(int i2) {
        switch (this.v) {
            case 0:
                return a.aJ(i2);
            case 1:
                return a.aN(i2);
            case 2:
                return a.aJ(i2);
            case 3:
                return (i2 != 0 ? i2 != 1 ? i2 != 2 ? null : sqn.NOT_HEEDED : sqn.HEEDED : sqn.UNKNOWN_STATUS) != null;
            case 4:
                return a.aO(i2);
            case 5:
                return a.aN(i2);
            case 6:
                return a.aN(i2);
            case 7:
                return a.aL(i2);
            case 8:
                return a.aM(i2);
            case 9:
                return a.av(i2) != 0;
            case 10:
                return a.aD(i2) != 0;
            case 11:
                return a.aP(i2);
            case 12:
                return a.aL(i2);
            case 13:
                return ske.l(i2);
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.aJ(i2);
            case 15:
                return a.aJ(i2);
            case 16:
                return a.aN(i2);
            case 17:
                return a.aL(i2);
            case 18:
                return a.aJ(i2);
            case 19:
                return a.aN(i2);
            default:
                return a.aJ(i2);
        }
    }
}
