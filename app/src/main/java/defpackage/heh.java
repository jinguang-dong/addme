package defpackage;

import com.google.android.apps.camera.debug.shottracker.db.ShotDatabase;
import java.util.concurrent.ExecutorService;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heh implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public heh(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                dcn dcnVarF = cvz.f(((imm) this.a).b(), ShotDatabase.class, "shot_db");
                dcnVarF.d();
                ShotDatabase shotDatabase = (ShotDatabase) dcnVarF.a();
                shotDatabase.getClass();
                break;
            case 6:
                break;
            case 8:
                hbj hbjVar = (hbj) this.a.a();
                int i = true == hbjVar.p(gyw.b) ? 3 : 1;
                if (hbjVar.p(gyw.c)) {
                    i |= 4;
                }
                break;
            case 9:
                gzi gziVar = gyw.a;
                break;
            case 13:
                hkv hkvVar = (hkv) tzs.b(this.a).a();
                hkvVar.getClass();
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                our ourVar = (our) this.a.a();
                ExecutorService executorServiceBZ = ojl.bZ("FeatureCentral");
                ouy ouyVar = new ouy(executorServiceBZ);
                executorServiceBZ.getClass();
                ourVar.d(new ffy(executorServiceBZ, 15));
                break;
        }
        return hgc.e((hlg) this.a.a());
    }
}
