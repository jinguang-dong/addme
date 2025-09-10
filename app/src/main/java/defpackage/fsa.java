package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import com.google.ar.core.R;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsa implements tzt {
    private final /* synthetic */ int a;

    public fsa(int i) {
        this.a = i;
    }

    public static final ouu b() {
        final szh szhVar = new szh();
        out.b.execute(new Runnable() { // from class: fsj
            @Override // java.lang.Runnable
            public final void run() {
                Choreographer choreographer = Choreographer.getInstance();
                final szh szhVar2 = szhVar;
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: fsk
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        szhVar2.e(fsq.b);
                    }
                });
            }
        });
        return new fsi(new fst(out.a, szhVar), true != hmp.b().a(hbc.DOGFOOD) ? 128 : 512);
    }

    public static rxc c() {
        rxc rxcVar = rvj.a;
        rxcVar.getClass();
        return rxcVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                ScheduledExecutorService scheduledExecutorService = frp.a;
                return new fsd(ojl.cc("00UiWorker"));
            case 1:
                ScheduledExecutorService scheduledExecutorService2 = frp.a;
                return ojl.bV(ojl.bZ("pck-temporal-binning"));
            case 2:
                return new HandlerThread("HelperThread");
            case 3:
                return new Handler(Looper.getMainLooper());
            case 4:
                throw null;
            case 5:
                return new out(b());
            case 6:
                szh szhVar = new szh();
                fta.a(szhVar, "CameraDevice");
                return szhVar;
            case 7:
                return ojl.cc("GcaFeatureInit");
            case 8:
                szh szhVar2 = new szh();
                fta.a(szhVar2, "FirstInteractivity");
                return szhVar2;
            case 9:
                szh szhVar3 = new szh();
                fta.a(szhVar3, "Permissions");
                return szhVar3;
            case 10:
                ExecutorService executorServiceBZ = ojl.bZ(OPuAVreQM.uOnPdKylzV);
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 11:
                return a.O();
            case 12:
                return new ovx(Integer.valueOf(R.drawable.gs_night_sight_auto_vd_theme_24));
            case 13:
                return a.O();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new pfl((byte[]) null, (char[]) null, (byte[]) null);
            case 15:
                return new ovx(fuu.DISABLED);
            case 16:
                return new ovx(Float.valueOf(0.0f));
            case 17:
                throw null;
            case 18:
                return new fut(c());
            case 19:
                return new pfl((char[]) null, (byte[]) null);
            default:
                return ojl.cb("VidMedCod", 2);
        }
    }
}
