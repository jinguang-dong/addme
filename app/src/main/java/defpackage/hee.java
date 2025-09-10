package defpackage;

import com.google.android.apps.camera.imax.cyclops.audio.xcIh.cdVQ;
import j$.time.Clock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hee implements tzt {
    private final /* synthetic */ int a;

    public hee(int i) {
        this.a = i;
    }

    public static final ExecutorService b() {
        return new ovb(hgc.b());
    }

    public static final syx c() {
        syx syxVarB = ske.B(hgc.b());
        syxVarB.getClass();
        return syxVarB;
    }

    public static Clock d() {
        Clock clockSystemUTC = Clock.systemUTC();
        clockSystemUTC.getClass();
        return clockSystemUTC;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                throw null;
            case 1:
                return peg.a;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                return new pbk();
            case 5:
                return new owi(false);
            case 6:
                return new hfs();
            case 7:
                return new Semaphore(1, true);
            case 8:
                return new pch(true);
            case 9:
                hgc.a();
                return hgc.class;
            case 10:
                return new hgs();
            case 11:
                return new ovx(hhv.SINGLE);
            case 12:
                return new ouy(ojl.bW("FaceBeau"));
            case 13:
                return new ouy(ojl.bZ("GpuFaceBeau"));
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ExecutorService executorServiceBZ = ojl.bZ("VsprAtvClbck");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 15:
                return new ouy(ojl.bW("FaceDeblur"));
            case 16:
                return hlg.b("feature.acmi.camera.ae-stability");
            case 17:
                return hlg.b(cdVQ.GvFR);
            case 18:
                return hlg.b("feature.acmi.camera.awb-stability");
            case 19:
                return hlg.b("feature.acmi.camera.face-count");
            default:
                return hlg.b("feature.acmi.camera.lens-stability");
        }
    }
}
