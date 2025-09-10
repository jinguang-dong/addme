package defpackage;

import android.graphics.PointF;
import j$.util.Optional;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffa implements tzt {
    private final /* synthetic */ int a;

    public ffa(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new ezh((byte[]) null);
            case 1:
                return new szh();
            case 2:
                return new ovx(fhi.a);
            case 3:
                return new ovx(new fhb());
            case 4:
                return new gsn();
            case 5:
                return a.N();
            case 6:
                return new ovx(new PointF());
            case 7:
                return a.O();
            case 8:
                return a.O();
            case 9:
                return new fhg();
            case 10:
                return new szh();
            case 11:
                return a.O();
            case 12:
                syw sywVarA = ske.A(ojl.bZ("AllInBackgroundProc"));
                sywVarA.getClass();
                return sywVarA;
            case 13:
                syw sywVarA2 = ske.A(ojl.bZ("AllInCriticalProc"));
                sywVarA2.getClass();
                return sywVarA2;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.P();
            case 15:
                return gsn.aa();
            case 16:
                return new ovx(Optional.empty());
            case 17:
                swa swaVar = swa.a;
                swaVar.getClass();
                return swaVar;
            case 18:
                return a.Q();
            case 19:
                return a.Q();
            default:
                return a.N();
        }
    }
}
