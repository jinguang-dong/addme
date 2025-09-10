package defpackage;

import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npc implements tzt {
    private final /* synthetic */ int a;

    public npc(int i) {
        this.a = i;
    }

    public static final ozm b() {
        return new ozm(new MediaRecorder());
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new npt();
            case 1:
                return new ouy(ojl.bZ("VfeExecutor"));
            case 2:
                return new npy();
            case 3:
                return new nqa();
            case 4:
                return new nqm();
            case 5:
                return a.Q();
            case 6:
                return new mwq((byte[]) null);
            case 7:
                return new pfl();
            case 8:
                return new ojl();
            case 9:
                return new ojl();
            case 10:
                throw null;
            case 11:
                return new prh();
            case 12:
                return new pck();
            case 13:
                return new our();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new pfr();
            case 15:
                return new qpf((byte[]) null);
            case 16:
                return new ojl(null, null);
            case 17:
                return pqn.b();
            case 18:
                return ojl.cb("Camera-Ex", 4);
            case 19:
                HandlerThread handlerThread = new HandlerThread("Camera-Hndlr", -2);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            default:
                int i = plo.a;
                ovc ovcVarA = ovd.a();
                ovcVarA.a = "CXCP-BG";
                ovcVarA.b(-1);
                ovcVarA.c(4);
                return ojl.ca(ovcVarA.a());
        }
    }
}
