package defpackage;

import com.google.android.apps.camera.stats.ViewfinderJankSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqb implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public kqb(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new kqa(((tzz) this.a).a());
            case 1:
                return rwc.i((peo) ((Map) this.a.a()).get(lcz.YUV_TELE_ZOOM_RM));
            case 2:
                return new kqd((ViewfinderJankSession) this.a.a());
            case 3:
                return new kqe((ViewfinderJankSession) this.a.a());
            case 4:
                hbj hbjVar = (hbj) this.a.a();
                if (hbjVar.p(gzo.ad)) {
                    hbjVar.p(haa.H);
                }
                hbjVar.p(haa.ac);
                return 0L;
            case 5:
                hbj hbjVar2 = (hbj) this.a.a();
                if (hbjVar2.p(gzo.ad)) {
                    j = (true == hbjVar2.p(gzz.w) ? 65536L : 0L) | 259;
                }
                return Long.valueOf(j);
            case 6:
                gzg gzgVar = hah.a;
                return rwc.j(new jsv());
            case 7:
                return new pek(1, new ArrayList(((tzz) this.a).a()));
            case 8:
                rwc rwcVarB = ((gad) this.a).b();
                Object sfmVar = rwcVarB.h() ? new sfm((kit) rwcVarB.c()) : sfd.a;
                sfmVar.getClass();
                return sfmVar;
            case 9:
                return ((hef) this.a).b().booleanValue() ? qpt.ch(new pej(nvl.j, true)) : qpt.cl();
            case 10:
                hfn hfnVar = (hfn) this.a.a();
                hfnVar.getClass();
                hfnVar.b();
                return qpt.cl();
            case 11:
                return new ggg((kuj) this.a.a(), (byte[]) null);
            case 12:
                return new kwp((owf) this.a.a());
            case 13:
                return new pfl((hbj) this.a.a());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                our ourVar = (our) this.a.a();
                final kjc kjcVar = new kjc(1);
                ourVar.d(kjcVar);
                final ExecutorService executorServiceBZ = ojl.bZ("ActiveCamera");
                executorServiceBZ.getClass();
                ourVar.d(new khc(executorServiceBZ, 5));
                return new Executor() { // from class: kzs
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        if (kjcVar.a(new kzw(executorServiceBZ, runnable)).isCancelled()) {
                            throw new RejectedExecutionException("Queue already closed.");
                        }
                    }
                };
            case 15:
                gzi gziVar = gzo.a;
                return 35;
            case 16:
                HashMap map = new HashMap((Map) this.a.a());
                map.remove(lcz.PD);
                return new lat(map);
            case 17:
                return new lat((Map) this.a.a());
            case 18:
                return new lav((owq) this.a.a());
            case 19:
                return new szg((Executor) this.a.a());
            default:
                return qpt.cj(kzz.a((pjo) this.a.a()));
        }
    }
}
