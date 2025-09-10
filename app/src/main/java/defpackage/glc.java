package defpackage;

import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ViewfinderProcessingOptions;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class glc implements pau {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ glc(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.media.AudioRouting, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r9v35, types: [java.lang.Object, owf] */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object, uem] */
    /* JADX WARN: Type inference failed for: r9v43, types: [java.lang.Object, owq] */
    /* JADX WARN: Type inference failed for: r9v47, types: [java.lang.Object, jsh] */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.lang.Object, owf] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        switch (this.c) {
            case 0:
                krj krjVar = (krj) this.b;
                if (((gld) this.a).p(krjVar)) {
                    krjVar.m(false, krs.AMETHYST);
                    break;
                }
                break;
            case 1:
                ((ges) this.b).a(this.a);
                break;
            case 2:
                ((gld) this.a).m();
                ((krj) this.b).m(false, krs.AMETHYST);
                break;
            case 3:
                ((gld) this.a).m();
                ((krj) this.b).m(false, krs.AMETHYST);
                break;
            case 4:
                ((glu) this.a).t();
                ((krj) this.b).m(false, krs.FPS);
                break;
            case 5:
                if (!((AtomicBoolean) this.b).compareAndSet(true, false)) {
                    glu gluVar = (glu) this.a;
                    if (!((Boolean) gluVar.c.dL()).booleanValue()) {
                        gluVar.j = true;
                        break;
                    }
                }
                break;
            case 6:
                glu gluVar2 = (glu) this.a;
                if (!gluVar2.u()) {
                    if (((nkw) gluVar2.f.dL()).a()) {
                        ((krj) this.b).m(false, krs.FPS);
                        break;
                    }
                } else {
                    owq owqVar = gluVar2.a;
                    ovx ovxVar = (ovx) owqVar;
                    owqVar.a(glu.x((ksa) ovxVar.d) ? (ksa) ovxVar.d : ksa.FPS_30);
                    krj krjVar2 = gluVar2.k;
                    krjVar2.getClass();
                    krjVar2.m(false, krs.FPS);
                    break;
                }
                break;
            case 7:
                krj krjVar3 = (krj) this.b;
                if (((glu) this.a).p(krjVar3)) {
                    krjVar3.m(false, krs.FPS);
                    break;
                }
                break;
            case 8:
                Object obj2 = this.a;
                if (this.b.test(obj2)) {
                    ((krj) obj2).m(false, krs.BACK_VIDEO_FLASH);
                    break;
                }
                break;
            case 9:
                gme gmeVar = (gme) this.a;
                if (!gmeVar.c) {
                    Object obj3 = this.b;
                    gmeVar.y();
                    ((krj) obj3).m(false, krs.p);
                    break;
                } else {
                    gmeVar.c = false;
                    break;
                }
            case 10:
                owq owqVar2 = ((gmg) this.a).b;
                ksa ksaVar = (ksa) obj;
                if (((ksa) owqVar2.dL()).equals(ksa.VIDEO_STABILIZATION_ACTIVE) && !ksaVar.equals(ksa.FPS_30)) {
                    ((sgt) gmg.a.c().M(978)).s("onMenuControllerReady.fpsMenuItem: fallback to standard stabilization.");
                    owqVar2.a(ksa.VIDEO_STABILIZATION_STANDARD);
                }
                ((krj) this.b).m(false, krs.VIDEO_STABILIZATION);
                break;
            case 11:
                owq owqVar3 = ((gmg) this.a).b;
                lty ltyVar = (lty) obj;
                if (((ksa) owqVar3.dL()).equals(ksa.VIDEO_STABILIZATION_ACTIVE) && !ltyVar.equals(lty.RES_1080P)) {
                    ((sgt) gmg.a.c().M(979)).s("onMenuControllerReady.resolutionSetting: fallback to standard stabilization.");
                    owqVar3.a(ksa.VIDEO_STABILIZATION_STANDARD);
                }
                ((krj) this.b).m(false, krs.VIDEO_STABILIZATION);
                break;
            case 12:
                ((gmg) this.a).b.a(ksa.VIDEO_STABILIZATION_STANDARD);
                ((krj) this.b).m(false, krs.VIDEO_STABILIZATION);
                break;
            case 13:
                Boolean bool = (Boolean) obj;
                hyh hyhVar = (hyh) this.a;
                if (!((Boolean) hyhVar.c.d).booleanValue()) {
                    hyhVar.a.a(false);
                    break;
                } else {
                    owq owqVar4 = hyhVar.a;
                    if (!bool.equals(((ovx) owqVar4).d) && !((ick) this.b.dL()).a) {
                        owqVar4.a(bool);
                        break;
                    }
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ViewfinderProcessingOptions viewfinderProcessingOptionsB = ((ice) this.a).fr();
                Gcam gcam = (Gcam) this.b;
                GcamModuleJNI.Gcam_ConfigureViewfinderProcessing(gcam.a, gcam, viewfinderProcessingOptionsB.a, viewfinderProcessingOptionsB);
                break;
            case 15:
                if (((Boolean) obj).booleanValue() && !((AtomicBoolean) this.a).getAndSet(true)) {
                    ((ivu) this.b.a()).a();
                    break;
                }
                break;
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    qpt.cu(this.b, (krj) this.a);
                    break;
                }
                break;
            case 17:
                if (((Boolean) obj).booleanValue()) {
                    Object obj4 = this.b;
                    Object obj5 = this.a;
                    ((pfz) obj4).close();
                    ((jmv) obj5).c.set(false);
                    break;
                }
                break;
            case 18:
                Long l = (Long) obj;
                jsk jskVar = (jsk) this.b;
                owq owqVar5 = jskVar.c;
                ovx ovxVar2 = (ovx) owqVar5;
                if (((Long) ovxVar2.d).longValue() != 0) {
                    long jLongValue = l.longValue();
                    long j = jskVar.b;
                    if (jLongValue > TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS)) {
                        if (jskVar.d == ltf.SQUAD_PRIMARY) {
                            gzi gziVar = gzq.a;
                        }
                        if (l.longValue() < TimeUnit.MICROSECONDS.convert(j + ((Long) ovxVar2.d).longValue(), TimeUnit.NANOSECONDS)) {
                            ?? r9 = this.a;
                            owqVar5.a(1500000000L);
                            jskVar.c(r9, jskVar.e, jsl.MV_BUTTON_MASH);
                            break;
                        }
                    }
                }
                break;
            case 19:
                int iIntValue = ((Integer) this.b.dL()).intValue();
                jug jugVar = (jug) this.a;
                jugVar.c.a(Boolean.valueOf(jugVar.a((muj) obj, iIntValue)));
                break;
            default:
                jug jugVar2 = (jug) this.a;
                jugVar2.c.a(Boolean.valueOf(jugVar2.a((muj) jugVar2.a.dL(), ((Integer) this.b.dL()).intValue())));
                break;
        }
    }

    public /* synthetic */ glc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
