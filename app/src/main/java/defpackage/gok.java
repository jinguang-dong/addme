package defpackage;

import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ShotParams;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gok implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gok(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, jgs] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, jhh] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, owf] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                ((gnt) this.a).c.add((goh) obj);
                break;
            case 1:
                krj krjVar = (krj) obj;
                krjVar.L.d(this.a.dK(new fnb(krjVar, 5), sxo.a));
                break;
            case 2:
                ((CameraFatalErrorTrackerDatabase) ((gox) this.a).c).y().b(new gpa((gpf) obj));
                break;
            case 3:
                float fFloatValue = ((Float) obj).floatValue();
                ShotParams shotParams = (ShotParams) this.a;
                GcamModuleJNI.ShotParams_little_cpu_freq_option_set(shotParams.a, shotParams, fFloatValue);
                break;
            case 4:
                this.a.a((jhh) obj);
                break;
            case 5:
                ((jgs) obj).a(this.a);
                break;
            case 6:
                int i2 = jgt.f;
                ((jgs) obj).a(this.a);
                break;
            case 7:
                ((sbk) this.a).h((jju) obj);
                break;
            case 8:
                Collection.EL.stream(((jjn) this.a).d).filter(new jjj((jjt) obj, false ? 1 : 0)).forEach(new irn(14));
                break;
            case 9:
                ((mtm) this.a).k(mtm.z((mtp) obj));
                break;
            case 10:
                jjv jjvVar = (jjv) obj;
                if (((jjn) this.a).e.dL() != lkk.AUTO) {
                    jjn.B(jjvVar, true);
                    break;
                }
                break;
            case 11:
                Object obj2 = this.a;
                ((jkx) obj2).q((jjt) obj).ifPresent(new jkr(obj2, i));
                break;
            case 12:
                jjt jjtVar = (jjt) obj;
                jkx jkxVar = (jkx) this.a;
                if (!jkxVar.q(jjtVar).isPresent()) {
                    jkxVar.s();
                    break;
                } else {
                    jkxVar.l.e(jjtVar, false, true);
                    break;
                }
            case 13:
                ((kgl) this.a).a.put((String) obj, true);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((kgl) this.a).a((String) obj);
                break;
            case 15:
                this.a.execute((Runnable) obj);
                break;
            case 16:
                ((ovx) this.a).a((Integer) obj);
                break;
            case 17:
                krz krzVar = (krz) obj;
                krj krjVar2 = (krj) this.a;
                if (krzVar.p(krjVar2) && krzVar.o(krjVar2)) {
                    z = true;
                }
                krzVar.ed(krjVar2.M, z);
                break;
            case 18:
                ((krj) this.a).o((krz) obj);
                break;
            case 19:
                krz krzVar2 = (krz) obj;
                owq owqVarJ = krzVar2.j();
                krs krsVarH = krzVar2.h();
                owqVarJ.dL();
                Object obj3 = this.a;
                ktd ktdVar = new ktd(obj3, krsVarH, i, null);
                krj krjVar3 = (krj) obj3;
                krjVar3.L.d(owqVarJ.dK(ktdVar, krjVar3.d));
                break;
            default:
                ((krz) obj).n((krj) this.a);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
