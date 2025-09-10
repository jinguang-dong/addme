package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pho implements url {
    final /* synthetic */ php a;
    final /* synthetic */ AtomicBoolean b;

    public pho(php phpVar, AtomicBoolean atomicBoolean) {
        this.a = phpVar;
        this.b = atomicBoolean;
    }

    @Override // defpackage.url
    public final /* synthetic */ Object a(Object obj, uhb uhbVar) throws Throwable {
        pbw pbwVar;
        Throwable pbzVar;
        qj qjVar = (qj) obj;
        php phpVar = this.a;
        Objects.toString(phpVar);
        Objects.toString(qjVar);
        if (phpVar.d.get()) {
            Objects.toString(phpVar);
            Objects.toString(qjVar);
            return ufg.a;
        }
        if (!a.ao(qjVar, qg.a)) {
            if (a.ao(qjVar, qf.a)) {
                if (phpVar.c) {
                    phpVar.g.a(pbw.CAMERA_DEVICE_ERROR_CAMERA_SERVICE);
                    phpVar.close();
                    return ufg.a;
                }
                this.b.set(true);
                phpVar.f.g(phpVar.a);
                phpVar.g.b = SystemClock.elapsedRealtimeNanos();
                phpVar.b.d();
            } else if (!a.ao(qjVar, qi.a)) {
                if (!a.ao(qjVar, qh.a)) {
                    qjVar.getClass();
                    qe qeVar = (qe) qjVar;
                    int i = qeVar.a;
                    if (a.p(i, 0)) {
                        return ufg.a;
                    }
                    if (a.p(i, 9)) {
                        return ufg.a;
                    }
                    if (a.p(i, 1)) {
                        pbwVar = pbw.CAMERA_ACCESS_CAMERA_IN_USE;
                    } else if (a.p(i, 2)) {
                        pbwVar = pbw.CAMERA_ACCESS_MAX_CAMERAS_IN_USE;
                    } else if (a.p(i, 3)) {
                        pbwVar = pbw.CAMERA_ACCESS_CAMERA_DISABLED;
                    } else if (a.p(i, 4)) {
                        pbwVar = pbw.CAMERA_DEVICE_ERROR_CAMERA_DEVICE;
                    } else if (a.p(i, 5)) {
                        pbwVar = pbw.CAMERA_DEVICE_ERROR_CAMERA_SERVICE;
                    } else if (a.p(i, 6)) {
                        pbwVar = pbw.CAMERA_ACCESS_CAMERA_DISCONNECTED;
                    } else if (a.p(i, 7)) {
                        pbwVar = pbw.CAMERA_CHARACTERISTICS_ILLEGAL_ARGUMENT;
                    } else if (a.p(i, 8)) {
                        pbwVar = pbw.CAMERA_SECURITY_EXCEPTION;
                    } else if (a.p(i, 9) || a.p(i, 10) || a.p(i, 11) || a.p(i, 12)) {
                        pbwVar = pbw.CAMERA_ERROR_CODE_UNKNOWN;
                    } else {
                        Log.w("CameraGraphState", "Unknown CameraError: ".concat(pk.a(i)));
                        pbwVar = pbw.CAMERA_ERROR_CODE_UNKNOWN;
                    }
                    if (qeVar.b) {
                        Objects.toString(phpVar);
                        Objects.toString(qjVar);
                        new Integer(0);
                    } else {
                        phpVar.g.a(pbwVar);
                        gop gopVar = phpVar.f;
                        pjr pjrVar = phpVar.a;
                        AtomicBoolean atomicBoolean = this.b;
                        gopVar.f(pjrVar, pbwVar, atomicBoolean.get());
                        pcm pcmVar = phpVar.b;
                        boolean z = atomicBoolean.get();
                        switch (pbwVar.ordinal()) {
                            case 13:
                                pbzVar = new pbz(pjrVar, pbwVar, z);
                                break;
                            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                                pbzVar = new pcb(pjrVar, pbwVar, z);
                                break;
                            case 15:
                                pbzVar = new pby(pjrVar, pbwVar, z);
                                break;
                            case 16:
                                pbzVar = new pbx(pjrVar, pbwVar, z);
                                break;
                            case 17:
                                pbzVar = new pca(pjrVar, pbwVar, z);
                                break;
                            default:
                                pbzVar = new pcc(pjrVar, pbwVar, z);
                                break;
                        }
                        pcmVar.e(pbzVar);
                    }
                } else if (this.b.get()) {
                    phpVar.g.a.b();
                    phpVar.f.h(phpVar.a);
                }
            }
        }
        return ufg.a;
    }
}
