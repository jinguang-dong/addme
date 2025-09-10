package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwu implements tzt {
    private final /* synthetic */ int a;

    public fwu(int i) {
        this.a = i;
    }

    public static final gsn b() {
        return new gsn();
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return a.O();
            case 1:
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            case 2:
                return new ovx(fyx.READY);
            case 3:
                return a.O();
            case 4:
                return new fxh();
            case 5:
                return new fzf();
            case 6:
                throw null;
            case 7:
                return new pfl(b());
            case 8:
                return new ggg();
            case 9:
                return new gbp();
            case 10:
                return new cxb((int[]) null, (byte[]) null);
            case 11:
                return new gey();
            case 12:
                return new gfs();
            case 13:
                return new ggp();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.O();
            case 15:
                return new ovx(Float.valueOf(-1.0f));
            case 16:
                return a.O();
            case 17:
                return a.O();
            case 18:
                return a.O();
            case 19:
                return new got((byte[]) null);
            default:
                return new ovx(rvk.a);
        }
    }
}
