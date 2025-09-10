package defpackage;

import android.os.Environment;
import com.google.android.apps.camera.stats.Instrumentation;
import j$.util.Optional;
import java.io.File;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class meb implements tzt {
    private final /* synthetic */ int a;

    public meb(int i) {
        this.a = i;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.a) {
            case 0:
                return new mdz();
            case 1:
                return new Instrumentation();
            case 2:
                return new pql();
            case 3:
                return new mfl();
            case 4:
                return new mfq();
            case 5:
                return new mfs(new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Camera"));
            case 6:
                return new ovx(Boolean.FALSE);
            case 7:
                return new ovx(mhg.INACTIVE);
            case 8:
                return a.O();
            case 9:
                return a.O();
            case 10:
                return a.Q();
            case 11:
                ExecutorService executorServiceBZ = ojl.bZ("trk-deinit");
                executorServiceBZ.getClass();
                return executorServiceBZ;
            case 12:
                ExecutorService executorServiceBZ2 = ojl.bZ("trk-analysis");
                executorServiceBZ2.getClass();
                return executorServiceBZ2;
            case 13:
                ExecutorService executorServiceBZ3 = ojl.bZ("trk-roi");
                executorServiceBZ3.getClass();
                return executorServiceBZ3;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.O();
            case 15:
                return a.O();
            case 16:
                return new mny();
            case 17:
                return a.O();
            case 18:
                return new ovx(mvt.STOP);
            case 19:
                return new ovx(Optional.empty());
            default:
                ExecutorService executorServiceBZ4 = ojl.bZ("hotshot-imgCap");
                executorServiceBZ4.getClass();
                return executorServiceBZ4;
        }
    }
}
