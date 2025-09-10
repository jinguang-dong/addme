package defpackage;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import j$.time.Duration;
import j$.util.Optional;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gla implements tzt {
    private final tzx a;
    private final /* synthetic */ int b;

    public gla(tzx tzxVar, int i) {
        this.b = i;
        this.a = tzxVar;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() throws NumberFormatException {
        Object obj;
        switch (this.b) {
            case 0:
                return new glf(((luj) this.a.a()).a(luf.U));
            case 1:
                return new glf(((luj) this.a.a()).a(luf.T));
            case 2:
                owf owfVarA = owb.a((owq) this.a.a());
                owfVarA.getClass();
                return owfVarA;
            case 3:
                owf owfVarA2 = owb.a((owq) this.a.a());
                owfVarA2.getClass();
                return owfVarA2;
            case 4:
                return new ggg((mbj) this.a.a());
            case 5:
                return new gnw(((imr) this.a).a());
            case 6:
                tzj tzjVarB = tzs.b(this.a);
                tzjVarB.getClass();
                return new goq(tzjVarB, 0);
            case 7:
                dcn dcnVarF = cvz.f(((imm) this.a).b(), CameraFatalErrorTrackerDatabase.class, "CameraFatalErrorTracker_db");
                dcnVarF.d();
                CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase = (CameraFatalErrorTrackerDatabase) dcnVarF.a();
                cameraFatalErrorTrackerDatabase.getClass();
                return cameraFatalErrorTrackerDatabase;
            case 8:
                return new cxb((mdy) this.a.a());
            case 9:
                tzx tzxVar = this.a;
                tzxVar.getClass();
                return new goq(tzxVar, 2);
            case 10:
                gqc gqcVar = (gqc) this.a.a();
                paw.a(gsn.class, "gcastartup");
                gqcVar.getClass();
                return gqcVar;
            case 11:
                return new gsk(((ixx) this.a).a());
            case 12:
                return new gsm(((ixx) this.a).a());
            case 13:
                return new gtb((Executor) this.a.a(), hmp.b());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new gup((hbj) this.a.a());
            case 15:
                hbj hbjVar = (hbj) this.a.a();
                hbjVar.getClass();
                return new ovx(hbjVar.p(hba.s) ? (Float) hbjVar.e(hba.t).orElse(Float.valueOf(1.0f)) : Float.valueOf(1.0f));
            case 16:
                return new hed(this.a, 1);
            case 17:
                return new hcc(((imv) this.a).b());
            case 18:
                hbj hbjVar2 = (hbj) this.a.a();
                Duration duration = pbt.a;
                qpr qprVar = new qpr();
                qprVar.a = (byte) (1 | qprVar.a);
                qprVar.c(pbt.a);
                qprVar.d(500);
                gzi gziVar = gzo.a;
                if (hbjVar2.a(gzo.s).isPresent()) {
                    qprVar.c(Duration.ofMillis(((Integer) r1.get()).intValue()));
                }
                Optional optionalA = hbjVar2.a(gzo.t);
                if (optionalA.isPresent()) {
                    qprVar.d(((Integer) optionalA.get()).intValue());
                }
                if (qprVar.a != 3 || (obj = qprVar.c) == null) {
                    throw new IllegalStateException();
                }
                return new pbt((Duration) obj, qprVar.b);
            case 19:
                int i = hct.a;
                gzi gziVar2 = gzo.a;
                sfd sfdVar = sfd.a;
                sfdVar.getClass();
                return sfdVar;
            default:
                hep hepVarA = ((heq) this.a).a();
                hepVarA.m();
                return hepVarA;
        }
    }
}
