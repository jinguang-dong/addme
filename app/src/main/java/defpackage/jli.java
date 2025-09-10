package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jli implements tzt {
    private final /* synthetic */ int a;

    public jli(int i) {
        this.a = i;
    }

    public static swb b() {
        swa swaVar = swa.a;
        swaVar.getClass();
        return swaVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new jlj();
            case 1:
                syw sywVarA = ske.A(ojl.bZ("mdd-download"));
                sywVarA.getClass();
                return sywVarA;
            case 2:
                return new jlz();
            case 3:
                return new pfl((byte[]) null, (char[]) null);
            case 4:
                return a.P();
            case 5:
                return a.O();
            case 6:
                return new ovx(new Pair(0L, false));
            case 7:
                throw null;
            case 8:
                return new AtomicBoolean(false);
            case 9:
                HandlerThread handlerThread = new HandlerThread("mv-timeout-handler");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 10:
                return a.Q();
            case 11:
                return hlg.b("feature.acmi.imu.camera-orientation");
            case 12:
                return hlg.b("feature.acmi.imu.camera-pose");
            case 13:
                return new jsb();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new jsv((byte[]) null);
            case 15:
                return new jta();
            case 16:
                return new qpt(bArr);
            case 17:
                return new ovx(juk.a);
            case 18:
                return a.O();
            case 19:
                return a.Q();
            default:
                return a.Q();
        }
    }
}
